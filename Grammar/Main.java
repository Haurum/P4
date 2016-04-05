import gen.*;
import code.*;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 * Created by Frederik on 23-03-2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        ANTLRFileStream input = new ANTLRFileStream("Coners.txt");
        GrammarLexer lex = new GrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree t = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        FuncSymbolTable FST = new FuncSymbolTable();
        SymbolTable ST = new SymbolTable();
        FuncListener FListener = new FuncListener(FST);
        SymbolListener SListener = new SymbolListener(ST, FST);
        walker.walk(FListener, t);
        FST.Map.values().forEach(fs -> {
            System.out.print(fs.Name);
            fs.Params.forEach(tuple -> {
                System.out.print(tuple.toString());
            });
            System.out.println("");
        });
        walker.walk(SListener, t);

    }
}
