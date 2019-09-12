package com.qiangnongzi.view;

import com.qiangnongzi.app.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

@SuppressLint("InflateParams")
public class CustomTabView extends LinearLayout {

	private ImageView custom_tab_sy_iv, custom_tab_fl_iv, custom_tab_hd_iv, custom_tab_gwc_iv, custom_tab_wd_iv;

	private int icon_drawable[] = { R.drawable.icon_sy, R.drawable.icon_fl, R.drawable.icon_gwc, R.drawable.icon_wd };
	private int icon_drawable_selected[] = { R.drawable.icon_sy_selected, R.drawable.icon_fl_selected,
			R.drawable.icon_gwc_selected, R.drawable.icon_wd_selected };

	private ontabSelectedListener selectedListener;

	public CustomTabView(Context context) {
		this(context, null, 0);

	}

	public CustomTabView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public CustomTabView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
		if (!isInEditMode()) {
			LayoutInflater.from(context).inflate(R.layout.custom_tabview_layout, this);
			initViews();
		}
	}

	private void initViews() {
		// TODO Auto-generated method stub
		custom_tab_sy_iv = (ImageView) findViewById(R.id.custom_tab_sy_iv);
		custom_tab_fl_iv = (ImageView) findViewById(R.id.custom_tab_fl_iv);
		custom_tab_hd_iv = (ImageView) findViewById(R.id.custom_tab_hd_iv);
		custom_tab_gwc_iv = (ImageView) findViewById(R.id.custom_tab_gwc_iv);
		custom_tab_wd_iv = (ImageView) findViewById(R.id.custom_tab_wd_iv);

		custom_tab_sy_iv.setOnClickListener(onClick);
		custom_tab_fl_iv.setOnClickListener(onClick);
		custom_tab_hd_iv.setOnClickListener(onClick);
		custom_tab_gwc_iv.setOnClickListener(onClick);
		custom_tab_wd_iv.setOnClickListener(onClick);

		setSelectedIndex(1);
	}

	OnClickListener onClick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			resetALL();

			switch (v.getId()) {
			case R.id.custom_tab_sy_iv:
				setSelected(custom_tab_sy_iv,0);
				toListener(1);
				break;
			case R.id.custom_tab_fl_iv:
				setSelected(custom_tab_fl_iv,1);
				toListener(2);
				break;
			case R.id.custom_tab_hd_iv:
				toListener(3);
				break;

			case R.id.custom_tab_gwc_iv:
				setSelected(custom_tab_gwc_iv,2);
				toListener(4);
				break;
			case R.id.custom_tab_wd_iv:
				setSelected(custom_tab_wd_iv,3);
				toListener(5);
				break;
			default:
				break;
			}
		}
	};

	public void setSelectedIndex(int index) {
		resetALL();
		switch (index) {
		case 1:
			setSelected(custom_tab_sy_iv, 0);
			break;
		case 2:
			setSelected(custom_tab_fl_iv, 1);
			break;

		case 3:

			break;

		case 4:
			setSelected(custom_tab_gwc_iv, 2);
			break;

		case 5:
			setSelected(custom_tab_wd_iv, 3);
			break;

		default:
			break;
		}

	}

	public void setOnSelectedListener(ontabSelectedListener listener) {

		this.selectedListener = listener;
	}

	private void setSelected(ImageView iv, int resourceIndex) {
		iv.setImageResource(icon_drawable_selected[resourceIndex]);
	}

	protected void resetALL() {
		// TODO Auto-generated method stub
		custom_tab_sy_iv.setImageResource(icon_drawable[0]);
		custom_tab_fl_iv.setImageResource(icon_drawable[1]);
		custom_tab_gwc_iv.setImageResource(icon_drawable[2]);
		custom_tab_wd_iv.setImageResource(icon_drawable[3]);
	}

	private void toListener(int index) {

		if (selectedListener != null) {
			selectedListener.onSelected(index);
		}
	}

	public interface ontabSelectedListener {

		public void onSelected(int selectedIndex);
	}
}
