package com.example.daikin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv342;
    Button bt342;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv342 = (TextView) findViewById(R.id.tv342);
        tv342.setPaintFlags(tv342.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        bt342 = (Button) findViewById(R.id.button342);
        bt342.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                openMaXacNhan();
            }
        });


    }
    public void openMaXacNhan () {
        Intent intent = new Intent(this, MaXacNhan.class);
        startActivity(intent);
    }
}
