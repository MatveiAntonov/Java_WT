package by.bsuir.lab1.task8;


public class Main {
    public static void main(String[] args)
    {
       int[] a = new int[] {1, 7, 9, 11, 13, 15, 17, 19};
        int[] b = new int[] {1, 5, 16, 3, 12};

        PlaceSearch(a, b);
    }

    public static  void PlaceSearch(int[] a, int[] b)
    {
        for (int i = 0; i < b.length; i++)
        {
            for (int j = 0; j < a.length - 1; j++)
            {
                if (b[i] >= a[j] && b[i] < a[j+1])
                {
                    System.out.println("Element of array \"b\": " + b[i] + ";   Index of array \"a\": " + (j+1+i));
                    break;
                }
                else if (b[i] < a[0])
                {
                    System.out.println("Element of array \"b\": " + b[i] + ";   Place in array \"a\": " + 0);
                    break;
                } else if (b[i] > a[a.length - 1])
                {
                    System.out.println("Element of array \"b\": " + b[i] + ";   Place in array \"a\": " + (a.length - 1));
                    break;
                }
            }
        }
    }
}