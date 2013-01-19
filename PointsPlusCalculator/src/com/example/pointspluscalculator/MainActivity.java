package com.example.pointspluscalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
//defining widgets per O'Reilly documentation found here http://androidcookbook.com/Recipe.seam?recipeId=2106&title=Program:%20Tipster,%20%20a%20tip%20calculator%20for%20the%20Android%20OS
	private EditText fat;
	private EditText carbs;
	private EditText protein;
	private EditText fiber;
	private Button calcpointsplus;
	private TextView pointsplusvalue;
	
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //define fat, fat gets cursor initially
        fat = (EditText) findViewById(R.id.fat);
        fat.requestFocus();
        
        carbs = (EditText) findViewById(R.id.carbs);
        protein = (EditText) findViewById(R.id.protein);
        fiber = (EditText) findViewById(R.id.fiber);
        calcpointsplus = (Button) findViewById(R.id.calcpointsplus);
        	//calc button disabled at launch - not sure if I really care.  Would need to set logic to turn this back on.
        	//calcpointsplus.setEnabled(false);
        pointsplusvalue = (TextView) findViewById(R.id.pointsplusvalue);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }

//On button push, call calculate

//    public void calcpointsplus(View view) {
//    	EditText editText = (EditText) findViewById(R.id.pointsplusvalue);
//    	String message = editText.getText().toString();
    	
    	
//    }
    
    
    public void calculate(View view) {
    	Double fatnum = Double.parseDouble(
    	        fat.getText().toString());
    	Double carbsnum = Double.parseDouble(
    	        carbs.getText().toString());
    	Double proteinnum = Double.parseDouble(
    	        protein.getText().toString());
    	Double fibernum = Double.parseDouble(
    	        fiber.getText().toString());

    	Double pointsvalue = ((fatnum * 0.25714)+(carbsnum * 0.108571)+(proteinnum * 0.091428)-(fibernum * 0.08));
    	pointsplusvalue.setText(pointsvalue.toString());
    }
}