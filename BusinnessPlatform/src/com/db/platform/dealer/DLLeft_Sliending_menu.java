package com.db.platform.dealer;

import com.ab.fragment.AbFragment;
import com.db.platform.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 经销商侧滑菜单
 * @author wangfei
 *
 */
public class DLLeft_Sliending_menu extends AbFragment{
	private View view;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.dealerleft_sliending_menu, null);
		return view;
	}
	
	

}
