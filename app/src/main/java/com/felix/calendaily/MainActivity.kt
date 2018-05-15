package com.felix.calendaily

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.felix.calendaily.data.models.Item
import com.felix.calendaily.util.Util
import com.felix.calendaily.widget.CalendarAdapter
import com.felix.materialcalendar.Util.CalendarDay
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendarView.setOnDateChangedListener {
            changeMonth(it!!)
        }

        calendarView.setOnMonthChangedListener {
            changeTitle(it!!)
        }

        val cal = Calendar.getInstance()
        cal.set(Calendar.DAY_OF_MONTH, 15)

        calendarView.addEvent(CalendarDay.from(cal))

        changeMonth(Date())
        changeTitle(Date())

        recycle.layoutManager = LinearLayoutManager(applicationContext)
        recycle.adapter = CalendarAdapter(applicationContext, createList())
    }

    private fun changeMonth(date: Date) {
        txtMonth.text = Util.getTitleDate(date)
    }

    private fun changeTitle(date: Date) {
        txtMonthTitle.text = Util.getMonthTitle(date)
        txtYearTitle.text = Util.getYearTitle(date)
    }

    private fun createList(): List<Item> {
        val list = mutableListOf<Item>()
        list.add(Item("10:00 PM", "Lorem ipsum dolor sit amet"))
        list.add(Item("09:00 PM", "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas."))
        list.add(Item("03:00 PM", "Praesent rutrum nulla non mauris ultrices vulputate."))
        list.add(Item("12:00 AM", "Nunc placerat lorem vitae tincidunt tincidunt. Quisque faucibus dui luctus dignissim egestas."))
        list.add(Item("06:00 AM", "Donec varius dui ac posuere efficitur. Ut dictum, erat eget pretium semper, augue leo fringilla nisi, eu ornare purus nunc fermentum enim. Vivamus et vehicula enim. Pellentesque nec commodo justo, molestie placerat quam. Nullam feugiat mollis laoreet. Vivamus scelerisque venenatis magna, sit amet cursus dui fermentum eget."))
        return list
    }
}
