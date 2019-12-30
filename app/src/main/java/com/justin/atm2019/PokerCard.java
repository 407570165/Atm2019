package com.justin.atm2019;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class PokerCard extends ConstraintLayout {

    private final ImageView typeImage;
    private final TextView pattern;
    private final TextView pattern1;
    int value;
    public PokerCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context,R.layout.cards,this);//這裡是在幹嘛啊
         typeImage = findViewById(R.id.typeImage);
        pattern = findViewById(R.id.Left_View);
        pattern1 = findViewById(R.id.Right_View);
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value=value;
        int type =value%4;
        int point=(value%13)+1;
        switch (type){
            case 0:
                typeImage.setImageResource(R.drawable.clover);
                break;
            case  1:
                typeImage.setImageResource(R.drawable.diamond);
                break;
            case 2:
                typeImage.setImageResource(R.drawable.hearts);
        }
    }
}
