package com.minadoroudi.sudoku; 
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.annotation.TargetApi;

public class Prefs extends PreferenceFragment { 
	@Override
	public void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		addPreferencesFromResource(R.xml.settings);
	}
	
}