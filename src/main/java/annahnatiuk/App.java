package annahnatiuk;

public class App 
{
    public static char determineGrade (int gradeNumber) {
        if (gradeNumber < 0){
            throw new IllegalArgumentException("Grade number should be more than 0");
            //return 'a';
        }

        else if (gradeNumber < 27){
            return '0';
        }

        else if (gradeNumber < 50){
            return '2';
        }

        else if (gradeNumber < 70){
            return '3';
        }

        else if (gradeNumber < 88){
            return '4';
        }

        else {
            return '5';
        }
    }
    public static void main( String[] args )
    {
        
    }
}
