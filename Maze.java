public class Maze{
  //Represents a Maze using a 2D array
  public int[][] mazeElements; //0: path(*) 1: wall( ) 2: correct route(#)



  public Maze(int ranks, int files){
    mazeElements = new int[ranks][files];
  }

  public Maze(Maze old){
    mazeElements = old.mazeElements.clone();
  }

  public String toString(){
    String output = "";
    for( int rank = 0; rank < mazeElements.length; rank++){
      for( int file = 0; file < mazeElements[].length; file++){
        int space = mazeElements[rank][file];

        if(space == 0)      output += "*";
        else if(space == 1) output += " ";
        else if(space == 2) output += "#";
      }
      output
    }
  }
}
