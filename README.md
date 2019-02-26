# Class Hierarchy
Реалізувати із застосування узагальненого програмування  ієрархію Java-класів для транспортних засобів, які можуть перевозити різні
  типи пасажирів.  Є наступні транспортні засоби:
 1. автобус, 2. таксі, 3. пожежна машина,  4. міліцейська машина.
  У цих транспортних засобах можуть їздити наступні  види пасажирів:
 1. звичайний пасажир, 2. пожежник, 3. міліціонер.
  Автобус та таксі можуть перевозити будь-яких пасажирів, пожежна машина – тільки пожежників, міліцейська машина – тільки міліціонерів.
  Реалізувати на основі узагальненого програмування (generics) вказані обмеження щодо перевозки пасажирів.
  Для класів транспортних засобів реалізувати наступні функції:
  - Кожний транспортний засіб має обмежену кількість місць. Реалізувати функцію для отримання максимальної кількість місць
  та функцію для отримання кількості зайнятих місць.
  - Посадка пасажира у транспортний засіб. Якщо всі місця вже зайнято, функція повинна ініціювати виключну ситуацію.
  - Висадка пасажира із транспортного засобу. Функція повинна  ініціювати виключну ситуацію, якщо вказаний пасажир «не
  сидить» у транспортному засобі.
  Реалізувати модульні тести з наповнення транспортних засобів різними типами пасажирів
