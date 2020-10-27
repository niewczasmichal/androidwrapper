package com.example.wrappertest

import android.R.bool
import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WebView.setWebContentsDebuggingEnabled(true);
        setContentView(R.layout.main)
        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        myWebView.settings.javaScriptEnabled = true
        myWebView.loadUrl("http://d4y0qnx96s3ps.cloudfront.net")
    }
}