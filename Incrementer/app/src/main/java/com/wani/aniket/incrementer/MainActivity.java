package com.wani.aniket.incrementer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button OurButton,Reset;
    private TextView OurMessage;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OurButton = (Button) findViewById(R.id.button);
        Reset = (Button) findViewById(R.id.button2);
        OurMessage = (TextView) findViewById(R.id.textView);

        View.OnClickListener OnClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count == 1){
                    OurMessage.setText("Count =  "+count);
                }else{
                    OurMessage.setText("Count =  "+count);
                }

            }
        };
        OurButton.setOnClickListener(OnClick);
        View.OnClickListener Onclick2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                OurMessage.setText("Count = " +count);
            }
        };
        Reset.setOnClickListener(Onclick2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
