package pl.Tank;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class tank extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        View start = findViewById(R.id.start);
     //   Button start_Button = (Button) findViewById(R.id.start);
        start.setOnClickListener(this);
        View credits = findViewById(R.id.credits);
        credits.setOnClickListener(this);
    }

	public void onClick(View v) {
		switch(v.getId()){
		case R.id.start:
			Intent game = new Intent(this, game.class);
			startActivity(game);
			break;
		case R.id.credits:
			Intent credits = new Intent(this, credits.class);
			startActivity(credits);
			break;
		}
	}
    
}