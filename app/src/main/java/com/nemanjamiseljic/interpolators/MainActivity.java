package com.nemanjamiseljic.interpolators;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.os.Bundle;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

public class MainActivity extends AppCompatActivity {

    LinearLayout playGround;
    ImageView image;

    AccelerateDecelerateInterpolator accelerateDecelerateInterpolator;
    AccelerateInterpolator accelerateInterpolator;
    AnticipateInterpolator anticipateInterpolator;
    AnticipateOvershootInterpolator anticipateOvershootInterpolator;
    BounceInterpolator bounceInterpolator;
    CycleInterpolator cycleInterpolator;
    DecelerateInterpolator decelerateInterpolator;
    FastOutLinearInInterpolator fastOutLinearInInterpolator;
    FastOutSlowInInterpolator fastOutSlowInInterpolator;
    LinearInterpolator linearInterpolator;
    LinearOutSlowInInterpolator linearOutSlowInInterpolator;
    OvershootInterpolator overshootInterpolator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playGround = (LinearLayout)findViewById(R.id.playground);
        image = (ImageView)findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnNull = (Button)findViewById(R.id.bNull);
        btnNull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareObjectAnimator(null);
            }
        });

        Button btnAccelerateDecelerateInterpolator
                = (Button)findViewById(R.id.bAccelerateDecelerateInterpolator);
        btnAccelerateDecelerateInterpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareObjectAnimator(accelerateDecelerateInterpolator);
            }
        });

        Button btnAccelerateInterpolator = (Button)findViewById(R.id.bAccelerateInterpolator);
        btnAccelerateInterpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareObjectAnimator(accelerateInterpolator);
            }
        });

        Button btnAnticipateInterpolator = (Button)findViewById(R.id.bAnticipateInterpolator);
        btnAnticipateInterpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareObjectAnimator(anticipateInterpolator);
            }
        });

        Button btnAnticipateOvershootInterpolator
                = (Button)findViewById(R.id.bAnticipateOvershootInterpolator);
        btnAnticipateOvershootInterpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareObjectAnimator(anticipateOvershootInterpolator);
            }
        });

        Button btnBounceInterpolator = (Button)findViewById(R.id.bBounceInterpolator);
        btnBounceInterpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareObjectAnimator(bounceInterpolator);
            }
        });

        Button btnCycleInterpolator = (Button)findViewById(R.id.bCycleInterpolator);
        btnCycleInterpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareObjectAnimator(cycleInterpolator);
            }
        });

        Button btnDecelerateInterpolator = (Button)findViewById(R.id.bDecelerateInterpolator);
        btnDecelerateInterpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareObjectAnimator(decelerateInterpolator);
            }
        });

        Button btnFastOutLinearInInterpolator
                = (Button)findViewById(R.id.bFastOutLinearInInterpolator);
        btnFastOutLinearInInterpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareObjectAnimator(fastOutLinearInInterpolator);
            }
        });

        Button btnFastOutSlowInInterpolator
                = (Button)findViewById(R.id.bFastOutSlowInInterpolator);
        btnFastOutSlowInInterpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareObjectAnimator(fastOutSlowInInterpolator);
            }
        });

        Button btnLinearInterpolator = (Button)findViewById(R.id.bLinearInterpolator);
        btnLinearInterpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareObjectAnimator(linearInterpolator);
            }
        });

        Button btnOvershootInterpolator = (Button)findViewById(R.id.bOvershootInterpolator);
        btnOvershootInterpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareObjectAnimator(overshootInterpolator);
            }
        });

        Button btnLinearOutSlowInInterpolator
                = findViewById(R.id.bLinearOutSlowInInterpolator);
        btnLinearOutSlowInInterpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareObjectAnimator(linearOutSlowInInterpolator);
            }
        });

        prepareInterpolator();
    }

    private void prepareInterpolator(){
        accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        accelerateInterpolator = new AccelerateInterpolator();
        anticipateInterpolator = new AnticipateInterpolator();
        anticipateOvershootInterpolator = new AnticipateOvershootInterpolator();
        bounceInterpolator = new BounceInterpolator();
        cycleInterpolator = new CycleInterpolator(2);
        decelerateInterpolator = new DecelerateInterpolator();
        fastOutLinearInInterpolator = new FastOutLinearInInterpolator();
        fastOutSlowInInterpolator = new FastOutSlowInInterpolator();
        linearInterpolator = new LinearInterpolator();
        linearOutSlowInInterpolator = new LinearOutSlowInInterpolator();
        overshootInterpolator = new OvershootInterpolator();
    }

    private void prepareObjectAnimator(TimeInterpolator timeInterpolator){
        //float w = (float)playGround.getWidth();
        float h = (float)playGround.getHeight();
        float propertyStart = 0f;
        float propertyEnd = -(h/2 - (float)image.getHeight()/2);
        String propertyName = "translationY";
        ObjectAnimator objectAnimator
                = ObjectAnimator.ofFloat(image, propertyName, propertyStart, propertyEnd);
        objectAnimator.setDuration(2000);
        objectAnimator.setRepeatCount(1);
        objectAnimator.setRepeatMode(ObjectAnimator.REVERSE);
        objectAnimator.setInterpolator(timeInterpolator);
        objectAnimator.start();
    }
}
