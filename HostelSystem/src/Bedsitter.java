public class Bedsitter extends Rooms {

    public Bedsitter(int numRoom) {
        super(numRoom);
    }

    public  double roomPrice (){
        double roomPrice = 10500.00;
        return roomPrice;
    }

    public double total(){
        double total = 0.00;
        double numRoom = roomPriceCalculation();
        total = numRoom;
        return total;
    }
}
