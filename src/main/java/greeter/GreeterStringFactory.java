package greeter;

import java.util.HashMap;
import java.util.Map;

public class GreeterStringFactory {
    private static final Map<String, GreeterString> greeterStringMap = new HashMap<>();

    static {
        greeterStringMap.put("formal", new FormalGreeterString());
        greeterStringMap.put("casual", new CasualGreeterString());
        greeterStringMap.put("intimate", new IntimateGreeterString());
    }

    public GreeterString create(String formality) {
        if (!greeterStringMap.containsKey(formality)) {
            return new DefaultGreeterString();
        }
        return greeterStringMap.get(formality);
    }
}