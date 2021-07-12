package com.prabhakar.idenditycardproblemcontinuation;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ClickListener {
    private RecyclerView recyclerView;
    private ArrayList<PersonModel> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        buildList();
        setRecyclerView();
    }

    private void buildList() {
        personList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            personList.add(new PersonModel(R.drawable.bill, "Age : 64", "Microsoft", "Profession : Buisness"));
            personList.add(new PersonModel(R.drawable.jeff, "Age : 56", "Amazon", "Profession : Buisness"));
            personList.add(new PersonModel(R.drawable.prateek, "Age : 31", "Masai School", "Profession : Buisness"));
        }
    }

    private void setRecyclerView() {
        PersonAdapter personAdapter = new PersonAdapter(personList, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(personAdapter);
    }

    @Override
    public void onItemClicked(PersonModel personModel) {
        new AlertDialog.Builder(this).setTitle("Person Details")
                .setMessage("Company Name : " + personModel.getCompanyName() + "\n" +
                          personModel.getAge()).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).show();

    }
}