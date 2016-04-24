package edu.fau.kmillwood.healthythinking;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Khalil on 4/8/2016.
 */
public class ExpandableRecyclerAdapterPracticing extends  ExpandableRecyclerAdapter<PracticingCategoriesViewHolder,PracticingTitlesViewHolder> {

    //private LayoutInflater mInflater;
    private String[] positivePracticingDetail = {
            "",
            "Refrain from telling yourself \"I can\'t\" or you might actually start to believe it. Tell yourself you will do your best or that you will try your hardest instead.",
            "Don’t let negative thoughts and feelings get the better of you when you’re feeling down. Even if it’s only for a few hours a day, push your negativity aside and only focus on the good things in your life.",
            "Repeat positive statements to yourself like \"I know I can\", \"I deserve to be happy\", \"I will find love\", or \"Nothing is going to stop me from reaching my goal\" on a regular basis. This constant reminder can make your outlook on life more positive.",
            "It is important to believe in yourself. In order to become successful, you have to believe in your abilities. Throw away any doubt you have and believe that you will succeed at achieving your goals.",
            "Give yourself some time to think about the things that brought you to your current situation so you can avoid future mistakes and look forward to a better tomorrow.",
            "Learn to forgive yourself for the mistakes you have made. Making mistakes are apart of being human. You can not go back and change what has already happened. It is important that you  move on with the rest of your life.",
            "As of now, there is no way that you can go back in the past and change how events unfolded. With that being said, whenever you find yourself dwelling about the negative things that occurred in the past replace those thoughts with positive optimism about the future.",
            "Sometimes negative things in our life unexpectedly present us with opportunities that we would not have the drive to follow if it was not for this mishap.",
            "",
            "Giving yourself unnecessary and unjust criticism will do you no good, It will put you in a bad mood. If you choose to criticize yourself, then make sure it is constructive so that you can grow and learn from a situation.",
            "Sometimes it is beneficial to picture the success of a task. This can help you keep positive mind frame during the task and give you that extra boost needed to excel.",
            "Surrounding yourself with pictures and mementos that make you happy can help you create a positive environment.",
            "Sometimes the most appropriate way to handle a negative situation is to relax and let it take their course. Sometimes things are out of your control; there is no point to stress over things that are out of your control.",
            "Sometimes it is best to look at things from a different point of view. It came help you pin point what went wrong and help you understand another individual\'s point of view.",
            "You are the only one that can make yourself feel a certain way. Take it easy and lay off the negative talk. It will help you in the long run.",
            "You have to truly believe that you are the best at what you do even if at first you are not, fake it until you make it. Try to ignore all negativity and strive to be the best.",
            "Do not let negative coworkers bring you down. You must keep a positive attitude. You can not strive to be the best with a negative attitude.",
            "",
            "Hang out with friends or family members that always keep a positive attitude. They can be very helpful by putting you in a positive mood about anything that it is happening in life.",
            "Knowing that you have dependable individuals in your life can be quite comforting. It is good to share your thoughts with them to relieve some pressure.",
            "Try doing something nice for someone you care about. You will feel good that you brought them happiness.",
            "Never forget about yourself. Always treat yourself with the things that you love.",
            "Remember that there is always someone who is in a worst position than you. Remind yourself of your blessings no matter how small they may be.",
            "Avoid bringing negativity in the air. Try to work together with a family member or friend to make sure that a specific incident does not occur again.",
            "Do not be ashamed to let out your inner kid. It is a great way to relieve stress and lift your mood.",
            "",
            "If you’re in need of some inspiring try getting inspired by reading someone else's words to uplift your spirit.",
            "If you're having a bad day, then pop in your favorite movie to distract you from whatever was bothering you.",
            "When you've had a bad day, make sure to stay away from the news. Majority of the news is filled with sad stories that are going to make things worst.",
            "Music can be a great mood enhancer. Music has no discrimination to any location. Whenever you need that extra boost, put on some music and jam.",
            "By clearing your mind and relaxing you can get rid of a good amount of negativity that may be troubling you. ",
            "A good way to distract your negative feelings is to leave the area that is causing them and turn on your adventure mode.",
            "Negativity brings about a lot of destructive feelings and one way to combat that is by creating something that is going to make you proud.",
            "",
            "A good way to deal with a challenge is to have confidence in yourself no matter how slim things make be. Eventually ",
            "Along your pathway to success you’re going to encounter some roadblocks. Understand that these aren’t necessarily there to stop you from doing what you want, just to ensure that you truly want it.",
            "Taking on a huge project can be overwhelming. Take things one step at a time and chip away at your goal until you achieve it.",
            "Don't give up chasing something you truly want. Changes in life aren't always easy and giving up is taking the easy way out. Don't let negativity get the best of you, fight for what you believe in and never lose your confidence.",
            "Change doesn't necessarily mean the end of happiness. Learn to adapt and appreciate something different. The world and everything in it is always in constant motion.",
            "Time will ultimately heal everything. Nothing lasts forever so when you're are dealing with grief of a situation take it day by day and let time heal all.",
            "",
            "You have been blessed with life. Take some time to appreciate the beautiful things in life and allow them to lift your spirits.",
            "Remember that you are in charge of those negative thoughts that cloud your mind. They do not control you; stop them before the get deeply embedded in your consciousness.",
            "Never take a good thing for granted no matter how small it may be. Do not get caught up in all the bad stuff that you are experiencing. Take time to appreciate the good things.",
            "Always remember that there is good in the world. Do not let a few bad situations change your outlook on the world. In the end, everything will balance itself out.",
            "There are always a million reason for someone to not to do something they really want. Do not let them excuses cost you your happiness because your happiness is the most important.",
            "You are in control of your own destiny. Always keep that in mind. Only take advice from individuals whose trying to help you during the journey of life.",
            "Only you have the capability of determining what you choose and choose not to do. Embrace that power and make positive decisions that are going to make you happy.",
            "It\'s good to dream big but do not set the bar too high as it can quite difficult reaching it. Set short term goals and use them as stepping stones to reach a long term goal.",
            "Sometimes the best thing you can do is to sleep on a problem and handle it the next day with a clear mind."
    };

    public ExpandableRecyclerAdapterPracticing(PracticingFragment context, List<Category> parentItemList) {
        super(parentItemList);
        //mInflater = LayoutInflater.from(context);
    }

    // onCreate ...
    @Override
    public PracticingCategoriesViewHolder onCreateParentViewHolder(ViewGroup parentViewGroup) {
        View v = LayoutInflater.from(parentViewGroup.getContext()).inflate(R.layout.practicing_parent_card_layout, parentViewGroup, false);
        return new PracticingCategoriesViewHolder(v);
    }

    @Override
    public PracticingTitlesViewHolder onCreateChildViewHolder(ViewGroup childViewGroup) {
        View v = LayoutInflater.from(childViewGroup.getContext()).inflate(R.layout.practicing_child_card_layout, childViewGroup, false);
        return new PracticingTitlesViewHolder(v);
    }

    // onBind ...
    @Override
    public void onBindParentViewHolder(PracticingCategoriesViewHolder viewHolder, int position, ParentListItem parentListItem) {
        Category category = (Category) parentListItem;
        viewHolder.bind(category);
    }

    @Override
    public void onBindChildViewHolder(PracticingTitlesViewHolder viewHolder, int position, Object childListItem) {
        Title titles = (Title) childListItem;
        viewHolder.bind(titles);
        viewHolder.itemDetail.setText(positivePracticingDetail[position]);
        viewHolder.itemDetail.setVisibility(View.GONE);
    }
}

