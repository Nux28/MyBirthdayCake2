package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

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
    }


    public void goodbye(View button) {
        Log.i("button","Goodbye");
    }

}
