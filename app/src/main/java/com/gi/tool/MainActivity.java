package com.gi.tool;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.graphics.Color;

public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b){super.onCreate(b); getWindow().setStatusBarColor(Color.rgb(2,12,15)); getWindow().setNavigationBarColor(Color.rgb(2,12,15)); WebView w=new WebView(this); w.setBackgroundColor(Color.rgb(2,12,15)); w.setWebViewClient(new WebViewClient()); w.getSettings().setJavaScriptEnabled(true); w.loadUrl("file:///android_asset/index.html"); setContentView(w); }
}
