package com.example.eltequito;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ArticleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ArticleFragmentPagerAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0) return new FoodListFragment();
        else return new DrinkListFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) return mContext.getString(R.string.food);
        else return mContext.getString(R.string.drink);
    }
}
