package com.qiangnongzi.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class FapiaoActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fapiao_layout);
		findviews();
	}

	private void findviews() {
		// TODO Auto-generated method stub
		findViewById(R.id.fapiao_activity_addnew_btn).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch (v.getId()) {
		case R.id.fapiao_activity_addnew_btn:
			toEditFapiao();
			break;

		default:
			break;
		}
	}

	private void toEditFapiao() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, EditFapiaoActivity.class);
		startActivity(intent);
	}

}
