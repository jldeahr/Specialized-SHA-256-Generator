import java.util.Arrays;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Random;
import java.security.MessageDigest;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;
import java.util.Formatter;

public class SatoshiKaroshi
{
    static String[] a = {"(1,1,1 | ",
            "(1,1,2 | ",
            "(1,2,1 | ",
            "(1,2,2 | ",
            "(2,1,1 | ",
            "(2,1,2 | ",
            "(2,2,1 | ",
            "(2,2,2 | "};

    static String[] b = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", 
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    static ArrayList<String> c = new ArrayList<String>();
    static ArrayList<String> r = new ArrayList<String>();
    static ArrayList<String> sec = new ArrayList<String>();
    static ArrayList<String> min = new ArrayList<String>();
    static ArrayList<String> hour = new ArrayList<String>();
    public static void main(String[] args)
    {
        one();
        min();
        hour();
        sec();
        random6Char();
        //System.out.println((String)c.get(0) + (String)getYear() + "-" + (String)getMonth() + "-" + (String)getDay() + " " + (String)hour.get(0) + ":" + (String)min.get(0) + ":" + (String)sec.get(0) + ")");
        build();
    }

    public static void one()
    {
        for (int i = 0; i < a.length; i++)
        {
            c.add((String)a[i]);
            //System.out.println(c.get(c.size()-1));
        }
    }

    public static String getDay()
    {
        GregorianCalendar cal = new GregorianCalendar();
        int day = cal.get(cal.DAY_OF_MONTH) + 1;
        String sDay;
        if (day > 9)
        {
            sDay = Integer.toString(day);
        }
        else
        {
            sDay = "0" + Integer.toString(day);
        }
        return sDay;
    }

    public static String getMonth()
    {
        GregorianCalendar cal = new GregorianCalendar();
        int month = cal.get(cal.MONTH) + 1;
        String sMonth = "0" + Integer.toString(month);
        return sMonth;
    }

    public static String getYear()
    {
        GregorianCalendar cal = new GregorianCalendar();
        int year = cal.get(cal.YEAR);
        String sYear = Integer.toString(year);
        return sYear;
    }

    public static void min()
    {
        for (int i = 0; i < 60; i++)
        {
            String s = Integer.toString(i);
            if (i < 10)
            {
                s += "0";
            }
            min.add(s);
        }
    }

    public static void hour()
    {
        for (int i = 0; i < 24; i++)
        {
            String s = Integer.toString(i);
            if (i < 10)
            {
                s += "0";
            }
            hour.add(s);
        }
    }

    public static void sec()
    {
        for (int i = 0; i < 60; i++)
        {
            String s = Integer.toString(i);
            if (i < 10)
            {
                s += "0";
            }
            sec.add(s);
        }
    }

    @SuppressWarnings("unchecked")
    public static void random6Char()
    throws FileNotFoundException
    {
        PrintWriter out = new PrintWriter("6char.txt");
        int h = 0;
        while (h < 2176782337L)
        {
            for (int i = 0; i < b.length; i++)
            {
                for (int j = 0; j < b.length; j++)
                {
                    for (int k = 0; k < b.length; k++)
                    {
                        for (int l = 0; l < b.length; l++)
                        {
                            for (int m = 0; m < b.length; m++)
                            {
                                for (int n = 0; n < b.length; n++)
                                {
                                    out.println(b[i] + b[j] + b[k] + b[l] + b[m] + b[n]);
                                    //System.out.println(a[i] + a[j] + a[k] + a[l] + a[m] + a[n] + a[o] + a[p] + a[q] + a[r] + a[s] + a[t] + a[u] + a[v] + a[w] + a[x]);
                                    //System.out.println(f.get(f.size()-1));
                                    h++;
                                    System.out.println(h);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void build()
    throws FileNotFoundException
    {
        PrintWriter out = new PrintWriter("SatoshiKaroshiWords.txt");
        PrintWriter out2 = new PrintWriter("Hashes.txt");
        Scanner in = new Scanner(new File("6char.txt"));
        //in.useDelimiter("[^a-z

        String str;
        String hash;
        while (in.hasNextLine())
        {
            for (int i = 0; i < c.size()-1; i++)
            {
                for (int j = 0; j < hour.size()-1; j++)
                {
                    for (int k = 0; k < min.size()-1; k++)
                    {
                        for (int l = 0; l < sec.size()-1; l++)
                        {
                            str = (String)c.get(i) + (String)getYear() + "-" + (String)getMonth() + "-" + (String)getDay() + " " + (String)hour.get(j) + ":" + (String)min.get(k) + ":" + (String)sec.get(l) + ")" + in.nextLine();
                            hash = encryptPassword(str);
                            out.println(str);
                        }
                    }
                }
            }
        }
    }

    private static String encryptPassword(String password)
    {
        String sha1 = "";
        try
        {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(password.getBytes("UTF-8"));
            sha1 = byteToHex(crypt.digest());
        }
        catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch(UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        return sha1;
    }

    private static String byteToHex(final byte[] hash)
    {
        Formatter formatter = new Formatter();
        for (byte b : hash)
        {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }
}
