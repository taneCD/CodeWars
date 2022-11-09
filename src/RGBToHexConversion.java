public class RGBToHexConversion {
    //RGB To Hex Conversion
    //https://www.codewars.com/kata/513e08acc600c94f01000001/train/java
    public static String rgb(int r, int g, int b) {
        String str1 = "";
        String str2 = "";
        String str3 = "";

        if (r >= 255) {
            str1 = "FF";
        } else if (r < 255 && r > 0) {
            str1 = Integer.toHexString(r);
        } else if (r <= 0) {
            str1 = "00";
        }

        if (g >= 255) {
            str2 = "FF";
        } else if (g < 255 && g > 0) {
            str2 = Integer.toHexString(g);
        } else if (g <= 0) {
            str2 = "00";
        }

        if (b >= 255) {
            str3 = "FF";
        } else if (b < 255 && b > 0) {
            str3 = Integer.toHexString(b);
        } else if (b <= 0) {
            str3 = "00";
        }

        if (str1.length() < 2) {
            str1 = "0" + str1;
        }
        if (str2.length() < 2) {
            str2 = "0" + str2;
        }
        if (str3.length() < 2) {
            str3 = "0" + str3;
        }
        return str1.toUpperCase() + str2.toUpperCase() + str3.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(rgb(255,32,100));
    }
}