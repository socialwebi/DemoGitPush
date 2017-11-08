package edbrix.demogitpush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView(); 
    }

    public void initView(){

        Toast.makeText(MainActivity.this, " Success: ", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, " Edit same line of code ", Toast.LENGTH_SHORT).show();
    }
}
