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
        
        View button = findViewById(R.id.start_button);
        button.setOnClickListener(this);
        
        
    }

	public void onClick(View v) {
		switch(v.getId()){
		case R.id.start_button:
			Intent i = new Intent(this, game.class);
			startActivity(i);
			break;
		
		}
		
	}
    
}