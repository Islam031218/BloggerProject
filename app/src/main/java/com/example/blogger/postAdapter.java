package com.example.blogger;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import org.xml.sax.DTDHandler;

import java.util.Date;
import java.util.List;


public class postAdapter extends ArrayAdapter<Post> {
    Context context;
    int resource;

    public postAdapter(@NonNull Context context, int resource, @NonNull List<Post> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String postTitle = getItem(position).getTitle();
        String postDescription = getItem(position).getDescription();
        String postTag = getItem(position).getTag();
        Date postDate = getItem(position).getDate();


        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView= layoutInflater.inflate(R.layout.item_layout,parent, false);

        TextView them_tv = convertView.findViewById(R.id.them);
        TextView news_tv = convertView.findViewById(R.id.news);
        ConstraintLayout constraintLayout = convertView.findViewById(R.id.constraintLayout);

        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, datails.class);
                intent.putExtra("post",String.valueOf(position));
                context.startActivity(intent);
            }
        });

        them_tv.setText(postTitle);
        news_tv.setText(postDescription);


        return convertView;
    }
}
