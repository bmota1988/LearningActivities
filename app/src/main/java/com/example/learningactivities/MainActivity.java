package com.example.learningactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyHTTPRequest req = new MyHTTPRequest();
        req.execute("http://Torunski.ca/CST2335_XML.xml");
    }

    private class MyHTTPRequest extends AnsyncTask<String, Integer, String> {

        public String doInBackground(String...args) {
            try {
                URL url = new URL(args[0]);
            }
        }

    }



}