public class Mobile implements MobileObserver{

    private String deviceName;

    //basically this function is used when we sent the notification to the mobile
    //devices and using this function we got to know in which mobile we sent the
    //notification
    public String getDeviceName() {
        return deviceName;
    }

    //sets the device information
    public Mobile(String deviceName) {
        this.deviceName = deviceName;
    }

    //this is the function from which Mobile.class means observer party will get notified
    @Override
    public void getNotified(String msg) {
        System.out.println("notifying the " + deviceName +"\n");
        System.out.println("message is : " + msg);

    }
}
