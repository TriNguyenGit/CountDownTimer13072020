package com.example.countdowntimer13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ctr + pace : gợi ý code
        //ctr + p : xem tham số truyền vào
        CountDownTimer countDownTimer = new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("BBB",millisUntilFinished +"");
            }

            @Override
            public void onFinish() {
                Log.d("BBB","onFinish");
            }
        };
        countDownTimer.start();
    }
}