package com.example.admin.mybucketdrops;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener {

    Toolbar mToolbar;
    Button mbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mbutton = (Button) findViewById(R.id.btn_add);
        mbutton.setOnClickListener(this);
        setSupportActionBar(mToolbar);
        initBackgroundImage();
    }

    private void initBackgroundImage(){
        ImageView background = (ImageView) findViewById(R.id.iv_background);
        Glide.with(this)
                .load(R.drawable.background)
                .centerCrop()
                .into(background);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(ActivityMain.this, "Adding a drop", Toast.LENGTH_SHORT).show();
    }
}
