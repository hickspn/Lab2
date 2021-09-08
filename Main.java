class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
  
  double totalMMs;
  float numBlue;
  float numBrown;
  float numGreen;
  float numOrange;
  float numRed;
  float numYellow;
  int sum = 0;

  totalMMs = 605;
  
  float numBlue = totalMMs * .24;
    System.out.println("blue: " numBlue);

  float numBrown = totalMMs * .13;
    System.out.println("Brown: " numBrown);
  
  float numGreen = totalMMs * .16; 
    System.out.println("Green: " numGreen);

  float numOrange = totalMMs * .2;
    System.out.println("Orange: "numOrange);
  
  float numRed = totalMMs * .13;
    System.out.println("Red: "numRed);
  
  float numYellow = totalMMs * .14;
   System.out.println("Yellow: "numYellow); 

  sum = numOrange + numBrown + numGreen + numOrange + numRed + numYellow
  
  System.out.println("Sum: " + sum);
  

  if(numBlue < numBrown && numRed > numOrange){
    System.out.println("Blue under Brown and Red over Orange");
  }
  if(numBrown >= numGreen){
    System.out.println("Brown is greater than or equal to Green");
  }
  if(sum == totalMMs){
    System.out.println("Numbers match");
  }
  }

}