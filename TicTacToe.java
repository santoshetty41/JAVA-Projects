import java.util.*;

public class Main {


    static ArrayList<Integer> playerPosition = new ArrayList<Integer>();
    static ArrayList<Integer> compPosition = new ArrayList<Integer>();
    public static void main(String[] args) {



        String[][] gameBoard = { {" ", "|", " ", "|", " "},
                                 {"-", "+", "-", "+", "-"},
                                 {" ", "|", " ", "|", " "},
                                 {"-", "+", "-", "+","-" },
                                 {" ", "|", " ", "|", " "} };

        printGameBoard(gameBoard);

        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the position (1-9): ");
            int playerPos = sc.nextInt();

            while(playerPosition.contains(playerPos) || compPosition.contains(playerPos))
            {
                System.out.println("Enter the valid position");
               playerPos = sc.nextInt();
            }
            placeOf(gameBoard,playerPos, "player");

            String result = checkWinner();
            if(result.length() > 0) {
                System.out.println(result);
                break;
            }
            Random rand = new Random();
            int compPos = rand.nextInt(9) + 1;

            while(compPosition.contains(compPos) || playerPosition.contains(compPos))
            {
                compPos = rand.nextInt(9) + 1;
            }
            placeOf(gameBoard,compPos, "comp");
            printGameBoard(gameBoard);

            result = checkWinner();
            if(result.length() > 0) {
                System.out.println(result);
                break;
            }
//            System.out.println(playerPosition);
//            System.out.println(compPosition);

        }




    }

    private static String checkWinner()
    {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4,5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(3, 4, 7);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(bottomRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for(List l : winning)
        {
            if(playerPosition.containsAll(l))
            {
                return "Congratulations you win!";
            }
            else if(compPosition.containsAll(l))
            {
                return "Computer wins! Sorry :(";
            }
            else if(playerPosition.size() + compPosition.size() == 9)
            {
                return "Match is Tie";
            }

        }

        return "";
    }
    private static void placeOf(String[][] gameBoard, int pos, String user) {
        String sysmbol = null;
        if(user.equals("player"))
        {
            sysmbol = "X";
            playerPosition.add(pos);
        }
        else if(user.equals("comp"))
        {
            sysmbol = "O";
            compPosition.add(pos);
        }

        switch (pos)
        {
            case 1:
                gameBoard[0][0] = sysmbol;
                break;


            case 2:
                gameBoard[0][2] = sysmbol;
                break;

            case 3:
                gameBoard[0][4] = sysmbol;
                break;

            case 4:
                gameBoard[2][0] = sysmbol;
                break;

            case 5:
                gameBoard[2][2] = sysmbol;
                break;

            case 6:
                gameBoard[2][4] = sysmbol;
                break;

            case 7:
                gameBoard[4][0] = sysmbol;
                break;

            case 8:
                gameBoard[4][2] = sysmbol;
                break;

            case 9:
                gameBoard[4][4] = sysmbol;
                break;

            default:
                break;

        }
    }

    private static void placeOf() {
    }

    private static void printGameBoard(String[][] gameBoard) {
        for (String[] row: gameBoard)
        {
            for(String column: row)
            {
                System.out.print(column);
            }
            System.out.println();
        }

    }

}