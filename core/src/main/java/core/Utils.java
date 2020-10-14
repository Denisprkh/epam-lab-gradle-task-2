package core;

import com.epam.utils.StringUtils;

import java.util.Arrays;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str){
        boolean isAllPositiveNumbers = !Arrays.stream(str).anyMatch(o -> !StringUtils.isPositiveNumber(o));
        return isAllPositiveNumbers;
    }
}
