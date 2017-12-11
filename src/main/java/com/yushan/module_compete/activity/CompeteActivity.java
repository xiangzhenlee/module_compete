package com.yushan.module_compete.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.yushan.lib_base.base.BaseActivity;
import com.yushan.lib_base.base.BaseFragment;
import com.yushan.lib_base.base.ViewManager;
import com.yushan.lib_base.widget.NoScrollViewPager;
import com.yushan.lib_base.widget.TabRadioButton;
import com.yushan.module_compete.R;
import com.yushan.module_compete.adapter.FragmentAdapter;

import java.util.List;

@Route(path = "/module_compete/CompeteActivity")
public class CompeteActivity extends BaseActivity {

    private RadioGroup radioGroup;

    private NoScrollViewPager mPager;
    private List<BaseFragment> mFragments;
    private FragmentAdapter mAdapter;
    private TabRadioButton compete;
    private TabRadioButton club;
    private FragmentManager manager;
    private FragmentTransaction trans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compete);

        initViewPager();
        initView();
    }

    private void initViewPager() {
        mFragments = ViewManager.getInstance().getAllFragment();
        mPager = (NoScrollViewPager) findViewById(R.id.container_pager);
        mAdapter = new FragmentAdapter(getSupportFragmentManager(), mFragments);
        mPager.setPagerEnabled(false);
        mPager.setAdapter(mAdapter);
    }

    private void initView(){
        manager = getSupportFragmentManager();
        trans = manager.beginTransaction();

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        compete = (TabRadioButton) findViewById(R.id.radioBtn_compete);
        club = (TabRadioButton) findViewById(R.id.radioBtn_discovery);

        compete.setChecked(false);
        club.setChecked(true);

//        trans.replace(R.id.content, mCurrFragment);
//        trans.commitAllowingStateLoss();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                trans = manager.beginTransaction();
                if (checkedId == R.id.radioBtn_compete) {
                    mPager.setCurrentItem(1);

                } else if (checkedId == R.id.radioBtn_home) {

                } else if (checkedId == R.id.radioBtn_discovery) {
                    mPager.setCurrentItem(0);

                } else if (checkedId == R.id.radioBtn_myself) {
                }
            }
        });
    }
}
