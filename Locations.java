import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class Locations
{
    // initialize array a with all possible values
    static String[] a = {"[0,0,0,0,0]",
            "[0,0,0,0,1]",
            "[0,0,0,1,0]",
            "[0,0,0,1,1]",
            "[0,0,1,0,0]",
            "[0,0,1,0,1]",
            "[0,0,1,1,0]",
            "[0,0,1,1,1]",
            "[0,1,0,0,0]",
            "[0,1,0,0,1]",
            "[0,1,0,1,0]",
            "[0,1,0,1,1]",
            "[0,1,1,0,0]",
            "[0,1,1,0,1]",
            "[0,1,1,1,0]",
            "[0,1,1,1,1]",
            "[1,0,0,0,0]",
            "[1,0,0,0,1]",
            "[1,0,0,1,0]",
            "[1,0,0,1,1]",
            "[1,0,1,0,0]",
            "[1,0,1,0,1]",
            "[1,0,1,1,0]",
            "[1,0,1,1,1]",
            "[1,1,0,0,0]",
            "[1,1,0,0,1]",
            "[1,1,0,1,0]",
            "[1,1,0,1,1]",
            "[1,1,1,0,0]",
            "[1,1,1,0,1]",
            "[1,1,1,1,0]",
            "[1,1,1,1,1]"};

    public static String[] five()
    {
        // initialize new string array for the five coordinates
        String[] f = new String[33559999];

        //temp string for storage purposes
        String temp;

        // nested for loops to create all possible coordinate lists
        int i = 0;
        while (i < a.length)
        {
            for (int j = 0; j < a.length; j++)
            {
                for (int k = 0; k < a.length; k++)
                {
                    for (int l = 0; l < a.length; l++)
                    {
                        for (int m = 0; m < a.length; m++)
                        {
                            for (int n = 0; n < a.length; n++)
                            {
                                temp = "[" + a[j] + "," + a[k] + "," + a[l] + "," + a[m] + "," + a[n] + "]";

                                //checks the string to see if it is unwanted
                                if (fiveCheck(temp))
                                {
                                    f[i] = temp;
                                    i++;
                                    System.out.println(i + "completed.");
                                }
                            }
                        }
                    }
                }
            }
        }

        return f;
    }

    public static boolean fiveCheck(String c)
    {
        // initialize count1 and count0 for the counting of 1 and 0
        int count1 = 0;
        int count0 = 0;

        // for loop to parse through each string
        for (int j = 0; j < c.length(); j++)
        {
            if (c.charAt(j) == '1')
            {
                count1++;
            }
            else if (c.charAt(j) == '0')
            {
                count0++;
            }
        }

        // if count0 is 15 and count1 is 10, then return true
        // if either part of the above statement is not true, then return false
        if (count0 != 15 && count1 != 10)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static void main(String[] args)
    {
        String[] s = five();
        for (int i = 0; i < s.length; i++)
        {
            //Write to file from here.
            System.out.println("\n" + s[i]);
        }

    }
}
