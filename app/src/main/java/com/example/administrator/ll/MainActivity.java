package com.example.administrator.ll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
               setSupportActionBar(toolbar);




        ImageView jump=(ImageView) findViewById(R.id.imageButton3);
        jump.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this, MyActivity.class);
                startActivity(intent);
            }
        });

    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
