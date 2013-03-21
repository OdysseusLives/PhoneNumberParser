public class Main {

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber("(111)222-3333");
        System.out.println("Area code is: " + phoneNumber.getAreaCode());

        PhoneNumber phoneNumberWithDifferentConstructor = new PhoneNumber(123, 222, 3333);
        System.out.println("Area code is: " + phoneNumberWithDifferentConstructor.getAreaCode());

        PhoneNumber phoneNumberWithExtension = new PhoneNumber("(122)344-5667 x8888");
        System.out.println("Extension is: " + phoneNumberWithExtension.getExtension());
    }
}
