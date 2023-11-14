<<<<<<< HEAD
package PACKAGE_NAME;public class Driver {
=======
public class Driver {
    public static void main(String[] args)
    {
        IntArray array = new IntArray(new int[]{4, 2, 32, 57, 22});
        System.out.println(array);
        array.sort(true);
        System.out.println(array);
        array.sort(false);
        System.out.println(array);
        array.randomize();
        System.out.println(array);
        array.add(53);
        array.add(46);
        array.add(69);
        System.out.println(array.getSize());
        array.sort(true);
        System.out.println(array);

    }
>>>>>>> 400b23f (Initial commit)
}
