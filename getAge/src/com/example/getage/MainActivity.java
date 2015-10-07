package com.example.getage;

import java.util.Calendar;
import java.util.GregorianCalendar;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	TextView txtV;
	Context cntx;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtV = (TextView)findViewById(R.id.age);
        cntx = this;
        StringBuilder strBuild = new StringBuilder();
 
        // enter your date of birth
        Calendar dateOfYourBirth = new GregorianCalendar(1998, Calendar.SEPTEMBER, 17);
        Calendar today = Calendar.getInstance();
        int yourAge = today.get(Calendar.YEAR) - dateOfYourBirth.get(Calendar.YEAR);
        dateOfYourBirth.add(Calendar.YEAR, yourAge);
        if (today.before(dateOfYourBirth)) {
            yourAge--;
        }  
        strBuild.append("You are " + yourAge + " old!");
         txtV.setText(strBuild);
    }
}    