package com.mr.tengyu.wandroid.ui.project.adapter;

import com.mr.tengyu.wandroid.ui.project.fragmnet.DetailFragment;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyProjectVP_adapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> list;

    public MyProjectVP_adapter(FragmentManager fm, ArrayList<Fragment> list) {
        super ( fm );
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get ( position );
    }

    @Override
    public int getCount() {
        return list.size ();
    }
}
