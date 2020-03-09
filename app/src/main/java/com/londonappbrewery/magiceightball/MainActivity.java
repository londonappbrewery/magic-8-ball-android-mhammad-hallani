package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button ask;
    ImageView image8pool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ask=findViewById(R.id.ask);
        image8pool=findViewById(R.id.imagedecision);

        final int[] poolarray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomnumbergenerator = new Random();
                int number=randomnumbergenerator.nextInt(5);

                image8pool.setImageResource(poolarray[number]);
            }
        });
    }
}
