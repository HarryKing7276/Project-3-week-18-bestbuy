package crudtest;

import com.bestbuy.bestbuyinfo.StoreSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import testbase.StoreTestBase;


//@RunWith(SerenityRunner.class)
public class StoreCRUDTest extends StoreTestBase {

    @Steps
    StoreSteps storeSteps;
    @Title("This will create new store")

    @Test
    public void test01(){

        storeSteps = storeSteps;
        String name = "Prime";
        String type = "BigBox";
        String address = "13513 Ridgedale Dr";
        String address2 = "High Street";
        String city = "Hopkins";
        String state = "MN";
        String zip = "55305";
        int lat = 44;
        int lng = 93;
        String hours = "Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8\"";


        //storeSteps.createStore(name, type, address, address2, city, state, zip, lat, lng, hours).statusCode(201);
    }

}
