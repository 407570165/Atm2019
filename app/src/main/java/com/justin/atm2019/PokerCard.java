package com.justin.atm2019;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class PokerCard extends ConstraintLayout {


    private final TextView leftNum;
    private final TextView rightNum;
    private final ImageView cards;
    int value;
    public PokerCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context,R.layout.cards,this);
        leftNum = findViewById(R.id.text1);
        rightNum = findViewById(R.id.downText);
        cards = findViewById(R.id.imageView);
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value=value;
        int type =value/13;
        int points =(value%13)+1;
        switch (type){
            case 0:
                cards.setImageResource(R.drawable.clover);
                break;
            case 1:
                cards.setImageResource(R.drawable.diamond);
                break;
            case 2:
                cards.setImageResource(R.drawable.hearts);
                break;
            case  3:
                cards.setImageResource(R.drawable.spare);
                break;
        }
        leftNum.setText(points+"");
        rightNum.setText(points+"");
    }
}

