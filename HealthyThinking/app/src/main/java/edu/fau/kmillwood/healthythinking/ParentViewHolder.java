package edu.fau.kmillwood.healthythinking;

/**
 * Created by Khalil on 4/8/2016.
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;



public class ParentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private ParentListItemExpandCollapseListener mParentListItemExpandCollapseListener;
    private boolean mExpanded;


    public interface ParentListItemExpandCollapseListener {

        //called when item is expanded
        void onParentListItemExpanded(int position);

        //called when item is collapsed
        void onParentListItemCollapsed(int position);
    }

    public ParentViewHolder(View itemView) {

        super(itemView);
        mExpanded = false;
    }

     public void setMainItemClickToExpand() {

         itemView.setOnClickListener(this);
     }

    //return true if expanded, false if not
    public boolean isExpanded() {
        return mExpanded;
    }


    //return true if expanded, false if not
    public void setExpanded(boolean expanded) {
        mExpanded = expanded;
    }

    /**
     81      * Callback triggered when expansion state is changed, but not during
     82      * initialization.
     83      * <p>
     84      * Useful for implementing animations on expansion.
     85      *
     86      * @param expanded true if view is expanded before expansion is toggled,
     87      *                 false if not
     88      */
    public void onExpansionToggled(boolean expanded) {

    }

    //@return The {@link ParentListItemExpandCollapseListener} set in the {@link ParentViewHolder}
    public ParentListItemExpandCollapseListener getParentListItemExpandCollapseListener() {

        return mParentListItemExpandCollapseListener;
    }

    /**
     104      * Setter for the {@link ParentListItemExpandCollapseListener} implemented in
     107      * @param parentListItemExpandCollapseListener The {@link ParentListItemExpandCollapseListener} to set on the {@link ParentViewHolder}
     108      */
    public void setParentListItemExpandCollapseListener(ParentListItemExpandCollapseListener parentListItemExpandCollapseListener) {

        mParentListItemExpandCollapseListener = parentListItemExpandCollapseListener;
    }


     /**
     114      * {@link android.view.View.OnClickListener} to listen for click events on
     115      * the entire parent {@link View}.
     116      * <p>
     117      * Only registered if {@link #shouldItemViewClickToggleExpansion()} is true.
     118      *
     119      * @param v The {@link View} that is the trigger for expansion
     120      */
    @Override
    public void onClick(View v) {

        if (mExpanded) {
            collapseView();
        } else {
            expandView();
        }
    }


    /**
     131      * Used to determine whether a click in the entire parent {@link View}
     132      * should trigger row expansion.
     133      * <p>
     134      * If you return false, you can call {@link #expandView()} to trigger an
     135      * expansion in response to a another event or {@link #collapseView()} to
     136      * trigger a collapse.
     137      *
     138      * @return true to set an {@link android.view.View.OnClickListener} on the item view
     139      */
    public boolean shouldItemViewClickToggleExpansion() {
        return true;
    }


    //Triggers expansion of the parent.
    protected void expandView() {

        setExpanded(true);
        onExpansionToggled(false);


        if (mParentListItemExpandCollapseListener != null) {

            mParentListItemExpandCollapseListener.onParentListItemExpanded(getAdapterPosition());
        }
    }



    // Triggers collapse of the parent.
    protected void collapseView() {

        setExpanded(false);
        onExpansionToggled(true);


        if (mParentListItemExpandCollapseListener != null) {

            mParentListItemExpandCollapseListener.onParentListItemCollapsed(getAdapterPosition());
        }
    }
}
