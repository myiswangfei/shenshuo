package com.db.platform.dealer.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.db.platform.MainActivity;
import com.db.platform.dealer.DealerMain;
import com.db.platform.dealer.DLConllectFragment;
import com.db.platform.dealer.DLSearchFragment;
import com.db.platform.dealer.DLMyDataFragment;
/**
 * 存放经销商首页三个Framgne的adapter
 * @author wangfei
 *
 */
public class DLFragmentAdapter extends FragmentPagerAdapter{
	public final static int TAB_COUNT = 3;
	public DLFragmentAdapter(FragmentManager fm) {
		super(fm);
	}
	@Override
	public Fragment getItem(int id) {
		switch (id) {
		case DealerMain.TAB_recently://最近聊天
			DLMyDataFragment recentlyFragment = new DLMyDataFragment();
			return recentlyFragment;
		case DealerMain.TAB_friends://好友
			DLConllectFragment friendsFragment = new DLConllectFragment();
			return friendsFragment;
		case DealerMain.TAB_group://群组 
			DLSearchFragment groupFragment = new DLSearchFragment();
			return groupFragment;
		}
		return null;
	}

	@Override
	public int getCount() {
		return TAB_COUNT;
	}
}
