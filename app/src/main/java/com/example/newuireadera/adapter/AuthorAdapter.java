package com.example.newuireadera.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newuireadera.R;
import com.example.newuireadera.model.Author;
import com.example.newuireadera.model.Series;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AuthorAdapter extends RecyclerView.Adapter<AuthorAdapter.ViewHolder> {
    private List<Series> authorList;


    public void setData(List<Series>mList){
        authorList=mList;
        notifyDataSetChanged();
    }
    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_author,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        holder.tvAuthorName.setText(authorList.get(position).getName());
        holder.tvCount.setText(authorList.get(position).getCount());
    }

    @Override
    public int getItemCount() {
        return authorList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgAuthor;
        private TextView tvAuthorName;
        protected TextView tvCount;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imgAuthor=itemView.findViewById(R.id.img_author);
            tvAuthorName=itemView.findViewById(R.id.tv_auhtor_name);
            tvCount=itemView.findViewById(R.id.tv_count_sp);

        }
    }
}