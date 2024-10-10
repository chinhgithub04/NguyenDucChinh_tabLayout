package com.example.nguyenducchinh_tablayout.profile;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.nguyenducchinh_tablayout.fragment.CartFragment;
import com.example.nguyenducchinh_tablayout.fragment.HomeFragment;
import com.example.nguyenducchinh_tablayout.fragment.ProfileFragment;

public class ProfileViewPagerAdapter extends FragmentStatePagerAdapter {


    public ProfileViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Tab1Fragment();
            case 1:
                return new Tab2Fragment();
            case 2:
                return new Tab3Fragment();
            default:
                return new Tab1Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Mã sinh viên";
            case 1:
                return "Lớp sinh hoạt";
            case 2:
                return "Lớp học phần";
            default:
                return "Mã sinh viên";
        }
    }
}
