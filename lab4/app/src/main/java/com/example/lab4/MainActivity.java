package com.example.lab4;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    String drawableName = "ic_logo_00";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void setLogo(View view) {
        // add code here...
    }

    public void openInGoogleMaps (View view) {

        // add code here...
    }

    public void submit (View view) {
        // add code here...
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        // add code here...



    }
}
