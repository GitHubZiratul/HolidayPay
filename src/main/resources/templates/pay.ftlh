<!DOCTYPE html>

<head>
    <title>Pay Service</title>
</head>
<body>
 <h1>Pay Service</h1><hr>
<h4>Подсчёт отпускных выплат</h4>
 <table border="1">
     <tr class="tableHeader">
         <td>Имя работника</td>
         <td>Начало отпуска</td>
         <td>Конец отпуска</td>
         <td>Зарплата работника</td>
         <td>Отпускные работника</td>
     </tr>

<#foreach pay in pays>

        <tr class="tableBody">

             <td>${pay.userName}</td>
            <td>${pay.vacationStart}</td>
            <td>${pay.vacationEnd}</td>
            <td>${pay.salary}</td>
            <td>${pay.pay}</td>
        </tr>

</#foreach>
 </table>
<hr>
<h3>Подсчитать отпускные </h3>
<form action="/pay/create" method="post">
    Имя работника : <input type="text" name="userName">
    Дата начала отпуска : <input type="date" name="vacationStart">
    Дата конца отпуска : <input type="date" name="vacationEnd">
    Зарплата : <input type="number" name="salary">
    <input type="submit" value="Подсчитать отпускные">
</form>
</body>