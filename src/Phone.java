public interface Phone {

    void powerOn();
    void callNumber(String phoneNo);
    void isRinginging(String phoneNo);
    void recieveCall(String answer);

    boolean answerCall(String answer);
}
