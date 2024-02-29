package com.example.testnal_online;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText input;
    private Button search;
    private TextView output;

    List<String> listword = new ArrayList<>();
    List<String> count = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      find();
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onclick();
            }
        });

    }
    private void onclick() {
        String list = input.getText().toString();
        String[] array = {"aw", "aa", "dd", "ee", "oo", "ow", "w"};
        listword.clear();
        String temp="";
        for (int i = 0; i < list.length() - 1; i++) {
             temp = list.substring(i, i + 2);
            listword.add(temp);
        }
        count.clear();
        HashSet<String> set = new HashSet<>();
        for (String kiTu : array) {
            set.add(kiTu);
        }
        for (String kiTu : listword) {
            if (set.contains(kiTu)) {
                count.add(kiTu);
                output.setText(count.size() +"-"+count);
            }
        }
    }
    private void find() {
        input = (EditText) findViewById(R.id.text);
        search = (Button) findViewById(R.id.search);
        output = findViewById(R.id.textview);

    }
}