package com.qiangnongzi.app;

import com.qiangnongzi.fragment.BaseFragment;
import com.qiangnongzi.fragment.FLfragment;
import com.qiangnongzi.fragment.GWCfragment;
import com.qiangnongzi.fragment.HDfragment;
import com.qiangnongzi.fragment.SYfragment;
import com.qiangnongzi.fragment.WDfragment;
import com.qiangnongzi.view.CustomTabView;
import com.qiangnongzi.view.CustomTabView.ontabSelectedListener;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

	private CustomTabView tab;

	private FragmentManager fm;
	private BaseFragment syFragment, flFragment, hdFragment, gwcFragment, wdFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fm = getSupportFragmentManager();
		setContainer();
		setTab();
		showFragment(syFragment);
	}

	private void setTab() {
		// TODO Auto-generated method stub
		tab = (CustomTabView) findViewById(R.id.fragment_tab);
		tab.setOnSelectedListener(new ontabSelectedListener() {

			@Override
			public void onSelected(int selectedIndex) {
				// TODO Auto-generated method stub

				switch (selectedIndex) {
				case 1:
					showFragment(syFragment);
					break;
				case 2:
					showFragment(flFragment);
					break;
				case 3:
					showFragment(hdFragment);
					break;
				case 4:
					showFragment(gwcFragment);
					break;
				case 5:
					showFragment(wdFragment);
					break;

				default:
					break;
				}
			}
		});
	}

	private void setContainer() {
		// TODO Auto-generated method stub
		FragmentTransaction ft = fm.beginTransaction();
		syFragment = new SYfragment();
		flFragment = new FLfragment();
		hdFragment = new HDfragment();
		gwcFragment = new GWCfragment();
		wdFragment = new WDfragment();
		ft.add(R.id.fragment_content, syFragment);
		ft.add(R.id.fragment_content, flFragment);
		ft.add(R.id.fragment_content, hdFragment);
		ft.add(R.id.fragment_content, gwcFragment);
		ft.add(R.id.fragment_content, wdFragment);
		ft.commit();
	}
	

	private void hideAll() {
		FragmentTransaction ft = fm.beginTransaction();
		ft.hide(syFragment);
		ft.hide(flFragment);
		ft.hide(hdFragment);
		ft.hide(gwcFragment);
		ft.hide(wdFragment);
		ft.commit();
	}

	private void showFragment(BaseFragment fragment) {

		hideAll();
		fm.beginTransaction().show(fragment).commit();
	}

}
