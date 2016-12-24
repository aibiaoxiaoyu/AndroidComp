package com.biztwo;


import com.example.ImediatorReflect;

/**
 * Created by cmcc on 2016/12/24.
 */

public class Biztwo_getBizOneValueReflect {
    public static String getStrFromOtherBizOne() throws ClassNotFoundException {

        ImediatorReflect c = null;
        try {
            c = (ImediatorReflect) Class.forName("com.bizone.BizOneImplReflect").newInstance();
            return c.func();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
