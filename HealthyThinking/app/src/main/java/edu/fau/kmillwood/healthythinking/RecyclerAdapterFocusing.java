package edu.fau.kmillwood.healthythinking;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerAdapterFocusing extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private String[] positiveFocusingTitles = {
            "Identify Areas To Change",
            "Check Yourself",
            "Be Open To Humor",
            "Follow A Healthy Lifestyle",
            "Surround Yourself With Positive People"
    };

    private String[] positiveFocusingText = {
            "The first thing you must do is identify which negative thinking patterns affect you from thinking healthy. Take those patterns and associate them with areas of your life. It is best to focus on one area at a time and only move on once you have shifted the area in a positive way.",
            "Set aside some free time during the day to reflect back on your thoughts. If your thoughts leaned more towards the negative side, then try to separate your thoughts from the actual events. Examine those events and replace all your speculations with facts.",
            "Allow yourself to be open to humor in difficult situations. It will help you keep a positive, optimistic outlook when bad luck comes your way. Laughter relaxes you and makes you feel good. The best thing you can do is to learn to laugh at yourself during embarrassing situations, remember you are only human.",
            "Living a healthy lifestyle can help you on your journey to healthy thinking. Exercising throughout the week, eating a balanced diet, and getting enough rest will put you in a good mood which makes it easier to look at things through a balanced outlook.",
            "It is important to have supportive, positive people in your life. It is not good to let negative people in your life. You do not want their negativity to influence your mental behavior."
    };

    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView itemTitle;
        public TextView itemText;

        public ViewHolder(View itemView){
            super(itemView);
            itemTitle = (TextView)itemView.findViewById(R.id.focusingTitle);
            itemText = (TextView)itemView.findViewById(R.id.focusingText);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.focusing_card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        ViewHolder viewHolder = (ViewHolder)holder;
        viewHolder.itemTitle.setText(positiveFocusingTitles[i]);
        viewHolder.itemText.setText(positiveFocusingText[i]);
    }
    @Override public int getItemCount(){
        return positiveFocusingTitles.length;
    }

}