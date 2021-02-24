package com.example.learndemo01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Intent intent=new Intent(Main2Activity.this,Main2Activity.class);
//        startActivity(intent);
//        ImageView imageView=(ImageView) findViewById(R.id.myimageview);
//        imageView.setImageResource(R.drawable.onetimg);
//        setContentView(R.layout.activity_main);
//        Button btn=(Button)findViewById(R.id.button);
        setContentView(R.layout.activity_main2);
        Button btn=(Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent();
                it.setClass(Main2Activity.this,MainActivity.class);
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
