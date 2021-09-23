package com.zs.itking.mybottombarviewpager;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;
import com.zs.itking.mybottombarviewpager.adapter.MyPagerAdapter;
import com.zs.itking.mybottombarviewpager.fragment.FourFragment;
import com.zs.itking.mybottombarviewpager.fragment.MainFragment;
import com.zs.itking.mybottombarviewpager.fragment.ThreeFragment;
import com.zs.itking.mybottombarviewpager.fragment.TwoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BottomBar bottomBar;

//    private ViewPager viewPager;

    private List<Fragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
//        viewPager = (ViewPager) findViewById(R.id.viewPager);
        initViewPager();

        bottomBar.getTabWithId(R.id.tab3).setBadgeCount(5);
        //选定的BottomBarTab更改时被触发——当前处于Item时点击其它Item
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId) {
                    case R.id.tab1:
//                        viewPager.setCurrentItem(0);
                        Toast.makeText(MainActivity.this, "tab1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.tab2:
//                        viewPager.setCurrentItem(1);
                        Toast.makeText(MainActivity.this, "tab2", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.tab3:
                        //                      viewPager.setCurrentItem(2);
                        Toast.makeText(MainActivity.this, "tab3", Toast.LENGTH_SHORT).show();
                        bottomBar.getTabWithId(R.id.tab3).removeBadge();
                        break;
                    case R.id.tab4:
                        //                      viewPager.setCurrentItem(3);
                        Toast.makeText(MainActivity.this, "tab4", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        // 当前选择的BottomBarTab被单击时触发——当前处于Item时再次点击当前Item
        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onTabReSelected(@IdRes int tabId) {
                switch (tabId) {
                    case R.id.tab1:
                        //           viewPager.setCurrentItem(0);
                        Toast.makeText(MainActivity.this, "再次点击了tab1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.tab2:
                        //           viewPager.setCurrentItem(1);
                        Toast.makeText(MainActivity.this, "再次点击了tab2", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.tab3:
                        //       viewPager.setCurrentItem(2);
                        Toast.makeText(MainActivity.this, "再次点击了tab3", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.tab4:
                        //        viewPager.setCurrentItem(3);
                        Toast.makeText(MainActivity.this, "再次点击了tab4", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    private void initViewPager() {
        fragmentList = new ArrayList<>();
        fragmentList.add(new MainFragment());
        fragmentList.add(new TwoFragment());
        fragmentList.add(new ThreeFragment());
        fragmentList.add(new FourFragment());
//        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), fragmentList));
//        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            //选择新页面时调用
//            @Override
//            public void onPageSelected(int position) {
//                bottomBar.selectTabAtPosition(position, true);
//            }
//
//            //当滚动状态改变时调用，用于发现用户何时开始拖动
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });

    }
}