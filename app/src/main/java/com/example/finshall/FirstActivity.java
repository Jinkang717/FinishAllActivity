package com.example.finshall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class FirstActivity extends BaseActivity {
	private Button bt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		bt=(Button)findViewById(R.id.button1);
		 bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
				startActivity(intent);
				
				
			}
		});
		
	}
}
