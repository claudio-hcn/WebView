package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= (EditText) findViewById(R.id.txt_web);
        btn1=(Button) findViewById(R.id.btnIr);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navegar();
            }
        });
    }

    public void Navegar(){
        Intent i = new Intent(this,ActivityWeb.class);
        i.putExtra("sitioWeb" , et1.getText().toString());
        startActivity(i);
    }
}