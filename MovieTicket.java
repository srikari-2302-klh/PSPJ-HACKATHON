package WORK.HACKATHON_PHASE2;

public class MovieTicket{
    String movieName;
    int price;
    int tickets;
    int discount;
    int total;
    int payable;
    

    MovieTicket(String movieName, int price, int tickets){
        this.movieName = movieName;
        this.price = price;
        this.tickets = tickets;
    }
    int calculateTotal(int price, int tickets){
        this.total = price * tickets;
        return this.total;
    }
    static boolean isDiscount(int tickets){
        return tickets >= 5;
    }
    int calculateDiscount(int tickets, boolean isDiscount){
        int total = calculateTotal(price, tickets);
        this.discount = isDiscount ? (total * 10) / 100 : 0;
        return this.discount;
    }
    int calculateFinalAmount(int total){
        this.total = total;
        boolean eligibleForDiscount = isDiscount(tickets);
        this.discount = calculateDiscount(tickets, eligibleForDiscount);
        this.payable = this.total - this.discount;
        return this.payable;
    }

    void displayBill(){
        System.out.println("Movie name: "+ movieName);
        System.out.println("Number of tickets: "+tickets);
        System.out.println("Price of each ticket: "+price);
        System.out.println("Discount: "+ discount);
        System.out.println("Total payable: "+payable);
        
    }
    public  static void main(String[] args){
        MovieTicket mt = new MovieTicket("Doremon and the undersea devil castle", 350, 2);
        int total = mt.calculateTotal(mt.price, mt.tickets);
        mt.calculateFinalAmount(total);
        mt.displayBill();
    }


} 