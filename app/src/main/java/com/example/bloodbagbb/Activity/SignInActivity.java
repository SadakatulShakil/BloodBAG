package com.example.bloodbagbb.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bloodbagbb.R;

public class SignInActivity extends AppCompatActivity {

    private ImageView backArrow;
    private Button SigninBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        initviews();
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        SigninBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, FragmentMenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void initviews() {
        backArrow = findViewById(R.id.arrow);
        SigninBtn = findViewById(R.id.btSignIn);
    }
}
