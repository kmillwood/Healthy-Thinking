package edu.fau.kmillwood.healthythinking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Khalil on 4/8/2016.
 */
public class ExpandableRecyclerAdapterPracticing extends  ExpandableRecyclerAdapter<PracticingCategoriesViewHolder,PracticingTopicsViewHolder> {

    //private LayoutInflater mInflater;


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
    public PracticingTopicsViewHolder onCreateChildViewHolder(ViewGroup childViewGroup) {
        View v = LayoutInflater.from(childViewGroup.getContext()).inflate(R.layout.practicing_child_card_layout, childViewGroup, false);
        return new PracticingTopicsViewHolder(v);
    }

    // onBind ...
    @Override
    public void onBindParentViewHolder(PracticingCategoriesViewHolder viewHolder, int position, ParentListItem parentListItem) {
        Category category = (Category) parentListItem;
        viewHolder.bind(category);
    }

    @Override
    public void onBindChildViewHolder(PracticingTopicsViewHolder viewHolder, int position, Object childListItem) {
        Topic title= (Topic) childListItem;
        viewHolder.bind(title);


    }
}

