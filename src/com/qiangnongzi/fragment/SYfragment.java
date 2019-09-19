package com.qiangnongzi.fragment;

import com.qiangnongzi.app.KefuActivity;
import com.qiangnongzi.app.QiangGouActivity;
import com.qiangnongzi.app.R;
import com.qiangnongzi.app.SearchActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class SYfragment extends BaseFragment implements OnClickListener {

	View rootview;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		// return super.onCreateView(inflater, container, savedInstanceState);
		rootview = inflater.inflate(R.layout.fragment_sy_layout, container, false);

		findviews();
		return rootview;

	}

	private void findviews() {
		// TODO Auto-generated method stub
		rootview.findViewById(R.id.fragment_sy_search_ed).setOnClickListener(this);
		rootview.findViewById(R.id.fragment_sy_kefu_tv).setOnClickListener(this);
		rootview.findViewById(R.id.fragment_sy_qianggou_content).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.fragment_sy_search_ed:
			toSearchActivity();

			break;

		case R.id.fragment_sy_kefu_tv:
			toKefuActivity();
			break;
		case R.id.fragment_sy_qianggou_content:
			toQianggouActivity();
			break;
		default:
			break;
		}
	}

	private void toQianggouActivity() {
		// TODO Auto-generated method stub
		Intent intent=new Intent(getActivity(), QiangGouActivity.class);
		startActivity(intent);
	}

	private void toKefuActivity() {
		// TODO Auto-generated method stub
		Intent intent=new Intent(getActivity(), KefuActivity.class);
		startActivity(intent);
	}

	private void toSearchActivity() {
		// TODO Auto-generated method stub

		Intent intent = new Intent(getActivity(), SearchActivity.class);
		startActivity(intent);
	}

}
