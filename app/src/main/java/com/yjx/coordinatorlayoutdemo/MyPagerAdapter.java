package com.yjx.coordinatorlayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * @author: yjx
 * @date: 2019/4/6 10:41
 * @desc
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<String> mData = new ArrayList<>();

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        mData.add("fragment1");
        mData.add("fragment2");
        mData.add("fragment3");
    }

    @Override
    public Fragment getItem(int i) {
        return MyFragment.getInstance();
    }

    @Override
    public int getCount() {
        return mData.size();
    }
}
