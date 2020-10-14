package core;

import com.epam.utils.StringUtils;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str){
        boolean isAllPositiveNumbers = true;
        for(String number : str){
            if(!StringUtils.isPositiveNumber(number)){
                isAllPositiveNumbers = false;
                break;
            }
        }
        return isAllPositiveNumbers;
    }
}
