package ir.rahmatabad.shahid3768

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TeymoriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teymori)
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

        title = "شهید تیموری"
        val btnLifeStyle3: Button =findViewById(R.id.btn_life_sha3)
        val btnRecomend3: Button = findViewById(R.id.btn_recomend_sha3)

        btnLifeStyle3.setOnClickListener {
            val intent = Intent(this,LifeTeymoriActivity::class.java )
            startActivity(intent)
        }

        btnRecomend3.setOnClickListener {
            val intent2 = Intent(this, VasiatActivitySh3::class.java)
            startActivity(intent2)
        }
    }
}