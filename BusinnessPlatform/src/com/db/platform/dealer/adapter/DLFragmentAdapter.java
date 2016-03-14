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
 * ��ž�������ҳ����Framgne��adapter
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
		case DealerMain.TAB_recently://�������
			DLMyDataFragment recentlyFragment = new DLMyDataFragment();
			return recentlyFragment;
		case DealerMain.TAB_friends://����
			DLConllectFragment friendsFragment = new DLConllectFragment();
			return friendsFragment;
		case DealerMain.TAB_group://Ⱥ�� 
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
