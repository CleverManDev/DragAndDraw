package com.bignerdranch.android.draganddraw;

// Chapter 30: Property Animation

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DragAndDrawActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		return DragAndDrawFragment.newInstance();
	}
}
