package org.crazyit.link;
//Download by http://www.codefans.net

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static org.crazyit.link.R.layout.wel;

public class Welcome extends Activity{

	// 开始按钮
	private Button startButton;
	// 退出按钮
	private Button outButton;
	// 设置按钮
	private Button setButton;
	// 信息按钮
	private Button infoButton;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(wel);

		// 获取开始按钮
		startButton = (Button) this.findViewById(R.id.startButton);
		// 获取退出按钮
		outButton = (Button) this.findViewById(R.id.outButton);
		// 获取设置按钮
		setButton = (Button) this.findViewById(R.id.setButton);
		// 获取信息按钮
		infoButton = (Button) this.findViewById(R.id.infoButton);

		startButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent();
				i.setClass(Welcome.this, Link.class);
				startActivity(i);
			}
		});
		setButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
		infoButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});
		outButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Welcome.this.finish();
			}
		});
	}



}
