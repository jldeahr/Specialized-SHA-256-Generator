import java.util.Random;
import java.util.ArrayList;

public class Random4
{
    // initialize array a with all possible values
    static String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", 
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static ArrayList<String> combos1()
    {
        ArrayList<String> f = new ArrayList<String>();

        int h = 0;
        while (h < 14776336)
        {
            for (int i = 0; i < a.length; i++)
            {
                for (int j = 0; j < a.length; j++)
                {
                    for (int k = 0; k < a.length; k++)
                    {
                        for (int l = 0; l < a.length; l++)
                        {
                            f.add(h,a[i] + a[j] + a[k] + a[l]);
                            //System.out.println(a[i] + a[j] + a[k] + a[l] + a[m] + a[n] + a[o] + a[p] + a[q] + a[r] + a[s] + a[t] + a[u] + a[v] + a[w] + a[x]);
                            System.out.println(f.get(h));
                            h++;
                            System.out.println(h);
                        }
                    }
                }
            }
        }

        return f;
    }

    public static String[] combos2()
    {
        String[] f = new String[999999];

        int h = 0;
        while (h < 999999)
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
                                                            for (int u = 5; u < a.length; u++)
                                                            {
                                                                for (int v = 13; v < a.length; v++)
                                                                {
                                                                    for (int w = 10; w < a.length; w++)
                                                                    {
                                                                        for (int x = 1; x < a.length; x++)
                                                                        {
                                                                            f[h] = a[i] + a[j] + a[k] + a[l] + a[m] + a[n] + a[o] + a[p] + a[q] + a[r] + a[s] + a[t] + a[u] + a[v] + a[w] + a[x];
                                                                            System.out.println(a[i] + a[j] + a[k] + a[l] + a[m] + a[n] + a[o] + a[p] + a[q] + a[r] + a[s] + a[t] + a[u] + a[v] + a[w] + a[x]);
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

        return f;
    }

    public static void main(String[] args)
    {
        combos1();
    }
}
