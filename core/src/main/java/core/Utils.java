package core;

import utils.StringUtils;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str){
        StringUtils stringUtils = new StringUtils();
        boolean isAllPositiveNumbers = true;
        for(String number : str){
            if(!stringUtils.isPositiveNumber(number)){
                isAllPositiveNumbers = false;
                break;
            }
        }
        return isAllPositiveNumbers;
    }
}
