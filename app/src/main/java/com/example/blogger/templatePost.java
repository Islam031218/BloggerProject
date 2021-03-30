package com.example.blogger;

import java.util.ArrayList;

public class templatePost {
    public static ArrayList<Post> arrayList = new ArrayList<>();

    public void addGood(Post post){
        arrayList.add(post);
    }

    public ArrayList<Post> getArrayList() {
        return arrayList;
    }


    public static void  removeGood(int position){
        arrayList.remove(arrayList.get(position));
    }
    public static Post DataBeath(int posisin){
        return templatePost.arrayList.get(posisin);
    }
}
