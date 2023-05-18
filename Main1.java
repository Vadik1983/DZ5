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
        Workers.countName();
    }
    private static void workersJournaled(){
        Workers worker = new Workers();
        worker.addWorker("Иванов","Иван");
        worker.addWorker("Петрова", "Светлана");
        worker.addWorker("Белова","Кристина");
        worker.addWorker("Мусина","Анна");
        worker.addWorker("Крутова","Анна");
        worker.addWorker("Юрин","Иван");
        worker.addWorker("Лыков","Петр");
        worker.addWorker( "Чернов","Павел");
        worker.addWorker("Чернышов","Петр");
        worker.addWorker("Федорова","Мария");
        worker.addWorker("Светлова","Марина");
        worker.addWorker( "Савина","Мария");
        worker.addWorker( "Рыкова","Мария");
        worker.addWorker("Лугова","Марина");
        worker.addWorker("Владимиров","Анна");
        worker.addWorker("Мечников","Иван");
        worker.addWorker("Петин","Иван");
    }
}
