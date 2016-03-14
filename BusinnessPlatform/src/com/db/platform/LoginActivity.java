package com.db.platform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ab.view.ioc.AbIocView;
import com.db.platform.dealer.DealerMain;

/**
 * ��½
 * 
 * @author wangfei
 * 
 */
public class LoginActivity extends BaseActivity implements OnClickListener {

	@AbIocView(id = R.id.tex_register)
	TextView tex_register;// ע��

	@AbIocView(id = R.id.but_login)
	Button but_login;// ��½

	@AbIocView(id = R.id.tex_forget_pass)
	TextView tex_forget_pass;// ��������

	@AbIocView(id = R.id.login_username)
	EditText login_username;// �û���

	@AbIocView(id = R.id.login_userpass)
	EditText login_userpass;// ����

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.loginactivity);
		setBaseContentview(R.layout.loginactivity);
	}

@Override
public void initview() {
	// TODO Auto-generated method stub
	super.initview();
	tex_register.setOnClickListener(this);
	but_login.setOnClickListener(this);
	tex_forget_pass.setOnClickListener(this);
}
	
	
	
	
	
	@Override
	public void initdata() {
		// TODO Auto-generated method stub
		super.initdata();
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tex_register:// ����ע��

			Intent it = new Intent(LoginActivity.this,Register.class);
			startActivity(it);
			
			break;
			
		case R.id.tex_forget_pass:// ��������
			Intent fp = new Intent(LoginActivity.this,ForgetPassword.class);
			startActivity(fp);
			break;
			
		case R.id.but_login:// ��½

			/**
			 * ��½����4�����
			 */
			Intent ii = new Intent(LoginActivity.this,DealerMain.class);
			startActivity(ii);
			break;
		}
	}



}
