# North Rock Mobile
![North rock - новое слово в жанре рока](/images/longLogoNorthROck.png)

# Описание
![Главный экран](/images/main_pg.png)

North Rock Mobile - *когда надоело искать информацию о концерте в интеренете.*

Мобильное приложение: 
  - просмотр расписания концерта в любой день;
  - предварительный заказа билета;
  - не требует постоянного поиска.

**Приложение реализовано на ООП язке программирования [Kotlin](https://kotlinlang.org/). Проект разрабатывался в IDE [Android Studio](https://developer.android.com/studio).**

*Пример кода бэкэнда главно страницы, реализованного на kotlin'e:*
```
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    fun init()
    {
        var day1 = findViewById<TextView>(R.id.day_one)
        var day2 = findViewById<TextView>(R.id.day_two)
        var btnBuy = findViewById<Button>(R.id.btn_buyTicket)

        day1.setTextColor(this@MainActivity.getColor(R.color.white))
        day2.setTextColor(this@MainActivity.getColor(R.color.white))

        day1.setOnClickListener()
        {
            startActivity(Intent(this, FirstDay::class.java))
        }
        day2.setOnClickListener()
        {
            startActivity(Intent(this, SecondDay::class.java))
        }
        btnBuy.setOnClickListener()
        {
            startActivity(Intent(this, OrderTicket::class.java))
        }

    }
}
```

# Как использовать
## Посмотрите расписание концерта в один из дней
- Всегда доступное меню с выбором дня концерта:

![Меню с днями](/images/day_menu.png)

- После выбора одного из дней показывается расписание выступлений на этот день:

![Раписание на 1 день](/images/headline.png)

## Заказать билет
- Заказать билет можно на главной странице. Для этого только нужно нажать кнопку "Купить билет";
  - Главная страница открывается при запуске приложения или можно перейти на нее из нижнего меню;

![Нижнее меню](/images/futter.png)

- Для покупки билета нужно ввести контактные данные и выбрать день выступлений (можно заказать несколько билеьтов)

![Заказать билет](/images/buy_ticket.png)

## Авторы

* **CryDeveloper** - [CryDeveloper](https://github.com/CryDeveloper)
