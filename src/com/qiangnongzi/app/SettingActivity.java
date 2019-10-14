package com.qiangnongzi.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class SettingActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting_layout);
		findviews();
	}

	private void findviews() {
		// TODO Auto-generated method stub
		findViewById(R.id.setting_activity_touxiang_content).setOnClickListener(this);
		findViewById(R.id.setting_activity_nicheng_content).setOnClickListener(this);
		findViewById(R.id.setting_activity_fapiao_content).setOnClickListener(this);
		findViewById(R.id.setting_activity_mima_content).setOnClickListener(this);
		findViewById(R.id.setting_activity_logout_content).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.setting_activity_touxiang_content:

			break;
		case R.id.setting_activity_nicheng_content:

			break;
		case R.id.setting_activity_fapiao_content:
			toFapiao();
			break;
		case R.id.setting_activity_mima_content:
			toChangepwd();

			break;
		case R.id.setting_activity_logout_content:

			break;

		default:
			break;
		}
	}

	private void toChangepwd() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, ChangepwdActivity.class);
		startActivity(intent);
	}

	private void toFapiao() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, FapiaoActivity.class);
		startActivity(intent);
	}

}
