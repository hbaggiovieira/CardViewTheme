package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Posts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Posts> posts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Definir layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager( layoutManager );


        //Definir adapter
        this.preparePosts();

        PostagemAdapter adapter = new PostagemAdapter(posts);
        recyclerPostagem.setAdapter(adapter);
    }

        //Preparar postagens
    public void preparePosts() {
        Posts p;
        p = new Posts("Henrique", "Viagem legal", R.drawable.imagem1);
        this.posts.add(p);
        p = new Posts("Henrique 2", "Post 2", R.drawable.imagem2);
        this.posts.add(p);
        p = new Posts("Henrique 3", "Post 3", R.drawable.imagem3);
        this.posts.add(p);
        p = new Posts("Henrique 4", "Post 4", R.drawable.imagem4);
        this.posts.add(p);
    }
}