package com.example.a21_fragmentexample;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerMessengerAdapter extends FragmentPagerAdapter {

    public ViewPagerMessengerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new ChatFragment();
        }else if (position == 1){
            return new StatusFragment();
        }else { //position == 2
            return new CallsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3; //number of tabs - actually counts of fragment -
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "Chat";
        }else if (position == 1){
            return "Status";
        }else { //position == 2
            return "Call";
        }
    }
}
