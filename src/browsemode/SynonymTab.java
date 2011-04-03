package browsemode;

import java.util.ArrayList;

import com.example.helloandroid.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class SynonymTab extends Activity {

	 /** Called when the activity is first created. */
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browsemode);
        Bundle b = getIntent().getExtras();
        ArrayList<String> syn = b.getStringArrayList("synonym");
        setContentView(R.layout.synonym_tab);
        TextView tv = (TextView)findViewById(R.id.text4);
        tv.append("\n");
        for(String s : syn){
        	tv.append(s);tv.append("\n");
        }
        
    }
	
}
