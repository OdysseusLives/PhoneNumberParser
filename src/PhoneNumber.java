import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    Integer areaCode;
    Integer extension;

    public PhoneNumber(String phoneNumber) {
        this.areaCode = findAreaCode(phoneNumber);
        this.extension = findExtension(phoneNumber);
    }

    public PhoneNumber(Integer areaCode, Integer firstBit, Integer secondBit) {
        this.areaCode = areaCode;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public int getExtension() {
        return extension;
    }

    protected int findExtension(String phoneNumber){
        Pattern pattern = Pattern.compile(".*x(.*)");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches() ? Integer.parseInt(matcher.group(1)) : 0;
    }

    protected int findAreaCode(String phoneNumber){
        Pattern pattern = Pattern.compile("\\((.*)\\).*");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches() ? Integer.parseInt(matcher.group(1)) : 0;
    }

}
