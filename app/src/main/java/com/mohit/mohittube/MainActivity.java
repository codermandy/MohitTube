package com.mohit.mohittube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView meme=findViewById(R.id.meme);
        meme.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.videoplayback);
        MediaController mediaController=new MediaController(this);
        meme.setMediaController(mediaController);
        mediaController.setAnchorView(meme);
        meme.start();
    }
}
