//////////
//Hsiao Chen Yeh
//Date 9/5/14 
//lab02 Cyclometer
/// My bicycle cyclometer records two kinds of data for 2 trips
///     1)the time elapsed in seconds 2) rotation counts of the front wheel during that time 
/// Find and Print
///     1)minutes for each trip 
///     2)rotation counts for each trip
///     3)distance in miles for each trip
///     4)distance of two trips combined

//  define a class
public class Cyclometer{

//  add main method
    public static void main (String[ ] args) {
        
//  declare variables and state input data
        int secsTrip1=480;      // variable secsTrip1 is declared as an interger and assigned a value equals to 480
        int secsTrip2=3220;     // second trips took 3220 seconds
        int countsTrip1=1561;   // wheelcounts in trip1 was 1561
        int countsTrip2=9037;   // wheelcounts in trip2 was 9037
//  declare intermediate variables and output data
        double wheelDiameter=27.0,   // wheelDiameter is 27 inches, declared as double, which will give extra percision
        PI=3.14159,                 //  allows program to calculate distance of a rotation count
        feetPerMile=5280,           //  unit conversion allows program to compute desired unit in miles
        inchesPerFoot=12,           //  see above
        secondsPerMinute=60;        //  unit conversion allows program to compute desired unit in minutes
        double distanceTrip1,   distanceTrip2,  totalDistance;  // double gives extra percision for these 3 variables
//  print out the numbers you've stored in the variables
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
//  Compute the values for the distances
        distanceTrip1=countsTrip1*wheelDiameter*PI;         //Gives distance in inches
//      for each count, a rotation of the wheel travels the diameter in inches times PI
        distanceTrip1/=inchesPerFoot*feetPerMile;           // "/" help convert distance to miles       
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;   //Gives distance in miles
        totalDistance=distanceTrip1+distanceTrip2;
//  print out the distances
//  print out the output data
        System.out.println("Trip1 was "+distanceTrip1+" miles");
        System.out.println("Trip2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
//  Run code
        
        
    }
}