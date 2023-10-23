public class Lab {
    public static void main(String[] args) {

        problema1();
        problema2();
        problema3();
        problema4();
    }

    private static void problema1() {
        String[] cuv1 = {"negru", "nyryru", "negru"};
        String[] cuv2 = {"afd", "nhgfu", "negru"};
        System.out.println("elementele identice:");
        for (String element : cuv1) {
            for (String element2 : cuv2) {
                if (element.equals(element2)) {
                    System.out.println(element + " ");
                }
            }

        }
    }

    private static void problema2() {
        int a = 0;
        int[] nr = {1, 3, 2, 12, 11};
        for (int i : nr) {
            a = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    a = a + 1;
            }
            if (a == 0)
                System.out.println(i + " ");
        }
    }

    private static void problema3() {
        int n = 23;
        int s = 0;
        int i = 0;
        int j = 1;
        while (s <= n) {
            System.out.println(s + " ");
            s = i + j;

            i = j;

            j = s;

        }
    }
    private static void problema4() {
        int n = 121;
        int n2 = n;
        int s = 0;
        int r = 0;
        while (n2 != 0)
        {
            r=n2%10;
            n2=n2/10;
            s=s*10+r;
        }
        if(s==n)
            System.out.println("palindrom");
    }
}

