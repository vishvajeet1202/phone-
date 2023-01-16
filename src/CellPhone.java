public class CellPhone implements Phone{
    private String myPhone;
    private boolean isRinging;
    private boolean isPowerOn;



    public CellPhone(String myPhone) {
        this.myPhone = myPhone;
        isRinging = false;
        isPowerOn = false;
    }

    public String getMyPhone() {
        return myPhone;
    }

    public boolean getisRinging() {

        return isRinging;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setMyPhone(String myPhone) {
        this.myPhone = myPhone;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn=true;
        return;
    }

    @Override
    public void callNumber(String phoneNo) {
            if(myPhone.equals(phoneNo)){
           System.out.println("calling the number"+ phoneNo);
           isRinging=true;
            }
            else isRinging=false;
    }

    @Override
    public void isRinginging(String phoneNo) {
       if(myPhone.equals(phoneNo)){
           System.out.println("phone is ringing");
           isRinging=true;
       }
       else isRinging=false;
    }

    @Override
    public void recieveCall(String answer) {
        if(answer.equals("yes") && isRinging){
            System.out.println("recieved the call");
        } else if (isRinging && answer.equals("no")) {
            System.out.println("I'm busy");
        }
        isRinging=false;

    }

    @Override
    public boolean answerCall(String answer) {
        if(answer.equals("yes")) return true;
        else return false;

    }
}
