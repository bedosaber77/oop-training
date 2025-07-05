public class PhoneFactory {
    public static Phone createPhone(Processor processor) {
        return new Phone(processor);
    }
    public static void changePhoneProcessor(Phone phone,Processor processor) {
        phone.swapProcessor(processor);
    }
}
