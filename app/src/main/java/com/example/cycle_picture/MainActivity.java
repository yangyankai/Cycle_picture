package com.example.cycle_picture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] imageUrlsParams= new String[]{
                "http://p2.so.qhimg.com/bdr/_240_/t01f7251b5a36d0fc82.jpg",
                "http://p2.so.qhimg.com/bdr/_240_/t018b83cc648853f307.jpg",
                "http://p4.so.qhimg.com/bdr/_240_/t01272a7dda476ed78e.jpg",
                "http://p0.so.qhimg.com/bdr/_240_/t018c5c82327ff13b70.jpg",
                "http://p1.so.qhimg.com/bdr/_240_/t01e55ca9a7fe85c9bb.jpg"
        };

        SlideShowView slideShowView= (SlideShowView) findViewById(R.id.slideshowView);
        slideShowView.setUrls(imageUrlsParams);
        slideShowView.startPlay();
    }
}
