package com.example.learndemo01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent();
                it.setClass(MainActivity.this,Main2Activity.class);
                startActivity(it);
            }
        });

    }
    String msg="Android:";
    @Override
    protected void onResume() {
        super.onResume();

        Log.d(msg, "The onStart() event");
    }
    @Override
    protected void onPause() {
        super.onPause();

        Log.d(msg, "The onStart() event");
    }
    @Override
    protected void onStop() {

        super.onStop();
        Log.d(msg, "The onStart() event");
    }




}