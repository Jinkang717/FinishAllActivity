package com.example.finshall;


import com.example.util.ActivityCollector;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThirdActivity extends BaseActivity{
	private Button bt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third);
		bt=(Button)findViewById(R.id.button3);
		bt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ActivityCollector.finishAll();

			}
		});
	}
}