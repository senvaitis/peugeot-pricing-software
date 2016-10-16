package utilities;

/**
 * Created by kazim on 2016-10-16.
 */
public class LinePriceUtil {


    public static int getLinePrice(int basePrice, String line) {
        switch (line) {
            case "Baseline":
                return 0;
            case "Sportline":
                return basePrice / 4;
            case "Racingline":
                return basePrice / 2;
            default:
                return 9999;
        }
    }
}
