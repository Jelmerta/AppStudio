package com.example.jelmer.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public enum Hands {
        ROCK, PAPER, SCISSORS
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button firstButton = (Button) findViewById(R.id.firstButton);
        final Button secondButton = (Button) findViewById(R.id.firstButton);
        final Button thirdButton = (Button) findViewById(R.id.firstButton);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomGenerator = new Random();
                int randomInt = randomGenerator.nextInt(3);
                String outcome;
                switch(randomInt) {
                    case 0:
                        outcome = "You lose!";
                        break;
                    case 1:
                        outcome = "You win!";
                        break;
                    case 2:
                        outcome = "It's a tie!";
                        break;
                    default:
                        outcome = "wowa a bug!";
                }
                final TextView outcomeText = (TextView) findViewById(R.id.outcome);
                outcomeText.setText(outcome);
            }
        };

        firstButton.setOnClickListener(onClickListener);
        secondButton.setOnClickListener(onClickListener);
        thirdButton.setOnClickListener(onClickListener);
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