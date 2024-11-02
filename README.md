
<h1>Test automation project for a detailed page for the site <a href="https://kinoman.uz">kinoman.uz</a></h1>

<img title="Allure Overview Dashboard" src="images/logo.png" width="850">  

## ☑️ Content:

-  Technologies and tools
-  List of checks implemented in tests
-  Running tests (build in Jenkins) and from the terminal
-  Allure report
-  Notification in Telegram about test run results
-  Video example of passing tests

<a id="tools"></a>
## :ballot_box_with_check: Technologies and tools
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50" /></a>
<a href="https://github.com/allure-framework"><img src="images/Allure.svg" width="50" height="50" /></a>
<a href="https://www.jenkins.io"><img src="images/Jenkins.svg" width="50" height="50" /></a>
<a href="https://selenide.org"><img src="images/Selenide.svg" width="50" height="50" /></a>
<a href="https://web.telegram.org"><img src="images/Telegram.svg" width="50" height="50" /></a>
<a href="https://junit.org/junit5/"><img src="images/Junit5.svg" width="50" height="50" /></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50" /></a>

<a id="cases"></a>

## :ballot_box_with_check: Implemented checks:

- Availability of the Movie Title field on the detail page
- Presence of the Film Year field on the detail page
- Presence of the Film Director field on the detail page
- Presence of the Movie Description field on the detail page
- Presence of the Film Countries field on the detail page

## <img alt="Jenkins" height="25" src="images/Jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/automation-testdetailpagekinomanuz-chen/)

<p align="center">  
<img title="Allure Overview Dashboard" src="images/jenkinsdesctop.png" width="850">  
</p>  
:ballot_box_with_check: Jenkins build options:

- authorization data in wb selenoid.autotests.cloud
- test launch type

## Command to run from terminal

Remote launch using Jenkins+Selinoid (login and password required):
```bash  
gradle clean demoqa_test -Dcredential=user1:1234
```

## <img alt="Allure" height="25" src="images/Allure.svg" width="25"/></a>  <a name="Allure"></a>Allure Report	</a>

## Main report page

<p align="center">  
<img title="Allure Overview Dashboard" src="images/al2.png" width="850">  
</p>  

## Тест-кейсы

<p align="center">  
<img title="Allure Tests" src="images/al1.png" width="850">
</p>

____
## <img alt="Allure" height="25" src="images/Telegram.svg" width="25"/></a> Notification in Telegram using a bot
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/tg.png" width="550">  
</p>

____
## <img alt="Selenoid" height="25" src="images/Selenoid.svg" width="25"/></a> Examples of videos of performing tests on Selenoid
____
<p align="center">
<img title="Selenoid Video" src="images/video1.gif" width="550" height="350"  alt="video">   
</p>

