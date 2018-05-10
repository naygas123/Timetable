package com.android.garvit.timetable;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class ClashAdapter extends RecyclerView.Adapter<ClashAdapter.ClashViewHolder> implements View.OnClickListener {

    private Context mcontext;
    private List<Clash> ClashList;

    public ClashAdapter(Context mcontext, List<Clash> clashList) {
        this.mcontext = mcontext;
        ClashList = clashList;
    }

    @Override
    public void onClick(View v) {

    }

    class ClashViewHolder extends RecyclerView.ViewHolder {
        TextView Clash_text;

        public ClashViewHolder(View itemView) {
            super(itemView);
            Clash_text = itemView.findViewById(R.id.clash_text);
//            Clash_info = itemView.findViewById(R.id.clash_info_text);
//            delete_b = itemView.findViewById(R.id.delete_b);
//            String filename = "Timetable.txt";
//            mcontext  = mcontext.getApplicationContext();
//            File file = new File(mcontext.getFilesDir(), filename);

        }
    }

    @Override
    public ClashViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View view = inflater.inflate(R.layout.view_clashes_cardview, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);
        ClashViewHolder holder = new ClashViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ClashViewHolder holder, final int position) {
        Clash clash = ClashList.get(position);
        String info = "Subject " + clash.getSub1() + " Clashes with Subject " + clash.getSub2();
        holder.Clash_text.setText(info);
//        holder.Clash_info.setText(info);
//        holder.delete_b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ClashList.remove(position);
////                empty_file();
////                write_list(ClashList);
//                notifyItemRemoved(position);
//                notifyItemRangeChanged(position, ClashList.size());
//            }
//        });
    }

    @Override
    public int getItemCount() {
//        ClashList = read();
        return ClashList.size();
    }
}