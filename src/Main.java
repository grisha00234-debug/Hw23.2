import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("Акс",  5872));
        films.add(new Film("Дед",  3000));
        films.add(new Film("Чехол",  100));

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Список доступных фильмов");
            for (int i = 0; i < films.size(); i++) {
                System.out.println((i + 1)+ ". " +films.get(i).getName() +  " - " +films.get(i).getPrice());
            }
            System.out.println("Введите номер фильма для заказа:");
            int answer = scanner.nextInt();
            if (answer <1 || answer > films.size()){
                throw new IllegalArgumentException("Ошибка: фильма с таким номером не существует");
            }
            Film film = films.get(answer - 1);
            System.out.println("Введите количество билетов");
            int answer2 = scanner.nextInt();
            if ( answer2 < 1 || answer2 > 31){
                throw new IllegalArgumentException("неверное число билетов");
            }
            film.setTicketCount(answer2);
            System.out.println("Ваша статистика:");
            film.printOrder();

        }catch (InputMismatchException e ){
            System.out.println("Введено некоректное значение!");
        }catch (IllegalArgumentException e){
            System.out.println("\n  " + e.getMessage());
        }finally {
            scanner.close();
        }

    }

}
