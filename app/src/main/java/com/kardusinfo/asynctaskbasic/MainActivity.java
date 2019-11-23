package com.kardusinfo.asynctaskbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    private Button buttonDownload;
    private TextView textViewDownload;
    private ProgressBar progressBar;
    private LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewDownload = findViewById(R.id.textProgress);
        buttonDownload = findViewById(R.id.btnDownload);
        progressBar = findViewById(R.id.progressMantab);
        lottieAnimationView = findViewById(R.id.animasi);

        buttonDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    lottieAnimationView.setVisibility(View.VISIBLE);
                    lottieAnimationView.playAnimation();
                    DownloadAsyncTask mantab = new DownloadAsyncTask(textViewDownload, progressBar);
                    mantab.execute();
            }
        });

    }


}
