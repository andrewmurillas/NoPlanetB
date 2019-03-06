package com.example.noplanetb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class BSplash extends AppCompatActivity {
//sigue generando error al cambiar a otro activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_theme);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        imageView.startAnimation(startAnimation);
        openApp(true);

    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BSplash
                        .this, CLass.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }

}
