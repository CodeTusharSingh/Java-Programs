import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

class Search implements Runnable {
    private int NoToSearch;
    private int NoList[];
    private int from;
    private int to;
    public boolean found;
    public int location;

    public Search(int NoList[], int NoToSearch, int from, int to) {
        this.NoList = NoList;
        this.NoToSearch = NoToSearch;
        this.from = from;
        this.to = to;
        found = false;
        location = -1;
    }

    @Override
    public void run() {
        for (int i = from; i <= to; i++) {
            if (NoList[i] == NoToSearch) {
                found = true;
                location = i;
            }
        }
    }
}

public class multithreading_array_search {
    public static void main(String[] args) {
        int NoToSearch;
        int NoList[] = new int[10000];
        try (Scanner s = new Scanner(System.in)) {
            Thread t1, t2, t3, t4;
            Random r = new Random();
            for (int i = 0; i < 10000; i++) {
                NoList[i] = r.nextInt(20000);
            }
            System.out.println("Enter the number to search from 0 to 20000: ");
            NoToSearch = s.nextInt();
            try {
                System.out.println(new SimpleDateFormat("yyyy-MM-dd:mm:ss.SS").format(new Date()));
                long start = System.currentTimeMillis();
                Search firstSearch = new Search(NoList, NoToSearch, 0, 2499);
                Search secondSearch = new Search(NoList, NoToSearch, 2500, 4999);
                Search thirdSearch = new Search(NoList, NoToSearch, 5000, 7499);
                Search fourthSearch = new Search(NoList, NoToSearch, 7500, 9999);
                t1 = new Thread(firstSearch, "First Thread");
                t2 = new Thread(firstSearch, "Second Thread");
                t3 = new Thread(firstSearch, "Third Thread");
                t4 = new Thread(firstSearch, "Fourth Thread");
                t1.start();
                t2.start();
                t3.start();
                t4.start();
                t1.join();
                t2.join();
                t3.join();
                t4.join();
                long end = System.currentTimeMillis();
                System.out.println(new SimpleDateFormat("yyyy-MM-dd:mm:ss.SS").format(new Date()));
                if (firstSearch.found) {
                    System.out.println("Found number at location " + firstSearch.location + " in first Thread.");
                } else if (secondSearch.found) {
                    System.out.println("Found number at location " + secondSearch.location + " in second Thread.");
                } else if (thirdSearch.found) {
                    System.out.println("Found number at location " + thirdSearch.location + " in third Thread.");
                } else if (fourthSearch.found) {
                    System.out.println("Found number at location " + fourthSearch.location + " in fourth Thread.");
                } else {
                    System.out.println("Number not found.");
                }
                System.out.println("Time elapsed : " + (end - start));
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}

// import java.text.SimpleDateFormat;
// import java.util.Date;
// import java.util.Random;
// import java.util.Scanner;

// class Search implements Runnable {
// private int NoToSearch;
// private int NoList[];
// private int from;
// private int to;
// public boolean found;
// public int location;

// public Search(int NoList[], int NoToSearch, int from, int to) {
// this.NoList = NoList;
// this.NoToSearch = NoToSearch;
// this.from = from;
// this.to = to;
// found = false;
// location = -1;
// }

// @Override
// public void run() {
// for (int i = from; i <= to; i++) {
// if (NoList[i] == NoToSearch) {
// found = true;
// location = i;
// }
// }
// }
// }

// public class multithreading_array_search {
// public static void main(String[] args) {
// int NoToSearch;
// int NoList[] = new int[10000];
// Scanner s = new Scanner(System.in);
// Thread t1;
// Random r = new Random();
// for (int i = 0; i < 10000; i++) {
// NoList[i] = r.nextInt(20000);
// }
// System.out.println("Enter the number to search from 0 to 20000: ");
// NoToSearch = s.nextInt();
// try {
// System.out.println(new SimpleDateFormat("yyyy-MM-dd:mm:ss.SS").format(new
// Date()));
// long start = System.currentTimeMillis();
// Search firstSearch = new Search(NoList, NoToSearch, 0, 9999);
// t1 = new Thread(firstSearch, "First Thread");
// t1.start();
// t1.join();
// long end = System.currentTimeMillis();
// System.out.println(new SimpleDateFormat("yyyy-MM-dd:mm:ss.SS").format(new
// Date()));
// if (firstSearch.found) {
// System.out.println("Found number at location " + firstSearch.location + " in
// first Thread.");
// } else {
// System.out.println("Number not found.");
// }
// System.out.println("Time elapsed : " + (end - start));
// } catch (InterruptedException e) {
// System.out.println("Error: " + e);
// }
// }
// }
