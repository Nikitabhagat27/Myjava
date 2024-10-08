package Arrays_;

public class Pr_2 {
    public static void main(String[] args) {
        int [] marks=  {56,67,87,98,97,54,6,67};
        int num=97;
        boolean isInArray =false;//by default
        for(int element :marks){
            if(num == element){
                isInArray = true;
                break;//because ydi condition true hogi to runn nhi hoga
            }
        }
        if(isInArray){
            System.out.println("the value is present in array");
        }
        else {
            System.out.println("the value is not present in array");
        }
    }
}
