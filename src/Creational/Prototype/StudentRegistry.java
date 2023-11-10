package Creational.Prototype;

import java.util.HashMap;

/**
 * Registry class will act like data storage
 */
public class StudentRegistry {
    private HashMap<String, Student> map = new HashMap<>();

    void register(String key, Student student) {
        map.put(key, student);
    }

    Student get(String key) {
        return map.get(key);
    }
}
