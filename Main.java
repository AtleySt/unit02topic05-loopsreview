public class Main {

  public static String formGradeString(int[] grades) {
    String result = "";
    for (int item : grades) {
      if (item >= 90) {
        result = result + "A";
      } else if (item >=80) {
        result = result + "B";
      } else if (item >= 70) {
        result = result + "C";
      } else if (item >= 60) {
        result = result + "D";
      } else {
        result = result + "F";
      }
    }
    return result;
  }
  
  public static void main(String[] args) {
    int[] nums = {95,72,85,65,36};
    System.out.println(formGradeString(nums));
  }
}