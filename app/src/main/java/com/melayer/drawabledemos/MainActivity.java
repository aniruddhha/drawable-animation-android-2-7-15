package com.melayer.drawabledemos;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView textAnim;
    private Button btnTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textAnim = (TextView)findViewById(R.id.textAnim);

        final Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.my_anim);
        btnTemp = (Button)findViewById(R.id.btnTemp);
        btnTemp.setAnimation(animation);

        final Animation animationText = AnimationUtils.loadAnimation(MainActivity.this, R.anim.text_anim);
        btnTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textAnim.startAnimation(animationText);
            }
        });
    }
}
