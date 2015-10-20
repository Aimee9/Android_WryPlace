package com.epicodus.wryplace;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.graphics.Typeface;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        String username = getIntent().getStringExtra("Username");

        TextView tv = (TextView)findViewById(R.id.TextViewUsername);
        tv.setText(username);

        TextView textViewCustom = (TextView) findViewById(R.id.blogTitle);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/KingthingsWillow.ttf");
        textViewCustom.setTypeface(myCustomFont);
    }

}
