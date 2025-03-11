import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StreamTest {

    @Test
    public void even() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        Arrays.stream(arr).filter(e -> e % 2 == 0).forEach(System.out::println);
    }

    @Test
    public void multiplyBy2() {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).map(x -> x * 2).forEach(System.out::println);
    }

    @Test
    public void sumReduce() {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).reduce( (a, b) -> a + b).ifPresent(System.out::println);
    }

    @Test
    public void firstEven() {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).filter(x -> x % 2 == 0).findFirst().ifPresent(System.out::println);
    }

    @Test
    public void ascendingSort() {
        int[] arr = {1, 5, 3, 9, 7};
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }

    @Test
    public void limit10 () {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Arrays.stream(arr).limit(10).forEach(System.out::println);
    }

    @Test
    public void skip10every10 () {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Arrays.stream(arr).skip(10).filter(e -> e % 10 == 0).forEach(System.out::println);
    }

    @Test
    public void divBy3 () {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        Arrays.stream(arr).filter(x -> x % 3 == 0).forEach(System.out::println);
    }

    @Test
    public void odd () {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).filter(x -> x % 2 != 0).forEach(System.out::println);
    }

    @Test
    public void bigger () {
        int[] arr = {1, 2, 3, 4, 5};
        int num = 3;
        Arrays.stream(arr).filter(x -> x > num).forEach(System.out::println);
    }
}
