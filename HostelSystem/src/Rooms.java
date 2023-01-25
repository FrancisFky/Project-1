public abstract class Rooms {
    private int numRoom;


    public Rooms(int numRoom) {
        this.numRoom = numRoom;
    }

    abstract public double roomPrice();

    public double roomPriceCalculation()
    {

        double roomPrice = 0.00;

        if (numRoom ==1){
             roomPrice = 10500.00;
        } else if (numRoom == 2) { roomPrice =15000.00;

        } else if (numRoom==3) { roomPrice=20500.00;

        } else if (numRoom==4) {roomPrice=25000.00;

        }
        else {
            System.out.println("Invalid");
        }

        return roomPrice;
    }
    abstract public double total();
}

