/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Random;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import us.codecraft.xsoup.Xsoup;


/**
 *
 * @author Lorena
 */
public class Alati {
    
    private static final int IBAN_LENGTH = 21;
    private static final String COUNTRY_CODE = "HR";
    private static final String ACCOUNT_NUMBER_PATTERN = "%019d";
    
     public static String dovuciOib() {

        try {
            URL url = new URL("http://oib.itcentrala.com/oib-generator/");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            url.openStream()));
            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            in.close();
            Document d = Jsoup.parse(sb.toString());
            return Xsoup.compile("/html/body/div[1]/div[1]/text()").evaluate(d).get();
        } catch (Exception e) {
        }

        return "";
    }

    public static boolean kontrolaOIB(String oib) {
        if (oib==null || oib.length() != 11) {
            return false;
        }

        char[] chars = oib.toCharArray();

        int a = 10;
        for (int i = 0; i < 10; i++) {
            char c = chars[i];
            if (c < '0' || c > '9') {
                return false;
            }
            a = a + (c - '0');
            a = a % 10;
            if (a == 0) {
                a = 10;
            }
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        kontrolni = kontrolni % 10;

        if (kontrolni != (chars[10] - '0')) {
            return false;
        }
        return true;
    }
    
    public static String generirajIBAN() {
        
        // Generate a random account number with 19 digits
        Random random = new Random();
        long accountNumber = random.nextLong() % 1_000_000_000_000_000_000L;

        // Format the account number with leading zeros
        String formattedAccountNumber = String.format(ACCOUNT_NUMBER_PATTERN, Math.abs(accountNumber));

        // Concatenate the country code and the formatted account number
        String iban = COUNTRY_CODE + formattedAccountNumber;

        return iban;
        
    }
    
//    private static int mod97(String value) {
//        // Implement the mod-97 algorithm for calculating the check digits
//        int checksum = 0;
//        for (int i = 0; i < value.length(); i++) {
//            int digit = Character.getNumericValue(value.charAt(i));
//            checksum = (checksum * 10 + digit) % 97;
//        }
//        return checksum;
//    }
    
}

