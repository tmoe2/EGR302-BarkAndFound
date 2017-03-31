package com.example.botfly.petscanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void loginClicked(View view) { //redirect to the xml page after user logs in
        setContentView(R.layout.activity_log_in);
        System.out.println("log in clicked");
    }

    public void signUpClicked(View view) { //redirect to Sign Up xml page
        setContentView(R.layout.activity_register);
        System.out.println("sign up clicked");
    }

    public void forgotPasswordClicked(View view) { //redirect to Forgot Password xml page
        setContentView(R.layout.activity_forgot_password);
        System.out.println("forgot password clicked");
    }

    public void cancelClicked(View view) {
        setContentView(R.layout.activity_log_in);
        System.out.println("Cancel clicked.");
    }

    public void sendEmailClicked(View view) {
        //send email to the email entered
    }

//    Button btn = (Button)findViewById(R.id.Button_LogIn);
//
//    btn.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            startActivity(new Intent(LogIn.this, SignUpScreen.class));
//        }
//    });

    //TextView textViewSignIn = (TextView) findViewById(R.id.textView_signUp);
    //textViewSignIn.setMovementMethod(LinkMovementMethod.getInstance());
}
