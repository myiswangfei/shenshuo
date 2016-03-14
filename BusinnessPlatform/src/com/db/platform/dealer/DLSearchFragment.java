package com.db.platform.dealer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.db.platform.R;

/**
 * 经销商查询页面
 * @author wangfei
 */
public class DLSearchFragment extends Fragment{
	private View view;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.dealer_collect, null);
		return view;
	}
	
}
