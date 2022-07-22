package ir.rahmatabad.shahid3768

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class BarotkobianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barotkobian)
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

        title = "شهید باروتکوبیان"
        val btnLifeStyle1: Button =findViewById(R.id.btn_life_sha1)
        val btnRecomend1: Button = findViewById(R.id.btn_recomend_sha1)

        btnLifeStyle1.setOnClickListener {
            val intent = Intent(this,LifeBarokobiyanActivity::class.java )
            startActivity(intent)
        }

        btnRecomend1.setOnClickListener {
            val intent2 = Intent(this, VasiatActivitySh1::class.java)
            startActivity(intent2)
        }
    }
}