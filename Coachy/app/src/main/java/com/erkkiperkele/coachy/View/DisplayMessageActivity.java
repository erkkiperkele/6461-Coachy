package com.erkkiperkele.coachy.View;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Create the textView
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // Set the textView as the activity layout
        setContentView(textView);
    }
}
