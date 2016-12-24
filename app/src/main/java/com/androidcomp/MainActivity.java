package com.androidcomp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.biztwo.getBizOneValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            TextView tv = (TextView) findViewById(R.id.tv);
            tv.setText(getBizOneValue.getStr());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
