<<<<<<< HEAD
package PACKAGE_NAME;public class IntArray {
=======
import java.util.ArrayList;
import java.util.Random;

public class IntArray {
    private int size;
    private ArrayList<Integer> arr;
    private boolean sorted;

    IntArray()
    {
        size = 0;
        arr = new ArrayList<Integer>();
        sorted = false;
    }

    IntArray(int[] arr)
    {
        size = arr.length;
        this.arr = new ArrayList<Integer>();
        for(int num: arr)
        {
            this.arr.add(num);
        }
        sorted = false;
    }

    IntArray(ArrayList<Integer> arr)
    {
        size = arr.size();
        this.arr = arr;
        sorted = false;
    }

    /*
    getSize - returns the size of the array
    @return - size of the array as an integer
     */
    public int getSize()
    {
        return size;
    }

    /*
    isSorted - returns whether the array is sorted
    @return - whether the array is sorted as an integer
     */
    public boolean isSorted()
    {
        return sorted;
    }

    public ArrayList<Integer> getArr()
    {
        return arr;
    }

    public void randomize()
    {
        ArrayList<Integer> narr = new ArrayList<Integer>();
        Random numGen = new Random();
        int index;
        boolean done = false;
        while(!done)
        {
            if (arr.size() != 0)
            {
                index = numGen.nextInt(0, arr.size());
                narr.add(arr.get(index));
                arr.remove(index);
            }
            else
            {
                done=true;
            }
        }
        arr = narr;
        sorted = false;
    }

    public String toString()
    {
        return arr.toString();
    }

    public void add(Integer num)
    {
        arr.add(num);
        size++;
    }

    public void sort(boolean lth)
    {
        if(lth)
        {
            int current = 0;
            int next = 0;
            boolean swapped = false;
            boolean done = false;

            while(!done)
            {
                swapped = false;
                for(int i = 0; i < arr.size()-1; i++)
                {
                    if(arr.get(i)>arr.get(i+1))
                    {
                        current = arr.get(i);
                        next = arr.get(i+1);
                        arr.set(i, next);
                        arr.set(i+1, current);
                        swapped = true;
                    }
                }
                if(!swapped) done = true;
            }
        }
        else
        {
            int current = 0;
            int next = 0;
            boolean swapped = false;
            boolean done = false;

            while(!done)
            {
                swapped = false;
                for(int i = 0; i < arr.size()-1; i++)
                {
                    if(arr.get(i)<arr.get(i+1))
                    {
                        current = arr.get(i);
                        next = arr.get(i+1);
                        arr.set(i, next);
                        arr.set(i+1, current);
                        swapped = true;
                    }
                }
                if(!swapped) done = true;
            }
        }
        sorted=true;
    }

>>>>>>> 400b23f (Initial commit)
}
