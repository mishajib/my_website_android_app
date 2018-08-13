package com.mi_shajib.ownwebsite.mishajib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mishajib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mishajib = findViewById(R.id.mishajib);

        WebSettings webSettings = mishajib.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mishajib.setWebViewClient(new WebViewClient());

        mishajib.loadUrl("https://www.mi-shajib.com");
    }

    @Override
    public void onBackPressed() {
        if (mishajib.canGoBack()){
            mishajib.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
