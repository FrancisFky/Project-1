public class Onebedroom extends Rooms {

    public Onebedroom(int numRoom) {
        super(numRoom);
    }

    public  double roomPrice (){
        double roomPrice = 15000.00;
        return roomPrice;
    }

    public double total(){
        double total = 0.00;
        double numRoom = roomPriceCalculation();
        total = numRoom;
        return total;
    }
}
