package com.example.demogreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<User>userlist;
    public UserAdapter(Context context, ArrayList<User>List) {
        this.context=context;
        this.userlist=List;
    }

    @NonNull
    @Override
    public UserAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_main,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.MyViewHolder holder, int position) {
        holder.userNameTxt.setText((CharSequence) userlist.get(position));

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView userNameTxt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            userNameTxt=itemView.findViewById(R.id.textView);
        }
    }

    public void MyViewHolder(View view) {
            }
}
