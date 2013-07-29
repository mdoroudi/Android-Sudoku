package com.minadoroudi.sudoku;

import android.content.Intent; 
import android.view.View; 
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class MainActivity extends Activity implements OnClickListener {

	
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.about_button:
			Intent i = new Intent(this, About.class);
			startActivity(i);
			break;
		}
	}

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // setup click listener for all the buttons
        View continueButton = findViewById(R.id.continue_button);
        continueButton.setOnClickListener(this); 
        View newButton = findViewById(R.id.new_button); 
        newButton.setOnClickListener(this);
        View aboutButton = findViewById(R.id.about_button); 
        aboutButton.setOnClickListener(this); 
        View exitButton = findViewById(R.id.exit_button); 
        exitButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
    	case R.id.action_settings:
    		startActivity(new Intent(this, Prefs.class));
    		return true;
    	// more items to click on menu go here  		
    	}
    	return false;
    }
    
}
