package edu.fau.kmillwood.healthythinking;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PracticingFragment extends Fragment {

    RecyclerView recyclerView;
   // RecyclerView.LayoutManager layoutManager;
   // RecyclerView.Adapter adapter;

    private String[] positivePracticingTopicInfo = {
            "Refrain from telling yourself \"I can\'t\" or you might actually start to believe it. Tell yourself you will do your best or that you will try your hardest instead.",
            "Don’t let negative thoughts and feelings get the better of you when you’re feeling down. Even if it’s only for a few hours a day, push your negativity aside and only focus on the good things in your life.",
            "Repeat positive statements to yourself like \"I know I can\", \"I deserve to be happy\", \"I will find love\", or \"Nothing is going to stop me from reaching my goal\" on a regular basis. This constant reminder can make your outlook on life more positive.",
            "It is important to believe in yourself. In order to become successful, you have to believe in your abilities. Throw away any doubt you have and believe that you will succeed at achieving your goals.",
            "Give yourself some time to think about the things that brought you to your current situation so you can avoid future mistakes and look forward to a better tomorrow.",
            "Learn to forgive yourself for the mistakes you have made. Making mistakes are a part of being human. You can not go back and change what has already happened. It is important that you  move on with the rest of your life.",
            "As of now, there is no way that you can go back in the past and change how events unfolded. With that being said, whenever you find yourself dwelling about the negative things that occurred in the past replace those thoughts with positive optimism about the future.",
            "Sometimes negative things in our life unexpectedly present us with opportunities that we would not have the drive to follow if it was not for this mishap.",
            "Giving yourself unnecessary and unjust criticism will do you no good, It will put you in a bad mood. If you choose to criticize yourself, then make sure it is constructive so that you can grow and learn from a situation.",
            "Sometimes it is beneficial to picture the success of a task. This can help you keep positive mind frame during the task and give you that extra boost needed to excel.",
            "Surrounding yourself with pictures and mementos that make you happy can help you create a positive environment.",
            "Often things happen that are out of your control. Sometimes the most appropriate way to handle negative situations is to relax and let them take their course.",
            "It came help you pin point what went wrong and help you understand another individual\'s point of view.",
            "You are the only one that can make yourself feel a certain way. Take it easy and lay off the negative talk. It will help you in the long run.",
            "You have to truly believe that you are the best at what you do even if at first you are not, fake it until you make it. Try to ignore all negativity and strive to be the best.",
            "Do not let negative coworkers bring you down. You must keep a positive attitude. You can not strive to be the best with a negative attitude.",
            "Hang out with friends or family members that always keep a positive attitude. They can be very helpful by putting you in a positive mood about anything that it is happening in life.",
            "Knowing that you have dependable individuals in your life can be quite comforting. It is good to share your thoughts with them to relieve some pressure.",
            "Try doing something nice for someone you care about. You will feel good that you brought them happiness.",
            "Never forget about yourself. Always treat yourself with the things that you love.",
            "Remember that there is always someone who is in a worst position than you. Remind yourself of your blessings no matter how small they may be.",
            "Avoid bringing negativity in the air. Try to work together with a family member or friend to make sure that a specific incident does not occur again.",
            "Do not be ashamed to let out your inner kid. It is a great way to relieve stress and lift your mood.",
            "If you’re in need of some inspiring try getting inspired by reading someone else's words to uplift your spirit.",
            "If you're having a bad day, then pop in your favorite movie to distract you from whatever was bothering you.",
            "When you've had a bad day, make sure to stay away from the news. Majority of the news is filled with sad stories that are going to make things worst.",
            "Music can be a great mood enhancer. Music has no discrimination to any location. Whenever you need that extra boost, put on some music and jam.",
            "By clearing your mind and relaxing you can get rid of a good amount of negativity that may be troubling you. ",
            "A good way to distract your negative feelings is to leave the area that is causing them and turn on your adventure mode.",
            "Negativity brings about a lot of destructive feelings and one way to combat that is by creating something that is going to make you proud.",
            "If you don’t feel positive about a certain situation, pretend you are until you gain the experience or tools necessary for your goal. Though it might feel fake and forced in the beginning, soon it will become more natural until you are happier and healthier.",
            "Along your pathway to success you’re going to encounter some roadblocks. Understand that these aren’t necessarily there to stop you from doing what you want, just to ensure that you truly want it.",
            "Taking on a huge project can be overwhelming. Take things one step at a time and chip away at your goal until you achieve it.",
            "Don't give up chasing something you truly want. Changes in life aren't always easy and giving up is taking the easy way out. Don't let negativity get the best of you, fight for what you believe in and never lose your confidence.",
            "Change doesn't necessarily mean the end of happiness. Learn to adapt and appreciate something different. The world and everything in it is always in constant motion.",
            "Time will ultimately heal everything. Nothing lasts forever so when you're are dealing with grief of a situation take it day by day and let time heal all.",
            "You have been blessed with life. Take some time to appreciate the beautiful things in life and allow them to lift your spirits.",
            "Remember that you are in charge of those negative thoughts that cloud your mind. They do not control you; stop them before the get deeply embedded in your consciousness.",
            "Never take a good thing for granted no matter how small it may be. Do not get caught up in all the bad stuff that you are experiencing. Take time to appreciate the good things.",
            "Always remember that there is good in the world. Do not let a few bad situations change your outlook on the world. In the end, everything will balance itself out.",
            "There are always a million reasons for someone to not to do something they really want. Do not let those excuses cost you your happiness because your happiness is the most important.",
            "You are in control of your own destiny. Always keep that in mind. Only take advice from individuals who are trying to help you during the journey of life.",
            //"Only you have the capability of determining what you choose and choose not to do. Embrace that power and make positive decisions that are going to make you happy.",
            "It\'s good to dream big but do not set the bar too high as it can quite difficult to reach it. Set short term goals and use them as stepping stones to reach a long term goal.",
            "Sometimes the best thing you can do is to sleep on a problem and handle it the next day with a clear mind."
    };

    public PracticingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_practicing, container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /*recyclerView = (RecyclerView) getActivity().findViewById(R.id.recycler_view3);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapterPracticing();
        recyclerView.setAdapter(adapter);*/
        Topic positiveWords = new Topic("Only Use Positive Words When Talking",positivePracticingTopicInfo[0]);
        Topic feelings = new Topic("Push Out All Feelings That Aren't Positive",positivePracticingTopicInfo[1]);
        Topic affirmation = new Topic("Positive Affirmation",positivePracticingTopicInfo[2]);
        Topic believe = new Topic("Believe You Will Succeed",positivePracticingTopicInfo[3]);
        Topic analyze = new Topic("Analyze What Went Wrong",positivePracticingTopicInfo[4]);
        Topic forgive = new Topic("Forgive Yourself",positivePracticingTopicInfo[5]);
        Topic learnPast = new Topic("Learn From The Past",positivePracticingTopicInfo[6]);
        Topic thinkOpportunity = new Topic("Think Of It As An Opportunity",positivePracticingTopicInfo[7]);

        Category general = new Category(Arrays.asList(positiveWords, feelings, affirmation, believe,analyze,forgive,learnPast,thinkOpportunity),"GENERAL");

        Topic constructive = new Topic("Be Constructive",positivePracticingTopicInfo[8]);
        Topic visualize = new Topic("Visualize A Successful Outcome",positivePracticingTopicInfo[9]);
        Topic images = new Topic("Surround Yourself With Positive Images",positivePracticingTopicInfo[10]);
        Topic relax = new Topic("Relax And Let Things Happen",positivePracticingTopicInfo[11]);
        Topic anotherView = new Topic("See It From Another Point Of View",positivePracticingTopicInfo[12]);
        Topic ownCritic = new Topic("Stop Being Your Own Worst Critic",positivePracticingTopicInfo[13]);
        Topic believeYourself = new Topic("Believe In Yourself",positivePracticingTopicInfo[14]);
        Topic negCoworkers = new Topic("Avoid Negative Coworkers",positivePracticingTopicInfo[15]);

        Category atWork = new Category(Arrays.asList(constructive, visualize, images, relax,anotherView,ownCritic,believeYourself,negCoworkers),"AT WORK");

        Topic others = new Topic("Benefit From The Attitudes Of Others",positivePracticingTopicInfo[16]);
        Topic share = new Topic("Find Someone To Share With",positivePracticingTopicInfo[17]);
        Topic nice = new Topic("Do Something Nice",positivePracticingTopicInfo[18]);
        Topic indulge = new Topic("Indulge Yourself",positivePracticingTopicInfo[19]);
        Topic blessings = new Topic("Remind Yourself Of Your Blessings",positivePracticingTopicInfo[20]);
        Topic blame = new Topic("Avoid Laying Blame",positivePracticingTopicInfo[21]);
        Topic play = new Topic("Be Playful",positivePracticingTopicInfo[22]);

        Category familyAndPersonalLife = new Category(Arrays.asList(others, share, nice, indulge,blessings,blame,play),"FAMILY AND PERSONAL LIFE");

        Topic book = new Topic("Read An Inspiring Book",positivePracticingTopicInfo[23]);
        Topic movie = new Topic("Watch Your Favorite Movie",positivePracticingTopicInfo[24]);
        Topic news = new Topic("Take A Break From The News",positivePracticingTopicInfo[25]);
        Topic music = new Topic("Listen To Some Feel Good Music",positivePracticingTopicInfo[26]);
        Topic mediate = new Topic("Mediate",positivePracticingTopicInfo[27]);
        Topic explore = new Topic("Explore The World Around You",positivePracticingTopicInfo[28]);
        Topic create = new Topic("Create Something",positivePracticingTopicInfo[29]);

        Category funAndRelaxation = new Category(Arrays.asList(book, movie, news, music,mediate,explore,create), "FUN AND RELAXATION");

        Topic fake = new Topic("Fake It Till You Make It",positivePracticingTopicInfo[30]);
        Topic obstacles = new Topic("Understand The Obstacles Are There To Challenge",positivePracticingTopicInfo[31]);
        Topic small = new Topic("Start Small",positivePracticingTopicInfo[32]);
        Topic dontQuit = new Topic("Don't Let Yourself Quit",positivePracticingTopicInfo[33]);
        Topic change = new Topic("Face Up To Change",positivePracticingTopicInfo[34]);
        Topic notForever = new Topic("Understand That The Situation Is Not Forever",positivePracticingTopicInfo[35]);

        Category facingChallenges = new Category(Arrays.asList(fake, obstacles, small, dontQuit,change,notForever), "FACING CHALLENGES");

        Topic beauty = new Topic("See The Beauty In Everything",positivePracticingTopicInfo[36]);
        Topic inControl= new Topic("Realize That Your Thoughts Do Not Own You",positivePracticingTopicInfo[37]);
        Topic goodThings = new Topic("Accept The Good Things",positivePracticingTopicInfo[38]);
        Topic goodWorld = new Topic("Believe That There Is Good In The World",positivePracticingTopicInfo[39]);
        Topic noExcuses = new Topic("Stop Making Excuses",positivePracticingTopicInfo[40]);
        Topic future = new Topic("Don't Place Your Future In Someone Else's Hands",positivePracticingTopicInfo[41]);
        Topic goals = new Topic("Create Realistic Goals",positivePracticingTopicInfo[42]);
        Topic freshEyes = new Topic("Look At Things With Fresh Eyes",positivePracticingTopicInfo[43]);

        Category dailyAttitude = new Category(Arrays.asList(beauty,inControl, goodThings, goodWorld, noExcuses,future,goals,freshEyes), "DAILY ATTITUDE");

        List<Category> categories = Arrays.asList(general,atWork,familyAndPersonalLife,funAndRelaxation,facingChallenges,dailyAttitude);

        recyclerView = (RecyclerView) getActivity().findViewById(R.id.recycler_view3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ExpandableRecyclerAdapterPracticing adapter = new ExpandableRecyclerAdapterPracticing(this,categories);
        recyclerView.setAdapter(adapter);
    }

}
