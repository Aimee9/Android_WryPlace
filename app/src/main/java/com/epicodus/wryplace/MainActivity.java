package com.epicodus.wryplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoginButton = (Button) findViewById(R.id.ButtonLogin);



        mLoginButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                EditText a = (EditText)findViewById(R.id.TextName);
                String str = a.getText().toString();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                intent.putExtra("Username", str);
                startActivity(intent);
            }
        });
    }


}
