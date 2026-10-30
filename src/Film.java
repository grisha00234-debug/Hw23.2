public class Film {
    private String name;
    private int price;
    private  int ticketCount;

    public Film(String name,  int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public int calculateTotal(){
        return ticketCount * price ;
    }
    public void printOrder() {
        System.out.println("Информация о заказе:");
        System.out.println("Фильм: " + name);
        System.out.println("Цена за билет: " + price);
        System.out.println("Количество билетов: " + ticketCount);
        System.out.println("Общая стоимость: " + calculateTotal());
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }
}
