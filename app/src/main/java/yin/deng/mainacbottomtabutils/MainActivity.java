package yin.deng.mainacbottomtabutils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.next.easynavigation.view.EasyNavigationBar;

import java.util.ArrayList;
import java.util.List;

import yin.deng.bottomtabutils.BottomNavigationUtils;

public class MainActivity extends AppCompatActivity {
    private EasyNavigationBar navigationBar;
    MyFragment myFragment1;
    MyFragment myFragment2;
    MyFragment myFragment3;
    List<Fragment> fgs=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationBar = (EasyNavigationBar) findViewById(R.id.navigationBar);
        myFragment1=new MyFragment();
        myFragment2=new MyFragment();
        myFragment3=new MyFragment();
        fgs.add(myFragment1);
        fgs.add(myFragment2);
        fgs.add(myFragment3);
        String[]tabs=new String[]{"首页","发现","我的"};
        int[]res=new int[]{R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
        BottomNavigationUtils.getInstance().initNavigationBarNormalSetting(this,navigationBar,tabs,res,res,fgs).create(navigationBar);
    }
}
