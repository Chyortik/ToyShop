1. Используйте команды операционной системы Linux и создайте две новых директории – «Игрушки для школьников» и «Игрушки для дошколят»

dima@dima-VirtualBox:~$ mkdir Игрушки_для_дошколят
dima@dima-VirtualBox:~$ mkdir Игрушки_для_Школьников

2. Создайте в директории «Игрушки для школьников» текстовые файлы - «Роботы», «Конструктор», «Настольные игры»


dima@dima-VirtualBox:~$ cd Игрушки_для_Школьников
dima@dima-VirtualBox:~/Игрушки_для_Школьников$ > Роботы
dima@dima-VirtualBox:~/Игрушки_для_Школьников$ > Конструктор
dima@dima-VirtualBox:~/Игрушки_для_Школьников$ > Настольные_Игры

3. Создайте в директории «Игрушки для дошколят» текстовые файлы «Мягкие игрушки», «Куклы», «Машинки»


dima@dima-VirtualBox:~/Игрушки_для_Школьников$ cd ..
dima@dima-VirtualBox:~$ cd Игрушки_для_дошколят
dima@dima-VirtualBox:~/Игрушки_для_дошколят$ > Мягкие_Игрушки
dima@dima-VirtualBox:~/Игрушки_для_дошколят$ > Куклы
dima@dima-VirtualBox:~/Игрушки_для_дошколят$ > Машинки

4. Объединить 2 директории в одну «Имя Игрушки»
* Здесь произведена установка пакета из задачи под номером 7

dima@dima-VirtualBox:~/Игрушки_для_дошколят$ cd
dima@dima-VirtualBox:~$ sudo snap install tree
[sudo] password for dima:
tree 1.8.0+pkg-3fd6 from 林博仁(Buo-ren, Lin) (brlin) installed
dima@dima-VirtualBox:~$ tree
dima@dima-VirtualBox:~$ mkdir Имя_Игрушки
dima@dima-VirtualBox:~$ mv Игрушки_для_Школьников/ Игрушки_для_дошколят/ Имя_Игрушки/
dima@dima-VirtualBox:~$ cd Имя_Игрушки
dima@dima-VirtualBox:~/Имя_Игрушки$ tree

5. Переименовать директорию «Имя Игрушки» в «Игрушки»

dima@dima-VirtualBox:~/Имя_Игрушки$ cd
dima@dima-VirtualBox:~$ mv Имя_Игрушки/ Игрушки
dima@dima-VirtualBox:~$ ls

6. Просмотреть содержимое каталога «Игрушки».

dima@dima-VirtualBox:~$ cd Игрушки
dima@dima-VirtualBox:~/Игрушки$ tree -g

7. Установить и удалить snap-пакет. (Любой, какой хотите)
* Установка пакета произведена в подзадаче 4
dima@dima-VirtualBox:~/Игрушки$ sudo snap remove tree
tree removed

8. Добавить произвольную задачу для выполнения каждые 3 минуты
(Например, запись в текстовый файл чего-то или копирование из каталога А в каталог Б).

dima@dima-VirtualBox:~/Игрушки$ sudo vi /usr/local/bin/script.sh
    #!/bin/bash
    echo $(date) >> /var/log/testcron.log
    :w!
    :q
dima@dima-VirtualBox:~/Игрушки$ sudo chmod ugo+x /usr/local/bin/script.sh
dima@dima-VirtualBox:~/Игрушки$ sudo crontab -e
    0/3 * * * * /usr/local/bin/script.sh
crontab: installing new crontab

