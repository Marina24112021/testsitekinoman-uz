

<h1>Проект по автоматизации тестирования для подробной страницы для сайта <a href="https://kinoman.uz">kinoman.uz</a></h1>

## ☑️ Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins) и из терминала
- Allure-отчет
- Уведомление в Telegram о результатах прогона тестов
- Видео пример прохождения тестов

<a id="tools"></a>
## :ballot_box_with_check: Технологии и инструменты:
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50" /></a>
<a href="https://github.com/allure-framework"><img src="images/Allure.svg" width="50" height="50" /></a>
<a href="https://www.jenkins.io"><img src="images/Jenkins.svg" width="50" height="50" /></a>
<a href="https://selenide.org"><img src="images/Selenide.svg" width="50" height="50" /></a>
<a id="cases"></a>

## :ballot_box_with_check: Реализованные проверки:

- Наличие поля Наименования фильма на подробной страницы
- Наличие поля Года фильма на подробной страницы
- Наличие поля Режиссера фильма на подробной страницы
- Наличие поля Описания фильма на подробной страницы
- Наличие поля Страны фильма на подробной страницы

## <img alt="Jenkins" height="25" src="images/Jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/automation-testdetailpagekinomanuz-chen/)

<p align="center">  
<img title="Allure Overview Dashboard" src="images/jenkinsdesctop.png" width="850">  
</p>  
## :ballot_box_with_check: Параметры сборки в Jenkins:

- данные авторизации в wb selenoid.autotests.cloud
- тип запуска тестов 

## Команда для запуска из терминала

Удаленный запуск с использованием Jenkins+Selinoid(требуется логин и пароль):
```bash  
gradle clean demoqa_test -Dcredential=user1:1234
```

## <img alt="Allure" height="25" src="images/Allure.svg" width="25"/></a>  <a name="Allure"></a>Allure Report	</a>

## Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="images/al2.png" width="850">  
</p>  

## Тест-кейсы

<p align="center">  
<img title="Allure Tests" src="images/al1.png" width="850">
</p>

____
## <img alt="Allure" height="25" src="images/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/tg.png" width="550">  
</p>

____
## <img alt="Selenoid" height="25" src="images/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="images/video1.gif" width="550" height="350"  alt="video">   
</p>

