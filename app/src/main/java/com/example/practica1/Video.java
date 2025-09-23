package com.example.practica1;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;


    public class Video extends AppCompatActivity {

        private VideoView v;



        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_video);

            v =  (VideoView) findViewById(R.id.videoView);
            String videopath = "android.resource://" + getPackageName() + "/" + R.raw.video;
            Uri uri = Uri.parse(videopath);
            v.setVideoURI(uri);

            //controles de video
            MediaController mediaController = new MediaController(this);
            v.setMediaController(mediaController);
            mediaController.setAnchorView(v);
            v.start();


    }
}
