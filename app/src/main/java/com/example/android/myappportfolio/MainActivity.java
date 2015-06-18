package com.example.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements OnClickListener {

    Button b[] = new Button[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] buttonResources = {R.id.spotify, R.id.scores, R.id.library, R.id.build_it_bigger, R.id.xyz_reader, R.id.capstone};


        for (int i = 0; i < buttonResources.length; i++)
        {

            b[i] = (Button)findViewById(buttonResources[i]);
            b[i].setOnClickListener(this);

        }
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

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Toast toast;
        switch(id)
        {
            case R.id.spotify:
                toast = Toast.makeText(this, "This is the Spotify Streamer", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.scores:
                toast = Toast.makeText(this, "This is the High Scores App", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.library:
                toast = Toast.makeText(this, "This is the Library App", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.build_it_bigger:
                toast = Toast.makeText(this, "This is the Built It Bigger App", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.xyz_reader:
                toast = Toast.makeText(this, "This is the XYZ Reader App", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.capstone:
                toast = Toast.makeText(this, "This is the Capstone App", Toast.LENGTH_SHORT);
                toast.show();
                break;
            default:
                toast = Toast.makeText(this, "This is Unlabeled", Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
    }
}
