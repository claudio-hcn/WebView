package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ActivityWeb extends AppCompatActivity {
    WebView wv1;
    private Button btnCerrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wv1 = (WebView) findViewById(R.id.webView);

        String URL = getIntent().getStringExtra("sitioWeb");
        //permite abrir el sitio dentro de la misma app
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("http://" + URL);
        btnCerrar = (Button) findViewById(R.id.btnCerrar);
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cerrarWea();
            }
        });
    }
    public void cerrarWea(){
        finish(); /*ahora para que navegue hay que ir a modificar el manifest a agregar etiqueta
        <uses-permission android:name="android.permission.INTERNET"/> */
    }
}