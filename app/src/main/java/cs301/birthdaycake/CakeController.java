package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private CakeView myCakeView;
    private CakeModel myCakeModel;

    /**
     * constructor
     */
    public CakeController (CakeView inputCakeView) {
        myCakeView = inputCakeView;
        myCakeModel = myCakeView.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.i("cake","click!");
        //blow out candles
        myCakeModel.litCandles = false;
        //tell cakeview to redraw itself
        myCakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        //this is if the "candles" switch is changed
        Log.i("cake","switch!");
        if(!b) {myCakeModel.candles = false;}
        if(b) {myCakeModel.candles = true;}
        myCakeView.invalidate();
    }
}