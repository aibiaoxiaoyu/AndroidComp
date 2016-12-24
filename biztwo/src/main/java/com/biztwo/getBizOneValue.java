package com.biztwo;


import com.example.Imediator;

/**
 * Created by cmcc on 2016/12/24.
 */

public class getBizOneValue {
    public static String getStr() throws ClassNotFoundException {

        Imediator c = null;
        try {
            c = (Imediator) Class.forName("com.bizone.BizOneImpl").newInstance();
            return c.func();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
