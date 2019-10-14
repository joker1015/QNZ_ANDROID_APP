package com.qiangnongzi.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class EditFapiaoActivity extends Activity {
	private RadioGroup rg;

	private LinearLayout content1, content2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_editfapiao_layout);

		findviews();
	}

	private void findviews() {
		// TODO Auto-generated method stub
		content1 = (LinearLayout) findViewById(R.id.editfapiao_activity_content1);
		content2 = (LinearLayout) findViewById(R.id.editfapiao_activity_content2);
		rg = (RadioGroup) findViewById(R.id.editfapiao_radiogroup);
		rg.setOnCheckedChangeListener(listener);
	}

	OnCheckedChangeListener listener = new OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub
			if (checkedId == R.id.editfapiao_radiobutton1) {
				content1.setVisibility(View.VISIBLE);
				content2.setVisibility(View.GONE);
			} else {
				content1.setVisibility(View.GONE);
				content2.setVisibility(View.VISIBLE);
			}
		}
	};
}
