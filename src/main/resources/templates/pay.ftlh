<!DOCTYPE html>
<head>
    <title>Pay Service</title>
</head>
<body>
 <h1>Pay Service</h1><hr>
<h4>Подсчёт отпускных выплат</h4>
<#list pays as pay>
    <div>
        <p><b></b>${pay.userName}</b>${pay.vacationStart} ${pay.vacationEnd} ${pay.salary}</p>
    </div>
</#list>
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