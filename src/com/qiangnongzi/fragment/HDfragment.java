package com.qiangnongzi.fragment;

import com.qiangnongzi.app.HDDetailActivity;
import com.qiangnongzi.app.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class HDfragment extends BaseFragment implements OnClickListener {

	View rootview;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		// return super.onCreateView(inflater, container, savedInstanceState);
		rootview = inflater.inflate(R.layout.fragment_hd_layout, container, false);
		findview();
		return rootview;
	}

	private void findview() {
		// TODO Auto-generated method stub

		rootview.findViewById(R.id.fragment_hd_itemcontnet1).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.fragment_hd_itemcontnet1:
			toHDDetailActivity();

			break;

		default:
			break;
		}
	}

	private void toHDDetailActivity() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(getActivity(), HDDetailActivity.class);
		startActivity(intent);
	}

}
