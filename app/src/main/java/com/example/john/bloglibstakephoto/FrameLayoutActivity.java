package com.example.john.bloglibstakephoto;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by john on 2017/3/24.
 */

public class FrameLayoutActivity extends AppCompatActivity {

    private FragmentTakePhoto takePhotoFragment = null;
    private FragmentManager manager = null;
    private FragmentTransaction fragmentTransaction = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_layout);

        //加载FragmentTakePhoto
        manager = getSupportFragmentManager();
        fragmentTransaction = manager.beginTransaction();
        if(takePhotoFragment == null){
            takePhotoFragment = new FragmentTakePhoto();
            fragmentTransaction.replace(R.id.frame_layout,takePhotoFragment);
        }else{
            fragmentTransaction.show(takePhotoFragment);
        }
        fragmentTransaction.commit();
    }
}
