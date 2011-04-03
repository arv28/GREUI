package browsemode;

import com.example.helloandroid.R;
import com.example.helloandroid.Vocab;
import com.example.helloandroid.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.FrameLayout.LayoutParams;
import android.app.TabActivity;
import com.example.helloandroid.LearnGRE;

public class Browsemode extends TabActivity {

	TabHost.TabSpec spec;
    Intent intent;
    Resources res;
    TabHost tabhost;
    Vocab v;
    RelativeLayout rl;
    int P = 1;
    int N = 2;
    int H = 3;
    public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		v = LearnGRE.smap.get(Integer.valueOf(LearnGRE.card));
		setContentView(R.layout.browsemode);
		rl = (RelativeLayout)findViewById(R.id.RelativeLayout01);
		if(LearnGRE.card == LearnGRE.len || LearnGRE.card > 1)
			prevImageButton();
		if(LearnGRE.card == 1 || (LearnGRE.card <  LearnGRE.len))
			nextImageButton();
		if(LearnGRE.card == LearnGRE.len)
			backTohome();
		res = getResources();
		tabhost = getTabHost();
		createTab("WORD",WordTab.class);
		createTab("SYNONYM",SynonymTab.class);
		createTab("ANTONYM",AntonymTab.class);
		tabhost.setCurrentTab(0);
		
	}
	
	public void createTab(String tabname, Class tabclass){
		
		intent = new Intent();
	    intent.setClass(this, tabclass); 
	    Bundle bundle = new Bundle();
	    if(tabname.equalsIgnoreCase("WORD")){
	    	bundle.putString("word", v.getWord());
	    	bundle.putStringArrayList("Def", v.getDef());
	    	bundle.putString("usage", v.getUsage());
	    }
	    else if(tabname.equalsIgnoreCase("SYNONYM")){
	    	bundle.putStringArrayList("synonym", v.getSynonyms());
	    }
	    else if(tabname.equalsIgnoreCase("ANTONYM")){
	    	bundle.putStringArrayList("antonym", v.getAntonyms());
	    }
	    intent.putExtras(bundle);
	    spec = tabhost.newTabSpec(tabname).setIndicator(tabname, res.getDrawable(R.drawable.tabs)).setContent(intent);
	    tabhost.addTab(spec);
		
	}
	
	
	public void prevImageButton(){
		
		
		
		Button bt1 = new Button(this);
		bt1.setHeight(10);
		bt1.setWidth(10);
		bt1.setId(P);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				(LearnGRE.card)--;
				Intent intent = new Intent();
				intent.setClass(v.getContext(), Browsemode.class);
				startActivityForResult(intent, 0);
				intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
				
			}
		});
		bt1.setBackgroundResource(R.drawable.button_previous_icon);
		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
		lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		bt1.setLayoutParams(lp);
		rl.addView(bt1);
		
		
		
	}
	
public void nextImageButton(){
		

//		System.out.println(fl);
		Button bt1 = new Button(this);
		bt1.setHeight(10);
		bt1.setWidth(10);
		bt1.setId(N);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				(LearnGRE.card)++;
				Intent intent = new Intent();
				intent.setClass(v.getContext(), Browsemode.class);
				startActivityForResult(intent, 0);
				intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
				
			}
		});
		bt1.setBackgroundResource(R.drawable.button_next_icon);
		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
		lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		bt1.setLayoutParams(lp);
		rl.addView(bt1);
		
		
	}

public void backTohome(){
	
	Button bt1 = new Button(this);
	bt1.setHeight(10);
	bt1.setWidth(10);
	bt1.setId(H);
	bt1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			LearnGRE.card = 1;
			Intent intent = new Intent();
			intent.setClass(v.getContext(), LearnGRE.class);
			startActivityForResult(intent, 0);
			intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
			
		}
	});
	bt1.setBackgroundResource(R.drawable.home);
	RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
	lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
	lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
	bt1.setLayoutParams(lp);
	rl.addView(bt1);
	
}
	
	

	
	
	
}
