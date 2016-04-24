package edu.fau.kmillwood.healthythinking;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Khalil on 3/7/2016.
 */
public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;
    public TabPagerAdapter(FragmentManager fm, int numberOfTabs)
    {
        super(fm);
        this.tabCount = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch(position)
        {
            case 0:
                HomeFragment tab1 = new HomeFragment();
                return tab1;
            case 1:
                IdentifyingFragment tab2 = new IdentifyingFragment();
                return tab2;
            case 2:
                FocusingFragment tab3 = new FocusingFragment();
                return tab3;
            case 3:
                PracticingFragment tab4 = new PracticingFragment();
                return tab4;
            default:
                return null;

        }
    }

    @Override
    public int getCount()
    {
        return tabCount;
    }
}
