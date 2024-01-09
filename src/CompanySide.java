import java.util.ArrayList;
import java.util.List;

public class CompanySide implements Subject{

    List<Mobile> deviceListSentNotification = new ArrayList<>();
    @Override
    public void addMobile(Mobile mobile) {
        deviceListSentNotification.add(mobile);
        System.out.println("added this " + mobile.getDeviceName() + " to sent notification");
    }

    @Override
    public void removeMobile(Mobile mobile) {
        deviceListSentNotification.remove(mobile);
        System.out.println("remove this " + mobile.getDeviceName() + " not to sent notification");
    }

    //using this functions we sent the notification to registered
    //mobiles devices 
    @Override
    public void notifyMobiles(String msg) {
        for(Mobile mobile : deviceListSentNotification){
            mobile.getNotified(msg);
        }
    }
}
