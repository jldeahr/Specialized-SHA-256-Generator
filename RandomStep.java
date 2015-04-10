import java.util.ArrayList;
import java.security.MessageDigest;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class RandomStep
{
    // initialize array a with all possible values
    static String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", 
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static void combos3(ArrayList t)
    {
        int h = 0;
        while (h < 238328)
        {
            for (int i = 0; i < a.length; i++)
            {
                for (int j = 0; j < a.length; j++)
                {
                    for (int k = 0; k < a.length; k++)
                    {
                        t.add(a[i] + a[j] + a[k]);
                        //System.out.println(a[i] + a[j] + a[k] + a[l] + a[m] + a[n] + a[o] + a[p] + a[q] + a[r] + a[s] + a[t] + a[u] + a[v] + a[w] + a[x]);
                        //System.out.println(t.get(h));
                        h++;
                        //System.out.println(h);
                    }
                }
            }
        }

        //return t;
    }

    public static void combos9(ArrayList n, ArrayList t)
    {
        for (int i = 0; i < t.size(); i++)
        {
            for (int j = 0; j < t.size(); j++)
            {
                for (int k = 0; k < t.size(); k++)
                {
                    n.add((String)t.get(i) + (String)t.get(j) + (String)t.get(k));
                    System.out.println(n.get(n.size()-1));
                }
            }
        }

        //return n;
    }

    public static void combos7(ArrayList s, ArrayList t)
    {
        for (int i = 0; i < t.size(); i++)
        {
            for (int j = 0; j < t.size(); j++)
            {
                for (int k = 0; k < t.size(); k++)
                {
                    for (int l = 0; l < a.length; l++)
                    {
                        s.add((String)t.get(i) + (String)t.get(j) + (String)t.get(k) + (String)a[l]);
                        //System.out.println(s.get(s.size()-1));
                    }
                }
            }
        }
    }

    public static void combos16(ArrayList si, ArrayList n, ArrayList s)
    {
        for (int i = 0; i < n.size(); i++)
        {
            for (int j = 0; j < s.size(); j++)
            {
                si.add((String)n.get(i) + (String)s.get(j));
                //System.out.println(si.get(si.size()-1));
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<String> t = new ArrayList<String>();
        ArrayList<String> n = new ArrayList<String>();
        ArrayList<String> s = new ArrayList<String>();
        ArrayList<String> si = new ArrayList<String>();
        combos3(t);
        System.out.println(t.get(t.size()-1));
        combos9(n,t);
        System.out.println(n.get(n.size()-1));
        combos7(s,t);
        System.out.println(s.get(s.size()-1));
        combos16(si,n,s);
        System.out.println(si.get(si.size()-1));
    }

    public static String sha256(String base)
    {
        try
        {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(base.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++)
            {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        }
        catch(Exception ex)
        {
            throw new RuntimeException(ex);
        }
    }
}
