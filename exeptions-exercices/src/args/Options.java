package args;

import java.util.HashMap;
import java.util.Map;

public class Options {
    private Map<String, String> argsOptions = new HashMap<String, String>();

    

    public void addOption(String key, String value) {
        argsOptions.put(key, value);
    }

    public String getOption(String key){
        return argsOptions.get(key);
    }
    
}
