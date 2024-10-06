// Non-compliant Code: Synchronizing on a shared object
/*
import java.util.HashMap;
import java.util.Map;

public class R05_LCK03_J {
    private final Map<String, String> sharedMap = new HashMap<>();

    public void updateMap(String key, String value) {
        synchronized (sharedMap) {  // Non-compliant: synchronizing on a shared object
            sharedMap.put(key, value);
        }
    }
}
*/

// Compliant Code: Use a private lock object for synchronization
import java.util.HashMap;
import java.util.Map;

public class R05_LCK03_J {
    private final Map<String, String> sharedMap = new HashMap<>();
    private final Object lock = new Object();  // Private lock object

    public void updateMap(String key, String value) {
        synchronized (lock) {  // Compliant: synchronize on a private lock object
            sharedMap.put(key, value);
        }
    }
}
