import gen.*;
import code.*;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
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
    public static void main(String[] args) throws IOException {

        ANTLRFileStream input = new ANTLRFileStream("test.txt");
        GrammarLexer lex = new GrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree t = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        FuncSymbolTable FST = new FuncSymbolTable();
        FuncSymbolTable RoboFST = new FuncSymbolTable();
        SymbolTable ST = new SymbolTable();
        FuncListener FListener = new FuncListener(FST);
        SymbolTypeVisitor STVisitor = new SymbolTypeVisitor(ST, FST);
        ImportReservedFunctions(RoboFST);
        walker.walk(FListener, t);
        RoboFST.Map.values().forEach(fs -> {
            System.out.print(fs.Name);
            fs.Params.forEach(tuple -> {
                System.out.print(tuple.toString());
            });
            System.out.println("");
        });
        STVisitor.visit(t);
    }

    public static FuncSymbolTable ImportReservedFunctions(FuncSymbolTable FST)
    {
        Path path = Paths.get("ReservedFunctions.txt");
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(s -> {
                String[] funcString = s.split("-");
                String[] funcId = funcString[0].split(" ");
                FuncSymbol FS = new FuncSymbol();
                FS.Type = funcId[0];
                FS.Name = funcId[1];
                FS.ReturnType = funcId[2];

                if (funcString.length > 1) {
                    String[] funcParams = funcString[1].split(",");
                    for (String params: funcParams) {
                        params = params.trim();
                        String[] tempparam = params.split(" ");
                        FS.Params.add(new Tuple(tempparam[0], tempparam[1]));
                    }
                }

                FST.EnterFuncSymbol(FS);
            });
        } catch (IOException ex) {

        }

        return FST;

    }
}
