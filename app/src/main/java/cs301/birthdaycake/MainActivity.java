package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    private CakeView xmlCakeView; //is this local variable in the right place???

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        //find cakeview created in gui using its id and store it
        xmlCakeView = findViewById(R.id.cakeview);

        //make new cakecontroller object and pass in cakeview we just found
        CakeController myCakeController = new CakeController(xmlCakeView);

        //click listener thing
        Button blowOut = findViewById(R.id.blowoutbutton);
        blowOut.setOnClickListener(myCakeController);

        //link up the switch listener
        Switch hasCandles = findViewById(R.id.candleswitch);
        hasCandles.setOnCheckedChangeListener(myCakeController);

    }


    public void goodbye(View button) {
        Log.i("button","Goodbye");
    }

}
