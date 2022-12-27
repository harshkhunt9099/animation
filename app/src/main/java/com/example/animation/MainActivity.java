package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    Button b1,b2,b3,b4;

    Animation ani;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.t1);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);


        b1.setOnClickListener(view -> {
            ani = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translet);
            t1.startAnimation(ani);
        });

        b2.setOnClickListener(view -> {
            ani = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
            t1.startAnimation(ani);
        });
        b3.setOnClickListener(view -> {
            ani = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
            t1.startAnimation(ani);
        });

        b4.setOnClickListener(view -> {
            ani = AnimationUtils.loadAnimation(this,R.anim.scale);
            t1.startAnimation(ani);
        });
    }



}