package com.example.contactsapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.viewHolder> {
    ArrayList<String> contacts;
    Context context;

    public recyclerAdapter(ArrayList<String> contacts, Context context) {
        this.contacts = contacts;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler2,parent,false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        String string = contacts.get(position);
        holder.bind(string);
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,contactList.class);
                intent.putExtra("CONTACT_CATEGORY",string);
                context.startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount() {

        return contacts.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView text1 ;
        ConstraintLayout constraintLayout;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.family);
            constraintLayout = itemView.findViewById(R.id.layout1);
        }
        public void bind(String string){
            text1.setText(string);
        }
    }

}
