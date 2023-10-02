
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;
public class currency {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();
//Locale uslocale = new Locale ("en", "US");
            NumberFormat currencyFormatterus = NumberFormat.getCurrencyInstance(Locale.US);
            String us = currencyFormatterus.format(payment);

            Locale ilocale = new Locale ("en","IN");
            NumberFormat currencyFormatteri = NumberFormat.getCurrencyInstance(ilocale);
            String i = currencyFormatteri.format(payment);

//Locale clocale = new Locale ("c", "China");
            NumberFormat currencyFormatterc = NumberFormat.getCurrencyInstance(Locale.CHINA);
            String c = currencyFormatterc.format(payment);

//Locale flocale = new Locale ("f", "France");
            NumberFormat currencyFormatterf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            String f = currencyFormatterf.format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + i);
            System.out.println("China: " + c);
            System.out.println("France: " + f);
        }
    }

