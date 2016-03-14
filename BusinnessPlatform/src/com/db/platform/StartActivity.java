package com.db.platform;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Æô¶¯
 * @author wangfei
 *
 */
public class StartActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startactivity);
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			   @Override
			   public void run() {
			    Intent intent = new Intent(StartActivity.this, LoginActivity.class);
			    startActivity(intent);
			    StartActivity.this.finish();
			   }
			  };
		timer.schedule(task, 1000 * 3);
	}
}
