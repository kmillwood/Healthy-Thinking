package edu.fau.kmillwood.healthythinking;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
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
        Title positiveWords = new Title("Only Use Positive Words When Talking");
        Title feelings = new Title("Push Out All Feelings That Aren't Positive");
        Title affirmation = new Title("Positive Affirmation");
        Title believe = new Title("Believe You Will Succeed");
        Title analyze = new Title("Analyze What Went Wrong");
        Title forgive = new Title("Forgive Yourself");
        Title learnPast = new Title("Learn From The Past");
        Title thinkOpportunity = new Title("Think Of It As An Opportunity");

        Category general = new Category(Arrays.asList(positiveWords, feelings, affirmation, believe,analyze,forgive,learnPast,thinkOpportunity),"GENERAL");

        Title constructive = new Title("Be Constructive");
        Title visualize = new Title("Visualize A Successful Outcome");
        Title images = new Title("Surround Yourself With Positive Images");
        Title relax = new Title("Relax And Let Things Happen");
        Title anotherView = new Title("See It From Another Point Of View");
        Title ownCritic = new Title("Stop Being Your Own Worst Critic");
        Title believeYourself = new Title("Believe In Yourself");
        Title negCoworkers = new Title("Avoid Negative Coworkers");

        Category atWork = new Category(Arrays.asList(constructive, visualize, images, relax,anotherView,ownCritic,believeYourself,negCoworkers),"AT WORK");

        Title others = new Title("Benefit From The Attitudes Of Others");
        Title share = new Title("Find Someone To Share With");
        Title nice = new Title("Do Something Nice");
        Title indulge = new Title("Indulge Yourself");
        Title blessings = new Title("Remind Yourself Of Your Blessings");
        Title blame = new Title("Avoid Laying Blame");
        Title play = new Title("Be Playful");

        Category familyAndPersonalLife = new Category(Arrays.asList(others, share, nice, indulge,blessings,blame,play),"FAMILY AND PERSONAL LIFE");

        Title book = new Title("Read An Inspiring Book");
        Title movie = new Title("Watch Your Favorite Movie");
        Title news = new Title("Take A Break From The News");
        Title music = new Title("Listen To Some Feel Good Music");
        Title mediate = new Title("Mediate");
        Title explore = new Title("Explore The World Around You");
        Title create = new Title("Create Something");

        Category funAndRelaxation = new Category(Arrays.asList(book, movie, news, music,mediate,explore,create), "FUN AND RELAXATION");

        Title fake = new Title("Fake It Till You Make It");
        Title obstacles = new Title("Understand The Obstacles Are There To Challenge");
        Title small = new Title("Start Small");
        Title dontQuit = new Title("Don't Let Yourself Quit");
        Title change = new Title("Face Up To Change");
        Title notForever = new Title("Understand That The Situation Is Not Forever");

        Category facingChallenges = new Category(Arrays.asList(fake, obstacles, small, dontQuit,change,notForever), "FACING CHALLENGES");

        Title beauty = new Title("See The Beauty In Everything");
        Title inControl= new Title("Realize That Your Thoughts Do Not Own You");
        Title goodThings = new Title("Accept The Good Things");
        Title goodWorld = new Title("Believe That There Is Good In The World");
        Title noExcuses = new Title("Stop Making Excuses");
        Title future = new Title("Don't Place Your Future In Someone Else's Hands");
        Title goals = new Title("Create Realistic Goals");
        Title freshEyes = new Title("Look At Things With Fresh Eyes");

        Category dailyAttitude = new Category(Arrays.asList(beauty,inControl, goodThings, goodWorld, noExcuses,future,goals,freshEyes), "DAILY ATTITUDE");

        List<Category> categories = Arrays.asList(general,atWork,familyAndPersonalLife,funAndRelaxation,facingChallenges,dailyAttitude);

        recyclerView = (RecyclerView) getActivity().findViewById(R.id.recycler_view3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ExpandableRecyclerAdapterPracticing adapter = new ExpandableRecyclerAdapterPracticing(this,categories);
        recyclerView.setAdapter(adapter);
    }

}
