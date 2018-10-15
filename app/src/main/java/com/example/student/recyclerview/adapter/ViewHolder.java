package com.example.student.recyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.student.recyclerview.R;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView name,eduBackground;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id._title);
        eduBackground=itemView.findViewById(R.id._desc);

        Log.i("text","viewHolder");
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
