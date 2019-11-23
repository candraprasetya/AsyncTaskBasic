package com.kardusinfo.asynctaskbasic;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DownloadAsyncTask extends AsyncTask<String, Integer, String> {

    private TextView tvMantab;
    private ProgressBar progressMantab;

    public DownloadAsyncTask(TextView tvMantab, ProgressBar progressMantab) {
        this.tvMantab = tvMantab;
        this.progressMantab = progressMantab;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        tvMantab.setText("Starting Download...");
    }

    @Override
    protected String doInBackground(String... strings) {

        try {
            for (int i = 1; i < 100; i++) {
                publishProgress(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Download Conpleted..";
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        int progress = values[0];
        progressMantab.setProgress(progress);
        tvMantab.setText(progress +" %");
    }


}
