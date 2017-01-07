package com.jamil.favoritecolor.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jamil.favoritecolor.model.ColorParser;
import com.jamil.favoritecolor.model.ComplimentBook;
import com.jamil.favoritecolor.R;

public class ComplimentActivity extends AppCompatActivity {

    private TextView mCompliment;
    private ComplimentBook mComplimentBook = new ComplimentBook();
    private RelativeLayout mRelativeLayout;
    private Button mThankYouButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compliment);


        Intent intent = getIntent();
        String color = intent.getStringExtra(getString(R.string.key_color));

        mCompliment = (TextView) findViewById(R.id.complimentTextView);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.content_compliment);
        mThankYouButton = (Button) findViewById(R.id.thankYouButton);

        mThankYouButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        
        showCompliment();
        changeBackgroundColor(color);
    }

    private void showCompliment()
    {
        String compliment = mComplimentBook.getRandomCompliment();
        mCompliment.setText(compliment);
    }

    private void changeBackgroundColor(String color)
    {
        int colorInt = ColorParser.getColorNumFromString(color);
        mRelativeLayout.setBackgroundColor(colorInt);
    }
}
