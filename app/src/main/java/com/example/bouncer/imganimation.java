package com.example.bouncer;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class imganimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imganimation);

        ImageView img = findViewById(R.id.img_aimation);


        AnimationDrawable animationDrawable = (AnimationDrawable) img.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();


    }
}
