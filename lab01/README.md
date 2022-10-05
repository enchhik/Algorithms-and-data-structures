Написать программу, которая сравнивает скорость работы ArrayList и LinkedList (Java)
 
Сравниваются следующие операции:
1. Заполнение массива
2. Random Access (доступ по индексу)
3. Sequential Access (доступ по итератору)
4. Вставка в начало списка
5. Вставка в конец списка
6. Вставка в середину списка
 
Рекомендации:
- Список заполняем случайными целыми числами в диапазоне от 0 до N (N - размер списка)
- для каждой операции из приведенных - пишем статический метод, 
  который принимает обощенный список List<Integer> list и ряд дополнительных необходимых параметров
    - например, для метода заполнения массива дополнительным параметром будет число элементов в списке
    - для методов вставки - количество элементов для вставки
- в методе main создаем два списка:
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>(); 
  и последовательно передаем их в соответствующие методы для заполнения, перебора и т.п.
- реализовать замеры быстродействия и вывод необходимо прямо в методах, а на вход метода передавать параметр 
  String listType, который может принимать значения "ArrayList", "LinkedList". Например
    private static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        ...Some code...
        System.out.printf("Fill %s: %s%n", listType, System.currentTimeMillis() - time);
    }
 
- Пример вывода программы:
        Number of elements in list: xx
        Number of inserted items: xx
        Fill ArrayList: xx
        Fill LinkedList: xx
        Random access in ArrayList: xx
        Random access in LinkedList: xx
        Sequental access in ArrayList: xx
        Sequental access in LinkedList: xx
        ......
        Insert in the middle of ArrayList: xx
        Insert in the middle of LinkedList: xx
 
- количество элементов в обоих списках одинаково (рекомендуется 100000)
- количество элементов для вставки обоих списках одинаково (рекомендуется 1000)
- Программа оформляется как консольное приложение 
- код должен быть выложен в Git в feature branch и создан merge request в master branch
- Имя ветки "lab01"
- ссылку на merge request - мне.