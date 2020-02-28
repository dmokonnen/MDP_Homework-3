package edu.miu.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TableRow
import android.widget.TextView
import androidx.core.view.setPadding
import androidx.core.view.size
import edu.miu.homework4.R.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
    }

    fun addToTable(view: View) {
        val i=tableLayout.size
        val row=TableRow(this)
        row.setPadding(resources.getDimension(R.dimen.row_Padding).toInt())
        val tv1=TextView(this)
        tv1.setBackgroundColor(resources.getColor(color.tableBackground))
        tv1.text=etV.text.toString()
        val tv2=TextView(this)
        tv2.setBackgroundColor(resources.getColor(color.tableBackground))
        tv2.text=etCN.text.toString()
        row.addView(tv1)
        row.addView(tv2)
        tableLayout.addView(row,i)
    }
}
