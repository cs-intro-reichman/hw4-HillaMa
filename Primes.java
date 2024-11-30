public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n + 1];
        arr[0] = false;
        arr[1] = false;
        int i = 2;
        while(i < arr.length) {
            arr[i] = true;
            i++;
        }
        i = 2;
        while(i <= Math.sqrt(n)) {
            if(arr[i]) {
                int j = i * i;
                while(j <= n) {
                    arr[j] = false;
                    j += i;
                }
            }
            i++;
        }

        i = 2;
        int counter = 0;
        System.out.println("Prime numbers up to " + n + ":");
        while(i <= n) {
            if(arr[i]) {
                System.out.println(i);
                counter++;
            }
            i++;
        }
        double percent = ((double) counter / n) * 100;
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + (int)percent + "% are primes)");
    }
}