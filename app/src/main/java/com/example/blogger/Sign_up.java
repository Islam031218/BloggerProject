package com.example.blogger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Sign_up extends AppCompatActivity implements View.OnClickListener {

    EditText name;
    EditText email;
    EditText password;
    EditText confirmPassword;
    Button logInButton;
    TextView haveAccaunt;

    String nameSt;
    String emailSt;
    String passwordSt;
    String confirmSt;

    ArrayList<User> userArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = (EditText) findViewById(R.id.lastName);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        confirmPassword = (EditText) findViewById(R.id.confirmPassword);
        logInButton = (Button) findViewById(R.id.register);
        haveAccaunt = (TextView) findViewById(R.id.alraedyHave);



        userArrayList = User.userArrayList;

        logInButton.setOnClickListener(this);
        haveAccaunt.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.register :
                nameSt =name.getText().toString();
                emailSt = email.getText().toString();
                passwordSt = password.getText().toString();
                confirmSt =confirmPassword.getText().toString();

                if (passwordSt.equals(confirmSt)) {
                    userArrayList.add(new User(nameSt, emailSt, passwordSt));
                }

                if (!passwordSt.equals(confirmSt) || nameSt.equals("") || emailSt.equals("") || passwordSt.equals("")){
                    Toast.makeText(Sign_up.this, "не правильно заполнено!!!", Toast.LENGTH_SHORT).show();
                } else if (passwordSt.equals(confirmSt)){
                    startActivity(new Intent(Sign_up.this, postActivity.class));
                    User.name = nameSt;
                }else {
                    Toast.makeText(Sign_up.this, "другая ошибка!!!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.alraedyHave:
                startActivity(new Intent(Sign_up.this, MainActivity.class));
        }
    }
}