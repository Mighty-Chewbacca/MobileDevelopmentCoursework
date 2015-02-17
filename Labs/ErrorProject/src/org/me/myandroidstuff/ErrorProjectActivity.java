package org.me.myandroidstuff;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ErrorProjectActivity extends Activity implements OnClickListener
{
	private Button getSaying;
	private Button countDisplay;
	private View topView;
	private TextView aView;
	private String[] saying;
	private int count;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    	Log.e("tracingerror", "started oncreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        count = 0;
        saying = new String[] {"Step by step walk the thousand mile road",
        		                    "Live today, forget the past",
        		                    "Gratitude is the heart's memory",
        		                    "Before you can score you must first have a goal",
        		                    "Every cloud has a silver lining",
        		                    "Better reap 2 days too soon than 1 day too late",
        		                    "Great talkers are little doers",
        		                    "In prosperity, caution; in adversity, patience",
        		                    "It is not the knowing that is difficult, but the doing"};
        
        aView = (TextView)findViewById(R.id.salutationDisplay);  
        Log.e("tracingerror", "finding the textview");
        countDisplay = (Button)findViewById(R.id.countDisplay); 
        Log.e("tracingerror", "finding the button");
        getSaying = (Button)findViewById(R.id.getSaying);
        Log.e("tracingerror", "finding the getsaying button - error 1 the find call was missing so couldnt add an on click listener");
        getSaying.setOnClickListener(this);        
        Log.e("tracingerror", "finished oncreate");
    }

	@Override
	public void onClick(View arg0) 
	{
		// TODO Auto-generated method stub
		if (arg0 == getSaying)
		{
			//Get value from edit box and 
			//check that it is an Integer
			try
			{
				Log.e("tracingerror", "entered try method");
				// Generate Random number in the range 1 to 10
				// Generate saying
				double number = Math.random()*10;
				int index = (int)Math.floor(number);
				count++;
				countDisplay.setText("Count of Proverbs is " + count);
				showtbDialog(index);
			}
			catch(Exception ae)
			{
				// Error with number generated
			}
		}
		Log.e("MyTag", "Ah help me my program is not working");
		
	}
	
	private void showtbDialog(int index)
	{
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage(saying[index]);
		builder.setCancelable(false);
		builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) 
		           {
		        	   //Toast.makeText(getApplicationContext(), " You Pressed Yes", Toast.LENGTH_SHORT).show();
		               dialog.cancel();
		           }
		       });
		
		AlertDialog alert = builder.create();	
		alert.show();
	}
	
} // End of Activity