package com.example.blogger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class addNewPost extends AppCompatActivity {

    EditText newTitle;
    EditText newDescription;
    EditText newTag;
    Button createPost;

    String newTitleSt;
    String newDescriptionSt;
    String newTagSt;

    Date date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_post);

        newTitle = (EditText) findViewById(R.id.newTitle);
        newDescription = (EditText) findViewById(R.id.newDescription);
        newTag = (EditText) findViewById(R.id.newTag);
        createPost = (Button) findViewById(R.id.createPost);
        date = new Date();


        createPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newTitleSt = newTitle.getText().toString();
                newDescriptionSt = newDescription.getText().toString();
                newTagSt = newTag.getText().toString();

                if (!newTitleSt.equals("") || !newDescriptionSt.equals("") || !newTagSt.equals("")) {
                    templatePost.arrayList.add(new Post(newTitleSt, newDescriptionSt, newTagSt, date,User.name));
                    Toast.makeText(addNewPost.this, "post added successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(addNewPost.this, postActivity.class));
                } else {
                    Toast.makeText(addNewPost.this, "please fill in correctly", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}