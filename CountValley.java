package helloworld;

public class CountValley {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String path = "UDDDUDUU";
        int nofValley = countingValleys(path.length(), path);
        System.out.println("counted valley as " + nofValley);

    }

    static int countingValleys(int n, String s) {
        // to count number of UP and DOWN step
        int countU = 0, countD = 0;
        int countValley = 0;

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == 'U') {
                countU++;

            } else if (s.charAt(index) == 'D') {
                countD++;
            }

        }
        // come up sea level finally
        if (countU == countD) {
            countU = 0;
            countD = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'D') {
                    if (countD == countU) {
                        countValley++;
                    }
                    countD++;
                } else
                    countU++;
            }
        }
        return countValley;

    }
}
