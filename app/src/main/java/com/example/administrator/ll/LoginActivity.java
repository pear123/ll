package com.example.administrator.ll;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/10/16.
 */

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView jump=(TextView) findViewById(R.id.Login_TextView_Send);
        jump.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent =new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
