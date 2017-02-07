package com.bignerdranch.android.draganddraw;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class BoxDrawingView extends View {

	private static final String TAG ="BoxDrawingView";

	public BoxDrawingView(Context context) {
		this(context, null);
	}

	public BoxDrawingView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		PointF current = new PointF(event.getX(), event.getY());
		String action = "";
		switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				action = "ACTION_DOWN";
				break;
			case MotionEvent.ACTION_MOVE:
				action = "ACTION_MOVE";
				break;
			case MotionEvent.ACTION_UP:
				action = "ACTION_UP";
				break;
			case MotionEvent.ACTION_CANCEL:
				action = "ACTION_CANCEL";
				break;
		}
		String log = action + " at x= " + current.x + ", y=" + current.y;
		Toast.makeText(getContext(), log, Toast.LENGTH_SHORT).show();
		Log.i(TAG, log);
		return true;
	}
}
