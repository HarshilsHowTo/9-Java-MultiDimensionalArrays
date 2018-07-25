import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        char[] myCharacters = {'j','a','v','a'};
        char[] firstThree = Arrays.copyOf(myCharacters, 3);
        char[][] my2DArray = {{'h','g','a'},{'4','2','3','g'}, myCharacters, firstThree};

        char[][] lazyDefine = new char[4][3];

        for (int i = 0; i < lazyDefine.length; i++){
            for (int j = 0; j < lazyDefine[i].length; j++){
                lazyDefine[i][j] = 'h';
                System.out.print(lazyDefine[i][j]);
            }
            System.out.println();
        }

    }
}

