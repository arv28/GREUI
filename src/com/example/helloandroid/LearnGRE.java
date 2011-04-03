package com.example.helloandroid;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.HashMap;


import testmode.Testmode;
import android.widget.TextView;
import android.widget.Button;
import browsemode.Browsemode;



public class LearnGRE extends Activity {
    /** Called when the activity is first created. */
	private Button learn,test;
	public static int card = 1;
	public static int len;
	//public static HashMap<String,Vocab> hmap;
	public static HashMap<Integer,Vocab> smap;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        createWords();
        this.learn = (Button)findViewById(R.id.Button01);
        this.test = (Button)findViewById(R.id.Button02);
        learn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(v.getContext(), Browsemode.class);
				//System.out.println("Starting activity");
				startActivityForResult(intent, 0);
				intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
				
			}
		});
        
        test.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(v.getContext(), Testmode.class);
				startActivityForResult(intent, 0);
				intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
				
			}
		});
    }
    
    public void createWords(){
    	
    	//hmap = new HashMap<String, Vocab>();
    	smap = new HashMap<Integer, Vocab>();
                
    	String word1 = "Alleviate";
    	ArrayList<String> def1 = new ArrayList<String>();
    	def1.add("relieve");def1.add("lessen");
    	ArrayList<String> syn1 = new ArrayList<String>();
    	syn1.add("ally");syn1.add("assuage");syn1.add("ease");
    	ArrayList<String> ant1 = new ArrayList<String>();
    	ant1.add("aggravate");ant1.add("increase");ant1.add("intensify");
    	String usage1 = "Express train services from these stations would help to alleviate congestion in the capital";
    	Vocab w1 = new Vocab(word1,def1,usage1,syn1,ant1);
    	
    	String word2 = "Differentiate";
    	ArrayList<String> def2 = new ArrayList<String>();
    	def2.add("make a distinction");def2.add("distinguish");
    	ArrayList<String> syn2 = new ArrayList<String>();
    	syn2.add("antithesize");syn2.add("characterize");syn2.add("discern");
    	ArrayList<String> ant2 = new ArrayList<String>();
    	ant2.add("associate");ant2.add("confuse");ant2.add("mix up");
    	String usage2 = "Stem cells have the capacity to differentiate into specialized cells such as muscle cells, nerve cells or blood cells";
    	Vocab w2 = new Vocab(word2, def2, usage2, syn2, ant2);
    	
    	String word3 = "Dearth";
    	ArrayList<String> def3 = new ArrayList<String>();
    	def3.add("Insufficient");def3.add("Scarcity");def3.add("state of lacking something needed or usual");
    	ArrayList<String> syn3 = new ArrayList<String>();
    	syn3.add("Deficiency");syn3.add("Default");syn3.add("Defect");
    	ArrayList<String> ant3 = new ArrayList<String>();
    	ant3.add("Abundance");ant3.add("Excess");ant3.add("Plenty");
    	String usage3 = "It seems very likely that the relative dearth of Political Science studies is coming to an end";
    	Vocab w3 = new Vocab(word3, def3, usage3, syn3, ant3);
    	
    	String word4 = "Ebullient";
    	ArrayList<String> def4 = new ArrayList<String>();
    	def4.add("Enthusiastic");def4.add("Lively");
    	ArrayList<String> syn4 = new ArrayList<String>();
    	syn4.add("Agitated");syn4.add("Brash");syn4.add("Bouncy");
    	ArrayList<String> ant4 = new ArrayList<String>();
    	ant4.add("Apathetic");ant4.add("Disinterested");ant4.add("Unenthusiastic");
    	String usage4 = "ebullient personality, courage and vivaciousness made him very popular with all ranks within the Regimen";
    	Vocab w4 = new Vocab(word4, def4, usage4, syn4, ant4);
    	
    	String word5 = "Galvanize";
    	ArrayList<String> def5 = new ArrayList<String>();
    	def5.add("Inspire");def5.add("Stimulate");
    	ArrayList<String> syn5 = new ArrayList<String>();
    	syn5.add("Animate");syn5.add("Arouse");syn5.add("Astonish");
    	ArrayList<String> ant5 = new ArrayList<String>();
    	ant5.add("Depress");ant5.add("Deter");ant5.add("Discourage");
    	String usage5 = "galvanize steel, have more than doubled in the past year";
    	Vocab w5 = new Vocab(word5, def5, usage5, syn5, ant5);
    	
    	
    	//hmap.put("1", w1);
    	smap.put(new Integer(1),w1);
    	smap.put(new Integer(2),w2);
    	smap.put(new Integer(3),w3);
    	smap.put(new Integer(4),w4);
    	smap.put(new Integer(5),w5);
    	len = smap.size();
    	
    	
    }
   
    
  
   
    
    
}