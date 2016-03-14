package com.db.platform.dealer;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.Toast;

import com.ab.view.ioc.AbIocView;
import com.ab.view.slidingmenu.SlidingMenu;
import com.db.platform.BaseActivity;
import com.db.platform.R;
import com.db.platform.dealer.adapter.DLFragmentAdapter;

/**
 * ��������ҳ Ĭ��չʾ�ղ�ҳ��
 * 
 * @author wangfei
 */
public class DealerMain extends BaseActivity implements OnClickListener {

	public static final int TAB_recently = 0;
	public static final int TAB_friends = 1;
	public static final int TAB_group = 2;

	private SlidingMenu menu;

	@AbIocView(id = R.id.viewpager)
	private ViewPager viewPager;

	@AbIocView(id = R.id.main_tab_collect)
	private RadioButton main_tab_collect;// �ղ�

	@AbIocView(id = R.id.main_tab_search)
	private RadioButton main_tab_search;// ��ѯ

	@AbIocView(id = R.id.main_tab_data)
	private RadioButton main_tab_data;// ��������

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// setBaseContentview(R.layout.dealermain);
		setBaseContentview(this, R.layout.dealermain);

	}

	@Override
	public void initview() {
		// TODO Auto-generated method stub
		super.initview();

		main_tab_collect.setOnClickListener(this);
		main_tab_search.setOnClickListener(this);
		main_tab_data.setOnClickListener(this);

		// SlidingMenu������
		menu = new SlidingMenu(this);
		menu.setMode(SlidingMenu.LEFT);
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		menu.setShadowWidthRes(R.dimen.shadow_width);
		menu.setShadowDrawable(R.drawable.shadow);
		menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		menu.setFadeDegree(0.35f);
		menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);

		// menu��ͼ��Fragment���
		menu.setMenu(R.layout.dealer_slidingmenu);
		getFragmentManager()
				.beginTransaction()
				.replace(R.id.sliending_menu_dealer,
						new DLLeft_Sliending_menu()).commit();

//		��ҳ����Fragment������
		DLFragmentAdapter adapter = new DLFragmentAdapter(
				getSupportFragmentManager());
		viewPager.setAdapter(adapter);

		viewPager.setOnPageChangeListener(new OnPageChangeListener() {
			@Override
			public void onPageSelected(int id) {
				switch (id) {
				case TAB_recently:
					main_tab_collect.setChecked(true);
					menu.setSlidingEnabled(true);
					// setBaseTitle(R.string.main_radio_recently);
					break;
				case TAB_friends:
					menu.setSlidingEnabled(false);
					main_tab_search.setChecked(true);
					// setBaseTitle(R.string.main_radio_friends);
					break;
				case TAB_group:
					menu.setSlidingEnabled(false);
					main_tab_data.setChecked(true);
					// setBaseTitle(R.string.main_radio_group);
					break;
				}
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}
			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});
	}

	@Override
	public void initdata() {
		// TODO Auto-generated method stub
		super.initdata();
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.main_tab_collect:// �ղ�
			viewPager.setCurrentItem(TAB_recently);
			break;
		case R.id.main_tab_search:// ��ѯ
			viewPager.setCurrentItem(TAB_friends);
			break;
		case R.id.main_tab_data:// Ⱥ��
			viewPager.setCurrentItem(TAB_group);
			break;
		}
	}

	private long mExitTime = 0;
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			if ((System.currentTimeMillis() - mExitTime) > 2000) {//
				// ������ΰ���ʱ��������2000���룬���˳�
				Toast.makeText(this, "�ٰ�һ���˳�����", Toast.LENGTH_SHORT).show();
				mExitTime = System.currentTimeMillis();// ����mExitTime
			} else {
				exitActivity();
				System.exit(0);// �����˳�����
			}
			return true;
		}
		return super.onKeyDown(keyCode, event);

	}

}
