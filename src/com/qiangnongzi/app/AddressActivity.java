package com.qiangnongzi.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class AddressActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_address_layout);
		findviews();
	}

	private void findviews() {
		// TODO Auto-generated method stub
		findViewById(R.id.common_title_share_iv).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				toedit();
			}
		});
	}

	protected void toedit() {
		// TODO Auto-generated method stub
	
		Intent intent=new Intent(this, AddressEditActivity.class);
		startActivity(intent);
	}
	
	

}
