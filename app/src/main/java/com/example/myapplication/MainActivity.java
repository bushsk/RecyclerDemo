package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*WebView mywebview = (WebView) findViewById(R.id.webView1);
        ///mywebview.loadUrl("http://www.javatpoint.com/");

        String data = "<html><body><h1>Hello, Javatpoint!</h1></body></html>";
        mywebview.loadData(data, "text/html", "UTF-8");*/

    }
}

