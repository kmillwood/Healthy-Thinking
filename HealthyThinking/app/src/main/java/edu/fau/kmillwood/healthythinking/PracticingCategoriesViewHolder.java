package edu.fau.kmillwood.healthythinking;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Khalil on 4/8/2016.
 */
public class PracticingCategoriesViewHolder extends ParentViewHolder {
    public TextView itemCategory;


    public PracticingCategoriesViewHolder(View itemView) {
        super(itemView);
        itemCategory = (TextView)itemView.findViewById(R.id.practicingCategory);

    }

    public void bind(Category category) {
        itemCategory.setText(category.getName());
    }
}
