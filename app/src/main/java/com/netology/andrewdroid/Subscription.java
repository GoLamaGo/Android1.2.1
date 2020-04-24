package com.netology.andrewdroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Subscription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subscription);

        final TextView result = (TextView) findViewById(R.id.subscriptionResultText);
        final EditText userName = (EditText) findViewById(R.id.userNameEdit);
        final EditText userEmail = (EditText) findViewById(R.id.userEmailEdit);
        Button buttonOk = (Button) findViewById(R.id.buttonOk);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(getString(R.string.subscriptionResult, userName.getText(),userEmail.getText()));
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                userName.setText("");
                userEmail.setText("");
            }
        });

    }
}