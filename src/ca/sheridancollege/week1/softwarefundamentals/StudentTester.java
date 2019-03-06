March 6th, 2019 
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author sidhu376
 */
public class StudentTester {
    
    public static void main(String[] args) {
        
        Student [] stuList = new Student[5];
        stuList[0].setName("Lizzy");
        
        stuList[0]= new Student("Stu1",121);
        stuList[1]= new Student("Stu2",122);
        stuList[2]= new Student("Stu3",123);
        stuList[3]= new Student("Stu4",124);
        stuList[4]= new Student("Stu5",125);
        
        
        for (int i=0;i<stuList.length;i++)
        {
            System.out.println ("Name:" + stuList[i].getName() + " ID: " + stuList[i].getID());
        }
        
    }
}

