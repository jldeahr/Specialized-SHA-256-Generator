import java.util.ArrayList;
import java.security.MessageDigest;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Random16
{
    // initialize array a with all possible values
    static String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", 
                         "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
                         "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    @SuppressWarnings("unchecked")
    public static void combos1()
    throws FileNotFoundException
    {
        PrintWriter out = new PrintWriter("unencrypted.txt");
        
        long h = 0;
        //while (h < 999999999999999999L && g < 47672401707L)
        while (h < 47672401707L)
        {
            for (int i = 0; i < a.length; i++)
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
                                    for (int o = 0; o < a.length; o++)
                                    {
                                        for (int p = 0; p < a.length; p++)
                                        {
                                            for (int q = 0; q < a.length; q++)
                                            {
                                                for (int r = 0; r < a.length; r++)
                                                {
                                                    for (int s = 0; s < a.length; s++)
                                                    {
                                                        for (int t = 0; t < a.length; t++)
                                                        {
                                                            for (int u = 0; u < a.length; u++)
                                                            {
                                                                for (int v = 0; v < a.length; v++)
                                                                {
                                                                    for (int w = 0; w < a.length; w++)
                                                                    {
                                                                        for (int x = 0; x < a.length; x++)
                                                                        {
                                                                            out.println(a[i] + a[j] + a[k] + a[l] + a[m] + a[n] + a[o] + a[p] + a[q] + a[r] + a[s] + a[t] + a[u] + a[v] + a[w] + a[x]);
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void main(String[] args)
    throws FileNotFoundException
    {
        combos1();
    }
}
