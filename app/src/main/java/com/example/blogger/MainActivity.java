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
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editEmail;
    EditText editPassword;
    Button logIn;
    TextView dontHaveAccount;
    Date date;

    ArrayList < User > userArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = (EditText) findViewById(R.id.editEmail);
        editPassword = (EditText) findViewById(R.id.editPassword);
        dontHaveAccount = (TextView) findViewById(R.id.dontHaveAccount);
        logIn = (Button) findViewById(R.id.logInButton);
        date = new Date();

        userArrayList = User.userArrayList;
        userArrayList.add(new User("Islam" , "I.arabaev001@gmail.com", "itacademy2020"));
        userArrayList.add(new User("islam", "1", "1"));

        templatePost.arrayList.add(new Post("Новости в кыргызстане среди депутаты",
                "Депутаты намерены лично проверить газонефтяные месторождения на" +
                        " приграничных территориях Баткена. Об этом на заседании комитета Жогорку" +
                        " Кенеша по топливно-энергетическому комплексу и недропользованию сообщил" +
                        " депутат Бейшеналы Нурдинов.\n" + "По его словам, комитет парламента планирует" +
                        " создать рабочую комиссию и проверить месторождения в Баткенской области, которыми" +
                        " якобы управляют соседние страны.", "#news",date,"islam"));

        logIn.setOnClickListener(this);
        dontHaveAccount.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.logInButton :


                for (User user : userArrayList){
                    if (user.getEmailUser().equals(editEmail.getText().toString()) &&
                            user.getPasswordUser().equals(editPassword.getText().toString())){
                        User.name = user.getNameUser();
                        startActivity(new Intent(MainActivity.this , postActivity.class));
                    }else {
                        Toast.makeText(MainActivity.this, "ошибка", Toast.LENGTH_SHORT).show();
                    }
                }

                break;
            case R.id.dontHaveAccount:
                startActivity(new Intent(MainActivity.this , Sign_up.class));
                break;
        }

    }
}