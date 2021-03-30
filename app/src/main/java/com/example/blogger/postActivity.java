package com.example.blogger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class postActivity extends AppCompatActivity implements View.OnClickListener {

Button addPost;
ListView listView;
TextView nameUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_ctivity);

        addPost = (Button) findViewById(R.id.addPost);
        addPost.setOnClickListener(this);
        listView = (ListView) findViewById(R.id.listVew1);
        nameUser = (TextView) findViewById(R.id.nameUser);

        nameUser.setText(User.name);


        postAdapter postAdapter = new postAdapter(postActivity.this, R.layout.item_layout,templatePost.arrayList);
        listView.setAdapter(postAdapter);



    }

    @Override
    public void onBackPressed() {
        Toast.makeText(postActivity.this, "нельзя выйти отсюда!!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.addPost : startActivity(new Intent(postActivity.this, addNewPost.class));

        }
    }
}