package hs.mirim;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class AlarmAppActivity extends Activity {
   
    private AlarmManager am;
    private PendingIntent pIntent;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        am = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, AlarmReceiver.class);
        pIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
        
        findViewById(R.id.btnSetAlarm).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				am.setRepeating(AlarmManager.RTC, System.currentTimeMillis() + 5000, 5000, pIntent);
			}
		});
        
        findViewById(R.id.btnResetAlarm).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				am.cancel(pIntent);
			}
		});
    }
}