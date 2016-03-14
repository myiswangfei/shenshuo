package com.db.platform;

import java.util.ArrayList;
import java.util.List;

import com.ab.activity.AbActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BaseActivity extends AbActivity{

	public static List<Activity> activity_list = new ArrayList<Activity>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}

	public void setBaseContentview(int layoutResID) {
		// TODO Auto-generated method stub
		setContentView(layoutResID);
		
		initview();
		initdata();
	}
	
	
	public void setBaseContentview(Activity activity,int layoutResID) {
		// TODO Auto-generated method stub
		setContentView(layoutResID);
		activity_list.add(activity);
		initview();
		initdata();
	}
	
	
	/**
	 * 设置标题内容id
	 * @param str
	 */
	public void setBaseTitle(int str_id){
		TextView title_view = (TextView) this.findViewById(R.id.title_text);
		title_view.setText(str_id);
	}
	
	/**
	 * 设置标题内容String
	 * @param str
	 */
	public void setBaseTitle(String str){
		TextView title_view = (TextView) this.findViewById(R.id.title_text);
		title_view.setText(str);
	}
	
	/**
	 * 设置标题栏设置按钮隐藏
	 */
	public void setGIONSetting(){
		Button settting_but = (Button) this.findViewById(R.id.setting_but);
		settting_but.setVisibility(View.GONE);
	}
	
	public void initview(){
		
	}

	public void initdata(){
		
	}
	
	
	
	public void exitActivity(){
		for(int i=0;i<activity_list.size();i++){
			if(activity_list.get(i)!=null)
				activity_list.get(i).finish();
			}
		}
	}
	
	
	

