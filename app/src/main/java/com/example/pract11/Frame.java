package com.example.pract11;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Frame extends AppCompatActivity {
    private ImageView animationIV;
    private  Button startBtn;
    private  Button pauseBtn;
    private AnimationDrawable frameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        animationIV = findViewById(R.id.animImageView);
        startBtn = findViewById(R.id.startButton);
        pauseBtn = findViewById(R.id.pauseButton);

        frameAnimation = (AnimationDrawable) animationIV.getDrawable();

        startBtn.setOnClickListener(v -> {
            if(!frameAnimation.isRunning()){
                frameAnimation.start();
            }
        });
        pauseBtn.setOnClickListener(v -> {
            if (frameAnimation.isRunning()) {
                frameAnimation.stop();
            }
        });

        Button click = findViewById(R.id.back_button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Frame.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}