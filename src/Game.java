public class Game {

    public static void main (String[] args){
        Queen queen = new Queen();
        Position oldPosition = new Position(3,2);
        Position newPosition = new Position (1,1);
        boolean validPosition = queen.isValidMove(oldPosition, newPosition);
        System.out.println(validPosition);
        System.out.println(queen.checkSuper(newPosition));
    }
}
