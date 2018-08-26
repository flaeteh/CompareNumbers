package ph.edu.ust.comparenumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enter = findViewById(R.id.submitButton);

        enter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.editNum1);
                EditText num2 = findViewById(R.id.editNum2);
                TextView result = findViewById(R.id.resultView);

                int num11 = Integer.parseInt(num1.getText().toString());
                int num22 = Integer.parseInt(num2.getText().toString());

                if (num11 > num22) {
                    result.setText(Integer.toString(num11));
                }
                else {
                    result.setText(Integer.toString(num22));
                }


            }

        });
    }
}
