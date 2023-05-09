public class Main1 {
    public static void main(String[] args) {
        /*
        Пусть дан список сотрудников:
         Иван      Иванов,
         Светлана  Петрова,
         Кристина  Белова,
         Анна      Мусина,
         Анна      Крутова,
         Иван      Юрин,
         Петр      Лыков,
         Павел     Чернов,
         Петр      Чернышов,
         Мария     Федорова,
         Марина    Светлова,
         Мария     Савина,
         Мария     Рыкова,
         Марина    Лугова,
         Анна      Владимирова,
         Иван      Мечников,
         Петр      Петин,
         Иван      Ежов.
          Написать программу, которая найдет и выведет повторяющиеся имена
          с количеством повторений. Отсортировать по убыванию популярности.
          Для сортировки использовать TreeMap.
         */
        workersJournaled();
    }
    private static void workersJournaled(){
        Workers worker = new Workers();
        worker.addWorker("Иван", "Иванов");
        worker.addWorker("Светлана", "Петрова");
        worker.addWorker("Кристина", "Белова");
        worker.addWorker("Анна", "Мусина");
        worker.addWorker("Анна", "Крутова");
        worker.addWorker("Иван", "Юрин");
        worker.addWorker("Петр", "Лыков");
        worker.addWorker("Павел", "Чернов");
        worker.addWorker("Петр", "Чернышов");
        worker.addWorker("Мария","Федорова");
        worker.addWorker("Марина", "Светлова");
        worker.addWorker("Мария", "Савина");
        worker.addWorker("Мария", "Рыкова");
        worker.addWorker("Марина","Лугова");
        worker.addWorker("Анна", "Владимиров");
        worker.addWorker("Иван", "Мечников");
        worker.addWorker("Петр", "Петин");
        worker.addWorker("Иван", "Ежов");
    }
}
