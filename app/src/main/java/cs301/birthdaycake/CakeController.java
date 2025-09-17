package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {
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
}