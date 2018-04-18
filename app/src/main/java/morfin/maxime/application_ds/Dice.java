package morfin.maxime.application_ds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

public class Dice extends AppCompatActivity {
    private int max;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        

        max = getIntent().getIntExtra("max", 0);

        TextView textTitle = (TextView) findViewById(R.id.textTitle);
        textTitle.setText(max + " side dice");

        final TextView textResult = (TextView) findViewById(R.id.textResult);
        textResult.setText("");

        Button buttonRoll = (Button) findViewById(R.id.buttonRoll);
        buttonRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecureRandom random = new SecureRandom();
                int result = random.nextInt(max) + 1;
                textResult.setText(String.valueOf(result));
            }
        });
    }
}
