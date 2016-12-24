package com.bizone;

import android.util.Log;

import com.example.Imediator;

/**
 * Created by cmcc on 2016/12/24.
 */

public class BizOneImpl implements Imediator {
    @Override
    public String func() {
        Log.e("","biz one imple");
        return "biz one value";
    }
}
