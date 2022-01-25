# DataParsingProject
> Парсинг данных в виде XML с сайта ЦБ, при помощи RestTemplate

Пример: курс на 23/01/2022
---
Запрос на получение курса валют: 

GET: `/getCourse`

OUT:
```text
[
  Австралийский доллар (numCode = 036, charCode = AUD, nominal = 1, value = 55.1633),
  Азербайджанский манат (numCode = 944, charCode = AZN, nominal = 1, value = 45.1385),
  Фунт стерлингов Соединенного королевства (numCode = 826, charCode = GBP, nominal = 1, value = 103.9997),
  Армянских драмов (numCode = 051, charCode = AMD, nominal = 100, value = 15.9539),
  Белорусский рубль (numCode = 933, charCode = BYN, nominal = 1, value = 29.8058),
  Болгарский лев (numCode = 975, charCode = BGN, nominal = 1, value = 44.4607),
  Бразильский реал (numCode = 986, charCode = BRL, nominal = 1, value = 14.1505),
  Венгерских форинтов (numCode = 348, charCode = HUF, nominal = 100, value = 24.35),
  Гонконгских долларов (numCode = 344, charCode = HKD, nominal = 10, value = 98.4699),
  Датская крона (numCode = 208, charCode = DKK, nominal = 1, value = 11.6842),
  Доллар США (numCode = 840, charCode = USD, nominal = 1, value = 76.6903),
  Евро (numCode = 978, charCode = EUR, nominal = 1, value = 86.9054),
  Индийских рупий (numCode = 356, charCode = INR, nominal = 10, value = 10.2985),
  Казахстанских тенге (numCode = 398, charCode = KZT, nominal = 100, value = 17.5815),
  Канадский доллар (numCode = 124, charCode = CAD, nominal = 1, value = 61.2102),
  Киргизских сомов (numCode = 417, charCode = KGS, nominal = 100, value = 90.427),
  Китайский юань (numCode = 156, charCode = CNY, nominal = 1, value = 12.0972),
  Молдавских леев (numCode = 498, charCode = MDL, nominal = 10, value = 42.4055),
  Норвежских крон (numCode = 578, charCode = NOK, nominal = 10, value = 86.796),
  Польский злотый (numCode = 985, charCode = PLN, nominal = 1, value = 19.2264),
  Румынский лей (numCode = 946, charCode = RON, nominal = 1, value = 17.5847),
  СДР (специальные права заимствования) (numCode = 960, charCode = XDR, nominal = 1, value = 107.5497),
  Сингапурский доллар (numCode = 702, charCode = SGD, nominal = 1, value = 56.9722),
  Таджикских сомони (numCode = 972, charCode = TJS, nominal = 10, value = 67.8976),
  Турецких лир (numCode = 949, charCode = TRY, nominal = 10, value = 57.1544),
  Новый туркменский манат (numCode = 934, charCode = TMT, nominal = 1, value = 21.9429),
  Узбекских сумов (numCode = 860, charCode = UZS, nominal = 10000, value = 70.7797),
  Украинских гривен (numCode = 980, charCode = UAH, nominal = 10, value = 27.0692),
  Чешских крон (numCode = 203, charCode = CZK, nominal = 10, value = 35.819),
  Шведских крон (numCode = 752, charCode = SEK, nominal = 10, value = 83.537),
  Швейцарский франк (numCode = 756, charCode = CHF, nominal = 1, value = 83.8787),
  Южноафриканских рэндов (numCode = 710, charCode = ZAR, nominal = 10, value = 50.6156),
  Вон Республики Корея (numCode = 410, charCode = KRW, nominal = 1000, value = 64.3418),
  Японских иен (numCode = 392, charCode = JPY, nominal = 100, value = 67.3165)
]
```
---

> Мой Телеграм - https://t.me/l_i_m_k_o_r_n
