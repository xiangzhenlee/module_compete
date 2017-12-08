package com.yushan.module_compete;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.yushan.gitmoudledemo.R;

@Route(path = "/module_compete/CompeteActivity")
public class CompeteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compete);
    }
}
