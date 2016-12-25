package com.bizone;

import com.example.ImediatorRegister;

/**
 * Created by cmcc on 2016/12/25.
 */

public class BizOne {

    public static String testRegiste(String id) {
        ImediatorRegister imple=(ImediatorRegister)ImediatorRegister.hashMap.get(id);

        // how to get the object methodes
        // to  do  ,how ?
        return imple.func();
    }

}
