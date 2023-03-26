package com.example.demogreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button okbtn;
    private RecyclerView recyclerView;
    private ArrayList<User>userList = new ArrayList<User>();
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editText);
        okbtn=(Button)findViewById(R.id.okbtn);
        recyclerView=(RecyclerView)findViewById(R.id.rview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        userAdapter=new UserAdapter(this,userList);
        RecyclerView.Adapter UserAdapter = null;
        recyclerView.setAdapter(UserAdapter);


    }
}