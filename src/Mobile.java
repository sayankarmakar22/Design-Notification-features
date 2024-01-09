public class Mobile implements MobileObserver{

    private String deviceName;

    public String getDeviceName() {
        return deviceName;
    }

    public Mobile(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void getNotified(String msg) {
        System.out.println("notifying the " + deviceName +"\n");
        System.out.println("message is : " + msg);

    }
}
