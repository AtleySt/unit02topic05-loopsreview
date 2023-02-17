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

  public static String valedictorianName(String[] studentNames, double[] studentGrades) {
    String result = "";
    double curMaxGrade = 0;

    for (int index = 0; index < studentGrades.length; index++) {
      if (studentGrades[index] > curMaxGrade) {
        curMaxGrade = studentGrades[index];
        result = studentNames[index];
      }
    }
    return result;
  }
  
  public static void main(String[] args) {
    // formGradeString
    //int[] nums = {95,72,85,65,36};
    //System.out.println(formGradeString(nums));

    // valedictorianName
    String[] studs = {"emily","albert","sophie","phillip","ophelia"};
    double[] gpas = {0.223,3.528,3.237,1.437,1.162};
    System.out.println(valedictorianName(studs, gpas));
  }
}