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

    /*
    getArr - returns the arraylist
    @return - the arraylist
     */
    public ArrayList<Integer> getArr()
    {
        return arr;
    }

    /*
    randomize - randomizes the array
     */
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

    /*
    toString - override method toString()
    @return - string value of arraylist
     */
    public String toString()
    {
        return arr.toString();
    }

    /*
    add - adds an element to the end of the array
    @param num - an integer to be added to the array
     */
    public void add(Integer num)
    {
        arr.add(num);
        size++;
    }

/*
sort - sorts the list either from high to low or low to high
@param lth - if true: low to high.  if false: high to low.
 */
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
}
