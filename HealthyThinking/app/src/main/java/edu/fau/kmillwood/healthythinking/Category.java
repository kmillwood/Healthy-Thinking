package edu.fau.kmillwood.healthythinking;

import java.util.List;

/**
 * Created by Khalil on 4/8/2016.
 */
public class Category implements ParentListItem {

    //a category contains several titles
    private List mTitles;
    private String cName;

    public Category(List titles,String name) {
        mTitles = titles;
        cName = name;
    }

    public String getName()
    {
        return cName;
    }

    @Override
    public List getChildItemList() {
        return mTitles;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }
}
