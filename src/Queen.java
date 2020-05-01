public class Queen extends Piece {


    boolean isValidMove (Position oldPosition, Position newPosition){
        int rowDiff = Math.abs(newPosition.row - oldPosition.row);
        int colDiff = Math.abs(newPosition.column -oldPosition.column);

        if (newPosition.row == oldPosition.row || newPosition.column == oldPosition.column || rowDiff == colDiff ){
            return true;
        }
        else{
                return false;
        }
    }
    boolean checkSuper (Position position){
       return super.isValidMove(position);
    }

}
