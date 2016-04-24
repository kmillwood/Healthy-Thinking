package edu.fau.kmillwood.healthythinking;


import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Khalil on 4/8/2016.
 */
public class PracticingTitlesViewHolder extends ChildViewHolder{

    public TextView itemTitle;
    public TextView itemDetail;

    public PracticingTitlesViewHolder(View itemView) {
        super(itemView);
        itemTitle = (TextView)itemView.findViewById(R.id.practicingInfo);
        itemDetail = (TextView)itemView.findViewById(R.id.practicingDetail);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int	pos = getAdapterPosition();

                if (itemDetail.getVisibility() == View.GONE) {
                    itemDetail.setVisibility(View.VISIBLE);
                } else {
                    itemDetail.setVisibility(View.GONE);
                }

                //Snackbar.make(v, "Click detected	on	item " + pos, Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }

    public void bind(Title title) {
        itemTitle.setText(title.getName());
    }
}
