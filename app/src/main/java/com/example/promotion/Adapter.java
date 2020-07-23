package com.example.promotion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder>{

    Context mContext;
    List<item> mData;

    public Adapter(Context mContext, List<item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflates = LayoutInflater.from(mContext);
        View v = inflates.inflate(R.layout.promotion_list, parent,false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {

        holder.background_img.setImageResource(mData.get(position).getBackground());
        holder.tv_name.setText(mData.get(position).getMassageName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        ImageView background_img;
        TextView tv_name;


        public myViewHolder(View itemView) {
            super(itemView);
            background_img = itemView.findViewById(R.id.img_background);
            tv_name = itemView.findViewById(R.id.list_name);
        }
    }
}
