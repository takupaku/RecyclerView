package com.example.student.recyclerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.student.recyclerview.R;
import com.example.student.recyclerview.model.Student;

import java.util.List;

public class rvAdapter extends RecyclerView.Adapter<ViewHolder> {

    private Context context;
    private List<Student> studentList;

    public rvAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, final int viewType) {


       View view=  LayoutInflater.from(context).inflate(R.layout.sample_layout,null);
        //ViewHolder holder =new ViewHolder(view);

//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, ""+studentList.get(viewType).getName(), Toast.LENGTH_SHORT).show();
//            }
//        });

        Log.i("test","onCreate View");
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {//setting textViews
        holder.name.setText(studentList.get(position).getName());
        holder.eduBackground.setText(studentList.get(position).getEduBackground());
        Log.i("test","onBindView");


    }

    @Override
    public int getItemCount() {
        return studentList.size();//counting items
    }

    //here, viewHolder2 is used as innerclass of rvAdapter
    public class ViewHolder2 extends RecyclerView.ViewHolder {

        TextView name,eduBackground;

        public ViewHolder2(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id._title);
            eduBackground=itemView.findViewById(R.id._desc);

            Log.i("text","viewHolder");
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, ""+studentList.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

                }
            });
        }

    }

}
