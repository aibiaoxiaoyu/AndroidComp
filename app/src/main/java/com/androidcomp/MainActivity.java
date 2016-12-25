package com.androidcomp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bizone.BizOne;
import com.biztwo.BizTwoRegisteImple;
import com.biztwo.Biztwo_getBizOneValueReflect;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(Biztwo_getBizOneValueReflect.getStrFromOtherBizOne());


        BizTwoRegisteImple biz = new BizTwoRegisteImple();
        biz.registe("two", biz);
        tv.setText(BizOne.testRegiste("two"));


    }
}
