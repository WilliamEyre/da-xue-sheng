package com.example.lenovo.daxiongmaozaixian.fragment;

import android.view.View;

import com.example.lenovo.daxiongmaozaixian.R;
import com.example.lenovo.daxiongmaozaixian.base.BaseFragment;
import com.example.lenovo.daxiongmaozaixian.login.LoginContract;
import com.example.lenovo.daxiongmaozaixian.login.LoginModel;
import com.example.lenovo.daxiongmaozaixian.login.LoginPresenter;

/**
 * Created by laptop on 2017/11/27.
 */
public class FragmentTest5 extends BaseFragment<LoginPresenter,LoginModel> implements LoginContract.View {
    @Override
    protected void initData() {

    }

    @Override
    public int getLayoutIdFragment() {
        return R.layout.fragment_five;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    public void show(String url) {

    }
}
