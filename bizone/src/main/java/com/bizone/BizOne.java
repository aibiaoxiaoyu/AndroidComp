package com.bizone;

import com.example.ComponentProtocol;
import com.example.ImediatorRegister;
import com.example.MediatorProtocol;

/**
 * Created by cmcc on 2016/12/25.
 */

public class BizOne {

    public static String testRegiste(String id) {
        ImediatorRegister imple = (ImediatorRegister) ImediatorRegister.hashMap.get(id);

        // how to get the object methodes
        // to  do  ,how ?
        return imple.func();
    }

    public static String testProtocol(String id) {
        ComponentProtocol protocol = new MediatorProtocol().getProtocol(id);

        // how to get the object methodes
        // to  do  ,how ?
        return protocol.getStr();
    }
}
