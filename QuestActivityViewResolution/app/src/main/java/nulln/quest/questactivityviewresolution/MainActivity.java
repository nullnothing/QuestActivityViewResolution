package nulln.quest.questactivityviewresolution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private void getRes() {
        TextView text = findViewById(R.id.text);
        text.setText("Activity View Resolution: " + Integer.toString(this.getWindow().getDecorView().getWidth()) + "x" + Integer.toString(this.getWindow().getDecorView().getHeight()));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getRes();
            }
        }, 1000);
    }
}