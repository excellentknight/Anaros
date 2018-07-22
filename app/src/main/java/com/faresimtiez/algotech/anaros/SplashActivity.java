package com.faresimtiez.algotech.anaros;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    ImageView mIvLogoSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mIvLogoSplash = (ImageView)findViewById(R.id.iv_logo_splash);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.splash_anim);
        mIvLogoSplash.startAnimation(animation);

        final Intent i = new Intent(this, ServicesListActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                    finish();
                }finally{
                    startActivity(i);
                    finish();
                }
            }
        };

        timer.start();
    }
}
