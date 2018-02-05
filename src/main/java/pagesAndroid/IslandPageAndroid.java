package pagesAndroid;

import framework.BasePageAndroid;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class IslandPageAndroid extends BasePageAndroid {

    @AndroidFindBy(xpath="//android.view.ViewGroup/android.widget.TextView[1]")
    public MobileElement topText;
    @AndroidFindBy(xpath="//android.widget.LinearLayout/android.widget.ImageView[1]")
    public List<MobileElement> islandIcon;
    @AndroidFindBy(xpath="//android.support.v7.widget.RecyclerView//android.widget.TextView")
    public List<MobileElement> island;
    @AndroidFindBy(xpath="//android.widget.LinearLayout/android.widget.ImageView[2]")
    public List<MobileElement> selectedMark;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/next")
    public MobileElement nextButton;

}
