package com.jamil.favoritecolor.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.jamil.favoritecolor.R;

public class MainActivity extends AppCompatActivity {

    private Button mTellMeButton;
    private EditText mColorInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mColorInput = (EditText) findViewById(R.id.colorInput);
        mTellMeButton = (Button) findViewById(R.id.tellMeButton);
        mTellMeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                String favoriteColor = mColorInput.getText().toString();
                if(!favoriteColor.isEmpty()) {
                    showCompliment(favoriteColor);
                } else {
                    // TODO: show toast or shake input
                }
            }
        });
    }

    private void showCompliment(String color)
    {
        Intent intent = new Intent(this, ComplimentActivity.class);

        intent.putExtra(getString(R.string.key_color), color);

        startActivity(intent);
    }


}
