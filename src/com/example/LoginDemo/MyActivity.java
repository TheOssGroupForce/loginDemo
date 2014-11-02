package com.example.LoginDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MyActivity extends Activity {

    EditText user,pass;
    Button submit;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        submit = (Button) findViewById(R.id.login);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getText().toString().equals("res") && pass.getText().toString().equals("boom")){
                    Intent i = new Intent(getApplicationContext(), SuccessActivity.class);
                    startActivity(i);
                }else{
                    Intent i = new Intent(getApplicationContext(), FailureActivity.class);
                    startActivity(i);
                }
            }
        });

    }
}
