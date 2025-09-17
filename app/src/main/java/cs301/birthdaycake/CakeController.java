package cs301.birthdaycake;

public class CakeController {
    private CakeView myCakeView;
    private CakeModel myCakeModel;

    /**
     * constructor
     */
    public CakeController(CakeView inputCakeView) {
        myCakeView = inputCakeView;
        myCakeModel = myCakeView.getCakeModel();
    }
}