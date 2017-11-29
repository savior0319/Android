package com.example.savior.practice_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private RadioButton rbtn1;
    private RadioButton rbtn2;
    private EditText et;
    private String Url;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        rbtn1 = findViewById(R.id.rb1);
        rbtn2 = findViewById(R.id.rb2);
        et = findViewById(R.id.text1);
        img = findViewById(R.id.img);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Url = et.getText().toString();
                Toast.makeText(getApplicationContext(), Url, Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Url = et.getText().toString();
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + Url));
                startActivity(mIntent);
            }
        });

        rbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.img1);
            }
        });
        rbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.img2);
            }
        });
    }
}
