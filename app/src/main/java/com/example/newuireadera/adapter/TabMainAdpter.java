package com.example.newuireadera.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newuireadera.R;


import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TabMainAdpter extends RecyclerView.Adapter<TabMainAdpter.ViewHolder> {
    private List<String>tabName;
    private int tabPosition;
    private IClickTab iClickTab;
    public void setData(List<String>mList){
        this.tabName=mList;
        notifyDataSetChanged();
    }

    public TabMainAdpter(IClickTab iClickTab) {
        this.iClickTab = iClickTab;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tab_main,parent,false);
        return new ViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        holder.tvTabName.setText(tabName.get(position));
        tabPosition=position;
    }

    @Override
    public int getItemCount() {
        return tabName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTabName;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            tvTabName=itemView.findViewById(R.id.tv_tab_name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    iClickTab.onClickTabItem(tabPosition);
                }
            });
        }
    }

    public interface IClickTab{
        void onClickTabItem( int position);

    }
}
