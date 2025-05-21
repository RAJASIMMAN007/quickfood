package com.example.quickfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etEmail, etPassword;
    Button btnSignIn, btnRegister, btnSignInSubmit;
    CheckBox rememberMe;
    TextView forgetPassword, registerPrompt;
    ImageView facebookIcon, googleIcon, appleIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// Make sure your XML file is named activity_login.xml

        // Initialize views
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnRegister = findViewById(R.id.btnRegister);
        btnSignInSubmit = findViewById(R.id.btnSignInSubmit);
        rememberMe = findViewById(R.id.rememberMe);
        forgetPassword = findViewById(R.id.forgetPassword);
        registerPrompt = findViewById(R.id.registerPrompt);
        facebookIcon = findViewById(R.id.socialIcons).findViewWithTag("facebook");
        googleIcon = findViewById(R.id.socialIcons).findViewWithTag("google");
        appleIcon = findViewById(R.id.socialIcons).findViewWithTag("applelogo");

        // Sign in button click
        btnSignInSubmit.setOnClickListener(view -> {
//            String email = etEmail.getText().toString();
//            String password = etPassword.getText().toString();
//            if (email.isEmpty() || password.isEmpty()) {
//                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
//            }
//            else if (email.equals("admin123@gmail.com") && password.equals("123456")) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
//            }
//            else {
//                Toast.makeText(this, "Signing in...", Toast.LENGTH_SHORT).show();
//                // Add authentication logic here
//            }
        });

        // Register button click
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg=new Intent(MainActivity.this, register.class);
                startActivity(reg);
            }
        });
    }
}








