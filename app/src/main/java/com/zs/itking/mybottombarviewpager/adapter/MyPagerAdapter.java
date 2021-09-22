package com.zs.itking.mybottombarviewpager.adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by zhh on 2017/3/31.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    /**
     *  FragmentPagerAdapter:FragmentPagerAdapter适合使用在固定的数量较少的场景,最多可以保留3个
     *  FragmentStatePagerAdapter:
     * @param fm
     */
    private List<Fragment> fragments;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    public MyPagerAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.fragments = list;
    }


    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }

}
