package com.example.project64;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class IntroActivity extends AppCompatActivity {

    Button letsgoBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        letsgoBtn = findViewById(R.id.btn_letsgo);
        letsgoBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Log.e("bat dau su dung","1");
                Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
                Log.e("bat dau su dung","2");
                startActivity((intent));
                Log.e("bat dau su dung","3");

            }
        });
    }
}