package com.acubed.android.happybirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Typeface;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* tv1=(TextView) findViewById(R.id.text1);
        tv2=(TextView) findViewById(R.id.text2);

        Typeface face1 = Typeface.createFromAsset(getApplicationContext().getAssets(),
                "font/doridrobo.ttf");
        tv1.setTypeface(face1);
        Typeface face2 = Typeface.createFromAsset(getApplicationContext().getAssets(),
                "font/DroidSerif-Regular.ttf");
        tv2.setTypeface(face2);*/
    }
}
