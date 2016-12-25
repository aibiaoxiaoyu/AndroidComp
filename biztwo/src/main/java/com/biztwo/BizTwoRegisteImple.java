package com.biztwo;

import com.example.ImediatorRegister;

/**
 * Created by cmcc on 2016/12/25.
 */

public class BizTwoRegisteImple implements ImediatorRegister {
    @Override
    public void registe(String id, Object obj) {
        hashMap.put(id,obj);
    }

    @Override
    public Object open(String id) {
        return hashMap.get(id);
    }

    @Override
    public String func() {
        return "biz two register";
    }
}
