package com.example.helloandroid;

import java.util.ArrayList;


public class Vocab {
	
	private String word;
	private ArrayList synonym;
	private ArrayList antonym;
	private ArrayList definition;
	private String usage;
	
	
	public Vocab(String word, ArrayList<String> def, String usage, ArrayList<String> meanings, ArrayList<String> opposites){
      this.word = word;
      this.usage = usage;
      definition = new ArrayList<String>();
      for(String s: def)
    	  this.definition.add(s);
      synonym = new ArrayList<String>();
      for(String s: meanings)
    	  this.synonym.add(s);
      antonym = new ArrayList<String>();
      for(String s: opposites)
    	  this.antonym.add(s);	
	}
	
	public String getWord(){ return this.word; }
	
	public ArrayList<String> getDef(){ return this.definition; }
	
	public ArrayList getSynonyms(){ return this.synonym; }
	
	public ArrayList getAntonyms(){ return this.antonym; }
	
	public String getUsage(){ return this.usage; }
	
	
}



