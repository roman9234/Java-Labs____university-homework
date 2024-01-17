import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//8 вариант: использовать ConcurrentHashMap для хранения пар "товар-количество продаж".

/*
 * Особенности ConcurrentHashMap
 * Потокобезопасность - несколько потоков могут изменять разные сегменты ConcurrentHashMap (на них разбиты данные)
 * Отсутствие блокировок всей таблицы на время доступа к ней
 * отсутствуют блокировки таблицы при выполнении операции чтения
 */

public class SalesTracker {
    private ConcurrentHashMap<String, Integer> sales;

    //конструктор
    public SalesTracker() {
        sales = new ConcurrentHashMap<>();
    }

    //добавление продажи к существующей
    public void addSale(String product, int quantity) {
        //чтобы внести данные вне зависимости, есть ли уже продажти по позиции, используем getOrDefault()
        //который берёт имеющееся значение, либо если его нет возвращает default 0
        sales.put(product, sales.getOrDefault(product, 0) + quantity);
    }

    //печатаем все имеющиеся в SalesTracker данные
    public void printSales() {
        
        //ради приличия отсортируем по убыванию как в 1 задании

        List<Map.Entry<String, Integer>> count_list = new ArrayList<>(sales.entrySet());
        Collections.sort(count_list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) 
            {return o2.getValue().compareTo(o1.getValue());}});

        for (Map.Entry<String, Integer> entry : count_list) { 
            System.out.println(entry.getKey() + ": " + entry.getValue() + " штук");
        }

        // for (String product : sales.keySet()) {
        //     System.out.println(product + ": " + sales.get(product) + " шт.");
        // }

        
    }

    //печатаем сумму проданных товаров
    public int getTotalSales() {
        int sum = 0;
        //проходимся по значениям и суммируем их
        for (int quantity : sales.values()) {
            sum += quantity;
        }
        return sum;
    }

    //выводим самый продаваемый товар
    public String getMostPopularProduct() {
        String mostPopularProduct = "";
        int maxQuantity = 0;

        for (String product : sales.keySet()) {
            int quantity = sales.get(product);
            //технологии древних русов:
            mostPopularProduct = quantity>maxQuantity ? product : mostPopularProduct;
            maxQuantity = quantity > maxQuantity ? quantity : maxQuantity;
        }
        return mostPopularProduct;
    }
}