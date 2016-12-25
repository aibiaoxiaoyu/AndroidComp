package com.example;

import java.util.HashMap;

/**
 * Created by cmcc on 2016/12/25.
 */

public class MediatorProtocol {


    private static final HashMap<String, ComponentProtocol> hashMap = new HashMap<>();

    public void registe(String id, ComponentProtocol obj) {
        hashMap.put(id, obj);
    }

    public ComponentProtocol getProtocol(String id) {
        return hashMap.get(id);
    }
}
