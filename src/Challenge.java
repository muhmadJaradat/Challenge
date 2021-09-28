public class Challenge {

    static class Challenge1{

        /*
        here we have 2 equations with 3 variables so we need to iterate through every single possible number of each item using 3 nested loops
        here we have 3 variables  x,y,z which are drinks,donuts and burgers number respectively and their price is as the following : 0.2,2 and 10 JDs
        the 2 equations like bellow:
        1. x+y+z=200  the 200 is the number of wedding's attendees
        2. 0.2x+2y+10z=200JDs

        And for the maximum number of iterations for each item is 200JDs/its price
        for drinks 200/0.2=1000
        for donuts 200/2=100
        for burgers 200/10=20
         */

        //declare a float variable to assign the price in it
        static float price=0f;
        public static void getBurgersNum(){
            //first loop for drinks
            for(int drinksNum=0;drinksNum<1000;drinksNum++){
                //second loop for donuts
                for (int donutsNum=0;donutsNum<100;donutsNum++){
                    //third loop for burgers
                    for (int burgerNum=0;burgerNum<20;burgerNum++){
                        price= (float) (0.2*drinksNum+2*donutsNum+10*burgerNum);

                        if (price==200&&drinksNum+donutsNum+burgerNum==200) System.out.println(burgerNum);
                    }
                }
            }
        }



    }

    static class Q2{
        /*
        In this question we need to loop from 1 to 1000 and at each time check if the number is dividable by 3 or 5
        if that was the case add this number to a declared integer with initial value of 0
         */
        static int result=0;
        public static int sum(){
            for(int i=0;i<1000;i++){
                if (i%5==0||i%3==0)result+=i;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Challenge1.getBurgersNum();
        System.out.println(Q2.sum());
    }
}
