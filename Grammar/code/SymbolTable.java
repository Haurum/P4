package code;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Frederik on 23-03-2016.
 */
public class SymbolTable  {

    public LinkedHashMap<String, Symbol> Map = new LinkedHashMap<String, Symbol>();
    public ArrayList<ArrayList<Symbol>> Scope = new ArrayList<ArrayList<Symbol>>();
    int depth;

    public SymbolTable(){
        depth = 0;
        Scope.add(new ArrayList<Symbol>());
    }

    public void OpenScope(){
        depth++;
        if (Scope.size() < depth+1){
            Scope.add(new ArrayList<Symbol>());
        }else {
            Scope.get(depth).clear();
        }
    }

    public void CloseScope(){
        Scope.get(depth).forEach(s -> {
            Symbol prevSym = s.Var;
            Map.replace(s.Name, s, prevSym);
        });
        depth--;
    }

    public Symbol GetSymbol(String name){
        Symbol sym = Map.get(name);
        return sym;
    }

    public void EnterSymbol(String name, String type){
        Symbol oldsym = Map.get(name);
        if (oldsym != null && oldsym.Depth == depth){
            Error e = new Error("Duplicate declaration of " + name);
            throw e;
        }else{
            Symbol newSym = new Symbol();
            newSym.Name = name;
            newSym.Type = type;
            newSym.Depth = depth;
            newSym.Var = oldsym;
            Scope.get(depth).add(newSym);
            if(oldsym == null){
                Map.replace(name, oldsym, newSym);
            }else{
                Map.put(name, newSym);
            }
        }
    }
}
