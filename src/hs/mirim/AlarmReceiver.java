package hs.mirim;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.e("alarm", "alarm!!!!!!!!!!!!!!!!!");
		Intent Intent = new Intent(context, AlarmAppActivity.class);
	}

}
