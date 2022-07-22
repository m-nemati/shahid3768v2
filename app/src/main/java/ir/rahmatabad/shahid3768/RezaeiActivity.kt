package ir.rahmatabad.shahid3768

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RezaeiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rezaei)
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

        title = "شهید رضایی"
        val btnLifeStyle6: Button =findViewById(R.id.btn_life_sha6)
        val btnRecomend6: Button = findViewById(R.id.btn_recomend_sha6)

        btnLifeStyle6.setOnClickListener {
            val intent = Intent(this,LifeRezaeiActivity::class.java )
            startActivity(intent)
        }

        btnRecomend6.setOnClickListener {
            val intent2 = Intent(this, VasiatActivitySh6::class.java)
            startActivity(intent2)
        }
    }
}