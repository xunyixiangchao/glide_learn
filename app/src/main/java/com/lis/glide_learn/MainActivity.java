package com.lis.glide_learn;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RequestManager requestManager = Glide.with(this);
        ImageView imageView = findViewById(R.id.image);
        requestManager.load("http://www.baidu.com").into(imageView);
    }
}
