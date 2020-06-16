package com.example.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.model.Posts;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Posts> listPosts;

    public PostagemAdapter(List<Posts> p) {
        this.listPosts = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_adapter, parent, false);

        return new MyViewHolder (itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Posts posts = listPosts.get(position);
        holder.textName.setText(posts.getNome());
        holder.textPost.setText(posts.getPostagem());
        holder.imagePost.setImageResource(posts.getImagem());

    }

    @Override
    public int getItemCount() {
        return listPosts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textName;
        //Implementar captura de tempo do celular
        //private TextView time;
        private TextInputEditText textPost;
        private ImageView imagePost;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.userName);
            textPost = itemView.findViewById(R.id.editTextPost);
            imagePost = itemView.findViewById(R.id.imagePost);
        }
    }
}
