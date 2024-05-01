import java.util.Arrays;

public class Print {
    public static void main(String[] args) {

        int [] age={18,19,20,21,22,23,24};
        System.out.println("First Element: "+age[0]);
        System.out.println("Second Element: "+age[1]);
        System.out.println("Third Element: "+age[2]);
        System.out.println("Fourth Element: "+age[3]);
        System.out.println("Fifth Element: "+age[4]);
        System.out.println("Sixth Element: "+age[5]);
        System.out.println("Seventh Element: "+age[6]);



        System.out.println(age.length);
        System.out.println(Arrays.stream(age).max());
        System.out.println(Arrays.stream(age).average());
        System.out.println(Arrays.stream(age).count());
        System.out.println(Arrays.stream(age).asDoubleStream());
        System.out.println(Arrays.stream(age).distinct());
        System.out.println(Arrays.stream(age).limit(3));
        System.out.println(Arrays.stream(age).boxed());
        System.out.println(Arrays.stream(age).iterator());
        System.out.println(Arrays.stream(age).summaryStatistics());

    }
}
