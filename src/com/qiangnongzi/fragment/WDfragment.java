package com.qiangnongzi.fragment;

import com.qiangnongzi.app.AboutusActivity;
import com.qiangnongzi.app.AddressActivity;
import com.qiangnongzi.app.FeedbackActivity;
import com.qiangnongzi.app.LoginSMSActivity;
import com.qiangnongzi.app.R;
import com.qiangnongzi.app.SettingActivity;
import com.qiangnongzi.app.ZhaopinActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class WDfragment extends BaseFragment implements OnClickListener {

	private View rootview;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		// return super.onCreateView(inflater, container, savedInstanceState);
		// return inflater.inflate(R.layout.fragment_wd_layout, null);

		rootview = inflater.inflate(R.layout.fragment_wd_layout, container, false);

		findviews();
		return rootview;
	}

	private void findviews() {
		// TODO Auto-generated method stub
		rootview.findViewById(R.id.fragment_wd_address_iv).setOnClickListener(this);
		rootview.findViewById(R.id.fragment_wd_feedback_iv).setOnClickListener(this);
		rootview.findViewById(R.id.fragment_wd_aboutus_iv).setOnClickListener(this);
		rootview.findViewById(R.id.fragment_wd_zhaopin_iv).setOnClickListener(this);
		rootview.findViewById(R.id.fragment_wd_setting_tv).setOnClickListener(this);
		rootview.findViewById(R.id.fragment_wd_headimage_iv).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.fragment_wd_address_iv:
			toAddress();
			break;
		case R.id.fragment_wd_feedback_iv:
			toFeedback();
			break;
		case R.id.fragment_wd_aboutus_iv:
			toAbout();
			break;
		case R.id.fragment_wd_zhaopin_iv:
			toZhaopin();
			break;
		case R.id.fragment_wd_setting_tv:
			toSetting();
			break;
		case R.id.fragment_wd_headimage_iv:
			toLogin();
			break;
		default:
			break;
		}
	}

	private void toLogin() {
		// TODO Auto-generated method stub
		Intent intent=new Intent(getActivity(), LoginSMSActivity.class);
		startActivity(intent);
	}

	private void toSetting() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(getActivity(), SettingActivity.class);
		startActivity(intent);
	}

	private void toZhaopin() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(getActivity(), ZhaopinActivity.class);
		startActivity(intent);
	}

	private void toAbout() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(getActivity(), AboutusActivity.class);
		startActivity(intent);
	}

	private void toFeedback() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(getActivity(), FeedbackActivity.class);
		startActivity(intent);
	}

	private void toAddress() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(getActivity(), AddressActivity.class);
		startActivity(intent);
	}

}
