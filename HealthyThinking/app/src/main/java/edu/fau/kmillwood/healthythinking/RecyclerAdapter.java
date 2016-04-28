package edu.fau.kmillwood.healthythinking;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Khalil on 3/27/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private String[] negativePatternsTitles = {
            "Mind Reading",
            "Filtering",
            "Personalization",
            "Labeling",
            "Emotional Reasoning",
            "Fortune Telling",
            "Black & White Thinking",
            "All-or-Nothing Thinking",
            "Binocular Thinking",
            "Heaven's Reward Fallacy"};

    private String[] negativePatternsText = {
            "This is where you jump into conclusions about what other people are thinking without no indication that the person feels that way.",
            "This is where you focus only on the negative parts of a situation and disregard all things positive.",
            "This is where you make every negative thing about yourself and believe that it\'s your fault that the negative thing continues to happen.",
            "This is where you identify and associate yourself with global labels that are meant to demean individuals.",
            "This is where you match your feelings with the truth. You believe that the negative things are true because you feel that way.",
            "This is where you think that every negative thing is a part of some cycle and just because a certain incident occurred something else is bound to happen.",
            "This is where you see things only as good or bad and never see any middle ground.",
            "This is where an individual feel like anything but perfection is a total disappointment. Unrealistic standards are set and you feel trapped inside them.",
            "This is where you magnify the importance of a problem or shortcoming and make it more serious then it needs to be while minimizing the significance of an accomplishment.",
            "This is where you expect that every sacrifice you make should come with some type of reward and if it doesn\'t then you feel sour and bitter."};

    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView itemTitle;
        public TextView itemText;

        public ViewHolder(View itemView){
            super(itemView);
            itemTitle = (TextView)itemView.findViewById(R.id.patternTitle);
            itemText = (TextView)itemView.findViewById(R.id.patternText);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.identifying_card_layout, viewGroup, false);
        ViewHolder	viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void	onBindViewHolder(ViewHolder	viewHolder,	int	i) {
        viewHolder.itemTitle.setText(negativePatternsTitles[i]);
        viewHolder.itemText.setText(negativePatternsText[i]);
    }

    @Override
    public int getItemCount(){
        return negativePatternsTitles.length;
    }

}
