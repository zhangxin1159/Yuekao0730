package com.example.lenovo.yuekao0730;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private android.widget.AutoCompleteTextView autotext;
private android.widget.ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         autotext =(android.widget.AutoCompleteTextView) findViewById(R.id.autotext);
        String [] arr={"aa","aab","aac"};
        arrayAdapter = new android.widget.ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arr);
        autotext.setAdapter(arrayAdapter);

    }
}
