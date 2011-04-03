package browsemode;
import java.util.ArrayList;

import com.example.helloandroid.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class AntonymTab extends Activity {

	 /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browsemode);
        Bundle b = getIntent().getExtras();
        ArrayList<String> ant = b.getStringArrayList("antonym");
        setContentView(R.layout.antonym_tab);
        TextView tv = (TextView)findViewById(R.id.text5);
        tv.append("\n");
        for(String s : ant){
        	tv.append(s);tv.append("\n");
        }
    }
	
}