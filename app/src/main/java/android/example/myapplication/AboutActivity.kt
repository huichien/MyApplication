package android.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val name =intent.getStringExtra("StudentName")

        val tv =findViewById<TextView>(R.id.tvResult)
        tv.text=name
        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar!!.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}