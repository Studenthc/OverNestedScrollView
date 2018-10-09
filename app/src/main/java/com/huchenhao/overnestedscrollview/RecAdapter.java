package com.huchenhao.overnestedscrollview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.MyViewHolder> {


    private Context mContext;
    private List<Integer> mList;

    public RecAdapter(Context context, List<Integer> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.item_layout, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mText.setText(mList.get(position) + "");
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mText;

        public MyViewHolder(View itemView) {
            super(itemView);
            mText = itemView.findViewById(R.id.text);
        }
    }
}
