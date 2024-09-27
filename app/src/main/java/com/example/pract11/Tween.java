package com.example.pract11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tween extends AppCompatActivity {
private ImageView img;
private Button startBtn;
private Button stopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tween);
        img=findViewById(R.id.imageView2);
        startBtn=findViewById(R.id.start_button);
        stopBtn=findViewById(R.id.stop_button);

        Animation blinkAnimation = AnimationUtils.loadAnimation(this,R.anim.blink_animation);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(blinkAnimation);
            }
        });
        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.clearAnimation();
            }
        });
        Button click = findViewById(R.id.back_button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tween.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}