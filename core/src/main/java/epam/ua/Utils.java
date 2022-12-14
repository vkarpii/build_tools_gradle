package epam.ua;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str){
        for (String line:str){
            if (!StringUtils.isPositiveNumber(line)){
                return false;
            }
        }
        return true;
    }
}
