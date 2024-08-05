package sesion4_java_operators_and_loops.practice.challange;

public class Challange7 {
    private int sideOne;
    private int sideTwo;
    private int sideThree;

    public Challange7(int sideOne, int sideTwo, int sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public void assessTriangle () {
        System.out.println("What my triangle? Sides:" +sideOne+","+ sideTwo+","+sideThree);
        System.out.println((sideOne==sideTwo || sideOne==sideThree ) ?
                                          (sideTwo==sideThree) ?"Equilateral" : "Isoscelous"
                                :(sideTwo==sideThree) ?"Isoscelous" : "Scalene");
        }
}


