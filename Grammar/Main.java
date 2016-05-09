
import code.*;
import gen.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Frederik on 23-03-2016.
 */
public class Main {
    public static void main(String[] args ) throws IOException {
        ANTLRFileStream input = new ANTLRFileStream("Coners.txt");
        GrammarLexer lex = new GrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree t = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        FuncSymbolTable FST = new FuncSymbolTable();
        FuncSymbolTable RoboFST = new FuncSymbolTable();
        SymbolTable ST = new SymbolTable();
        FuncListener FListener = new FuncListener(FST);
        SymbolTypeVisitor STVisitor = new SymbolTypeVisitor(ST, FST, RoboFST);
        ImportReservedFunctions(RoboFST);
        walker.walk(FListener, t);
        STVisitor.visit(t);
        CodeGen cg = new CodeGen(RoboFST);
        cg.visit(t);
    }

    public static void ImportReservedFunctions(FuncSymbolTable FST)
    {
        Path path = Paths.get("ReservedFunctions.txt");
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(s -> {
                String[] funcString = s.split("-");
                String[] funcId = funcString[0].split(" ");
                FuncSymbol FS = new FuncSymbol();
                FS.RoboCodeName = funcId[0];
                FS.Type = funcId[1];
                FS.Name = funcId[2];
                FS.ReturnType = funcId[3];

                if (funcString.length > 1) {
                    String[] funcParams = funcString[1].split(",");
                    for (String params: funcParams) {
                        params = params.trim();
                        String[] tempparam = params.split(" ");
                        FS.Params.add(new Tuple(tempparam[1], tempparam[0]));
                    }
                }

                FST.EnterFuncSymbol(FS);
            });
        } catch (IOException ex) {

        }

        //return FST;

    }
}
