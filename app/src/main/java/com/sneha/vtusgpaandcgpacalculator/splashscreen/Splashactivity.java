package com.sneha.vtusgpaandcgpacalculator.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.sneha.vtusgpaandcgpacalculator.R;
import com.sneha.vtusgpaandcgpacalculator.introslider.introslider;

public class Splashactivity extends AppCompatActivity {

    Animation animation;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        img = (ImageView) findViewById(R.id.img);

        animation = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        img.startAnimation(animation);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Splashactivity.this, introslider.class);
                startActivity(intent);
                finish();

            }
        }, 2500);

    }
}

