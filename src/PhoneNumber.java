import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    String areaCode;

    public PhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("\\((.*)\\).*");
//        Pattern pattern = Pattern.compile("(.*)");
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean b = matcher.matches();
        this.areaCode = matcher.matches() ? matcher.group(1) : null;
    }

    public String getAreaCode() {
        return areaCode;
    }
}
