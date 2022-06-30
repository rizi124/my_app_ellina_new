package com.example.myapplication_ellina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity_ellina2 extends AppCompatActivity {
private ImageButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn =(ImageButton) findViewById(R.id.root_3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
    }
    public void openActivity(){
        Intent intent=new Intent(this, MainActivity_ellina_3.class);
        startActivity(intent);
    }


    public void startNewActivity(View v){
        Intent intent=new Intent(this, MainActivity_ellina_4.class);

        startActivity(intent);
    }

}