package com.prabhakar.idenditycardproblemcontinuation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    private ImageView img;
    private TextView profession;
    private TextView age;
    private TextView companyName;
    private CardView card;
    private ClickListener clickListener;

    public PersonViewHolder(@NonNull View itemView, ClickListener clickListener) {
        super(itemView);
        this.clickListener = clickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        img = itemView.findViewById(R.id.userPhoto);
        age = itemView.findViewById(R.id.age);
        companyName = itemView.findViewById(R.id.companyName);
        profession = itemView.findViewById(R.id.profession);
        card = itemView.findViewById(R.id.card);
    }

    public void setData(PersonModel model) {
        img.setImageResource(model.getImg());
        age.setText(model.getAge());
        companyName.setText(model.getCompanyName());
        profession.setText(model.getProfession());
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onItemClicked(model);
            }
        });
    }
}
