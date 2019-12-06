public class RottenPotato {
    public static void main(String[] args) {
        int[][] ratings = {{4, 9, 2, 5}, {7, 9, 4, 8}, {6, 9, 2, 7}, {3, 9, 1, 5}};
        System.out.println(movieAvgRating(ratings, 2));
    }
    public static int movieAvgRating(int[][] ratings, int movie) {
        int total = 0, reviews = ratings.length;
        for (int i = 0; i < ratings.length; i++) {
            total += ratings[i][movie];
        }
        return total/reviews;
    }
    public static int reviewerAvgRating(int[][] ratings, int reviewer) {
        int total = 0, reviews = ratings[reviewer].length;
        for (int i = 0; i < ratings[reviewer].length; i++) {
            total += ratings[reviewer][i];
        }
        return total/reviews;   
    }
    public static int avgRating2018(int[][] ratings) {
        int total = 0, reviews = 0;
        for (int rows = 0; rows < ratings.length; rows++) {
           for (int colums = 0; colums < ratings[0].length; colums++) {
               total += ratings[rows][colums];
               reviews++;
            }
        }
        return total/reviews;
    }
    public static int hardestRater2018(int[][] ratings) {
        int[] reviewer = new int[ratings.length];
        for (int r = 0; r < ratings.length; r++) {
            int total = 0;
            for (int c = 0; c < ratings[0].length; c++) {
                total += ratings[r][c];
            }
            reviewer[r] = total;
        }
        int lowestScore = reviewer[2];
        int lowest = 0;
        for (int i = 0; i < ratings.length; i++) {
            if (reviewer[i] < lowestScore) lowest = i;
        }
        return lowest;
    }
    public static int worstMovie2018(int[][] ratings) {
        int[] movie = new int[ratings[0].length];
        for (int r = 0; r < ratings.length; r++) {
            int total = 0;
            for (int c = 0; c < ratings[0].length; c++) {
                total += ratings[c][r];
            }
            movie[r] = total;
            System.out.println(movie[r]);
        }
        int lowestScore = movie[2];
        int lowest = 0;
        for (int i = 0; i < ratings[0].length; i++) {
            if (movie[i] < lowestScore) lowest = i;
        }
        return lowest;
    }
}