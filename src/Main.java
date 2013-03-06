import javax.swing.*;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber("(111)222-3333");
        System.out.println("Area code is: " + phoneNumber.getAreaCode());

        PhoneNumber phoneNumberWithDifferentConstructor = new PhoneNumber(123, 222, 3333);
        System.out.println("Area code is: " + phoneNumberWithDifferentConstructor.getAreaCode());
    }
}
