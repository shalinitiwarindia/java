public class ThreeDimensional {

    public static void main(String[] args) {
        int[][][] threeDimen = {
                {
                        {10, 20, 30},                     //Electronic Department
                        {20, 40, 80}
                },
                {
                        {10, 25, 65},                            // CS Department
                        {60, 70, 80}
                },
                {
                        {10, 21, 55},
                        {62, 40, 10}                             //Mech Department
                }
        };
        System.out.println(threeDimen[1][0][1]);
    }
}
