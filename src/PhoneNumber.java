import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    Integer areaCode;

    public PhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("\\((.*)\\).*");
//        Pattern pattern = Pattern.compile("(.*)");
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean b = matcher.matches();
        this.areaCode = matcher.matches() ? Integer.parseInt(matcher.group(1)) : null;
    }

    public PhoneNumber(Integer areaCode, Integer firstBit, Integer secondBit) {
        this.areaCode = areaCode;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public int getExtension() {
        return 0;
    }
}
