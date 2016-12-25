package com.example;

import java.util.HashMap;

/**
 * Created by cmcc on 2016/12/25.
 */

public interface ImediatorRegister {

    HashMap<String, Object> hashMap = new HashMap<>();

    void registe(String id, Object obj);

    Object open(String id);

    String func();
}
