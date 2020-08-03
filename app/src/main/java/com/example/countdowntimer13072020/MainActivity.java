package com.example.countdowntimer13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImg;
    int[] mArrayImages = {
            R.drawable.hinh1,
            R.drawable.hinh2,
            R.drawable.hinh3,
            R.drawable.hinh4,
            R.drawable.hinh5
    };
    int mCount = 0;
    final CountDownTimer countDownTimer = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImg = findViewById(R.id.imageview);
        CountDownTimer countDownTimer = new CountDownTimer(10100,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(mCount >= 4){
                    mCount = 0;
                }
                mImg.setImageResource(mArrayImages[mCount++]);
            }

            @Override
            public void onFinish() {
                this.start();
                //countDownTimer.start();
            }
        };
        countDownTimer.start();
    }
}