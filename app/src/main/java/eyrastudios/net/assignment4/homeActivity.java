package eyrastudios.net.assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class homeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button enter;
    private EditText fnum;
    private EditText Snum;

    private int addition;
    Spinner sp;
    ArrayAdapter<String> adapter;

    String[] operator = {"Plus +","Minus -", "Multiply *"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fnum = findViewById(R.id.num1);
        Snum = findViewById(R.id.num2);




        sp = findViewById(R.id.spinID);
        adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,operator);
        sp.setAdapter(adapter);






    }
}
