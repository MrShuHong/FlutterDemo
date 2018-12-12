package com.haocang.flutterinandroid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.flutter.facade.Flutter;

public class HomeFragment extends Fragment {

    private FragmentActivity activity;
    private FragmentManager childFragmentManager;
    private FragmentManager supportFragmentManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.flutter_main, container, false);
        View btn_flutter = inflate.findViewById(R.id.btn_flutter);
        activity = getActivity();
        childFragmentManager = getChildFragmentManager();
        supportFragmentManager = activity.getSupportFragmentManager();
        btn_flutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment homeFragment = Flutter.createFragment("home");
                childFragmentManager.beginTransaction()
                        .add(R.id.container,homeFragment)
//                        .add(homeFragment,"home")
                        .commit();
            }
        });
        return inflate;
    }
}
