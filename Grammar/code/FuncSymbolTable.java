package code;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by Frederik on 27-03-2016.
 */
public class FuncSymbolTable {

    public LinkedHashMap<String, FuncSymbol> Map = new LinkedHashMap<String, FuncSymbol>();

    public FuncSymbol GetFuncSymbol(String type, String name){
        FuncSymbol sym = Map.get(type + name);
        return sym;
    }

    public void EnterFuncSymbol(FuncSymbol fs){
        FuncSymbol oldSym = GetFuncSymbol(fs.Type, fs.Name);
        if (oldSym != null) {
            Error e = new Error("Function already declared");
            throw e;
        }
        Map.put(fs.Type + fs.Name, fs);
    }
}
