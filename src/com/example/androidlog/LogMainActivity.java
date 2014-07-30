package com.example.androidlog;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class LogMainActivity extends Activity {
	
	private static final String CATEGORIA = "TestLog";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_main);
                    
    	//Verbose
		Log.v(CATEGORIA, "Log to verbose");
		TextView verbose = (TextView)findViewById(R.id.textViewVerbose);
		verbose.setText("Executed log verbose");
		
		//Debug
		Log.d(CATEGORIA, "Log to debug");
		TextView debug = (TextView)findViewById(R.id.textViewDebug);
		debug.setText("Executed log debug");
		
		//Info
		Log.i(CATEGORIA, "Log to info");
		TextView info = (TextView)findViewById(R.id.textViewInfo);
		info.setText("Executed log info");
		
		//Warn
		Log.w(CATEGORIA, "Log to warn");
		TextView warn = (TextView)findViewById(R.id.textViewWarn);
		warn.setText("Executed log warn");
		
		//Error
		Log.e(CATEGORIA, "Log to error", new RuntimeException("test error"));
		TextView error = (TextView)findViewById(R.id.textViewError);
		error.setText("Executed log error");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.log_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
