Дерево бинарного поиска (наивная реализация, без балансировки)

1. Написать класс (BSTNode) для хранения дерева бинарного поиска с целыми ключами и строковыми значениями. 
	Он должен содержать следующие методы: 
	- вставка (ключ, значение). Если такой ключ уже есть - значение перезаписывется
	- удаление по ключу
	- поиск по ключу
	- обход дерева от корня

2. Написать тестовый код для этого класса (в java лучше использовать jUnit и юнит тесты), 
   который проверяет корректность выполнения основных операций.

Тесткейсы:
	1. Создать Map из 20 элементов для хранения тестовых данных ключами служат 
		целые цифры от вашего номера в списке группы N до N+20, 
		структура должна быть НЕ ОТСОРТИРОВАНА по ключам. То есть вставляться данные должны в случайном порядке.
	2. Из данных в структуре создать дерево BSTNode, обойти дерево и проверить, что количество узлов равно 20
	3. Создать дерево из п. 1., 
		- найти несколько существующих элементов по ключам, вывести их значения.
		- попытаться найти несуществующий элемент, убедиться, что структура возвращает Null.
	4. Создать дерево из п. 1., предварительно выбросив из него один из ключей в середине. 
		То есть в полученном дереве должен отсутствовать один элемент по сравнению с Map, лучше, 
		если это значение из середины диапазона. 
		- Вставить новый элемент с данным пропущеным ключом.
		- провести поиск по этому ключу, убедиться, что элемент присутствует в дереве
		- Вставить элемент с уже существующим ключом, но другим значением строки
		- провести обход дерева, проверить, что количество узлов равно 20
		- провести поиск по этому ключу и убедиться, что значение обновилось
	5. Создать дерево из п. 1.
		- Удалить элемент с ключом из середины списка.
		- провести обход дерева, проверить, что количество узлов равно 19
		- провести поиск по этому ключу, убедиться, что элемент отсутствует, и метод возвращает null

Все проверки значений делать с помощью Assert
		