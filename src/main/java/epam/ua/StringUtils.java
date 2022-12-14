package epam.ua;
import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str){
        int number = NumberUtils.createInteger(str);
        return number > 0;//=>
    }

}
