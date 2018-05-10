package com.android.garvit.timetable;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder> implements View.OnClickListener{

    private Context mcontext;
    private List<Subjects> SubjectList;

    public SubjectAdapter(Context mcontext, List<Subjects> subjectList) {
        this.mcontext = mcontext;
        SubjectList = subjectList;
    }

    @Override
    public void onClick(View v) {

    }

    class SubjectViewHolder extends RecyclerView.ViewHolder{
        TextView Subject_text, Subject_info;
        Button delete_b;

        public SubjectViewHolder(View itemView) {
            super(itemView);
            Subject_text = itemView.findViewById(R.id.subject_text);
            Subject_info = itemView.findViewById(R.id.subject_info_text);
            delete_b = itemView.findViewById(R.id.delete_b);
//            String filename = "Timetable.txt";
//            mcontext  = mcontext.getApplicationContext();
//            File file = new File(mcontext.getFilesDir(), filename);

        }
    }

    @Override
    public SubjectViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View view = inflater.inflate(R.layout.view_subject_cardview, null,false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);
        SubjectViewHolder holder = new SubjectViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(SubjectViewHolder holder, final int position) {
        Subjects subject = SubjectList.get(position);
        String info = "Room:"+ subject.getRoom() +" Prof:" + subject.getProf();
        holder.Subject_text.setText(subject.getName());
        holder.Subject_info.setText(info);
        holder.delete_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SubjectList.remove(position);
//                empty_file();
//                write_list(SubjectList);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, SubjectList.size());
            }
        });
    }

    @Override
    public int getItemCount() {
//        SubjectList = read();
        return SubjectList.size();
    }

//    void empty_file() {
//        String filename = "Timetable.txt";
//        try {
//            new FileOutputStream(filename).close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    void write_list(List<Subjects> subjectList){
//        String filename = "Timetable.txt";
//        try {
//            FileOutputStream fos = new FileOutputStream(filename);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            for(Subjects S : subjectList){
//                oos.writeObject(S);
//            }
//            oos.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    List<Subjects> read() {
//        String filename = "Timetable.txt";
//        List<Subjects> SubjectList = null;
//        try {
//            FileInputStream fis = new FileInputStream(filename);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            SubjectList = (List<Subjects>) ois.readObject();
//            ois.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return SubjectList;
//    }
}
