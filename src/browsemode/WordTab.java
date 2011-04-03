package browsemode;

import java.util.ArrayList;

import com.example.helloandroid.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;
import com.example.helloandroid.LearnGRE;
import android.view.Gravity;
import android.view.ViewGroup;
import android.graphics.Typeface;

public class WordTab extends Activity {

	
	 /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browsemode);
        Bundle b = getIntent().getExtras();
        String word = b.getString("word");
        ArrayList<String> defs = b.getStringArrayList("Def");
        String usage = b.getString("usage");
        
       setContentView(R.layout.wordtab);
       TextView tv1 = (TextView)findViewById(R.id.text1);
       tv1.setGravity(Gravity.CENTER);
       tv1.append(word);
       tv1.append("\n");
       
       TextView tv2 = (TextView)findViewById(R.id.text2);
       tv2.append("Definition: ");
       for(String s : defs){
       	tv2.append(s);tv2.append(",");
       }
       tv2.append("\n");
       
       TextView tv3 = (TextView)findViewById(R.id.text3);
       tv3.append("Usage: ");
       tv3.append(usage);
       RelativeLayout rl = (RelativeLayout)findViewById(R.id.rlayout);
       
       /* Below should be based on a condition */
    /*   if(LearnGRE.card == LearnGRE.len || LearnGRE.card > 1){
	       
	       ImageButton bt1 = new ImageButton(this);
	       bt1.setId(Browsemode.P);
	       bt1.setBackgroundResource(R.drawable.button_previous_icon);
	       RelativeLayout.LayoutParams param = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,  
	               LayoutParams.WRAP_CONTENT);
	       param.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
	       bt1.setLayoutParams(param);
	       rl.addView(bt1);
       }
       
       if(LearnGRE.card == 1 || (LearnGRE.card <  LearnGRE.len)){
	       ImageButton bt2 = new ImageButton(this);
	       bt2.setId(Browsemode.N);
	       bt2.setBackgroundResource(R.drawable.button_next_icon);
	       RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,  
	               LayoutParams.WRAP_CONTENT);
	       params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
	       params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
	       bt2.setLayoutParams(params);
	       rl.addView(bt2);
       } */
        
       
       
       
       
        
    }
	
}