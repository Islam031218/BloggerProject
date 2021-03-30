package com.example.blogger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class datails extends AppCompatActivity {

    TextView userNameDetalis;
    TextView dataDetalis;
    TextView themDetalis;
    TextView tagDetalis;
    TextView descriptionDetalis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datails);

        userNameDetalis = (TextView) findViewById(R.id.userNameDetalis);
        dataDetalis = (TextView) findViewById(R.id.dataDetalis);
        themDetalis = (TextView) findViewById(R.id.themDetalis);
        tagDetalis = (TextView) findViewById(R.id.tagDetalis);
        descriptionDetalis = (TextView) findViewById(R.id.descriptionDetalis);

        Intent intent = getIntent();
        Post posts = templatePost.DataBeath(Integer.parseInt(intent.getStringExtra("post")));
        userNameDetalis.setText(posts.getAuthorName());
        dataDetalis.setText( String.valueOf(posts.getDate()));
        themDetalis.setText(posts.getTitle());
        tagDetalis.setText(posts.getTag());
        descriptionDetalis.setText(posts.getDescription());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}