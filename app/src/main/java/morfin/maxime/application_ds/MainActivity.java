package morfin.maxime.application_ds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("coucou");


        Button myButton6 = (Button) findViewById(R.id.button6);
        Button myButton20 = (Button) findViewById(R.id.button20);

        myButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentBtn6 = new Intent(MainActivity.this, Dice.class);
                myIntentBtn6.putExtra("max", 6);
                startActivity(myIntentBtn6);
            }
        });
        myButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentBtn20 = new Intent(MainActivity.this, Dice.class);
                myIntentBtn20.putExtra("max", 20);
                startActivity(myIntentBtn20);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_edit:
                return true;
            case R.id.action_add:
                return true;
            case R.id.action_delete:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


