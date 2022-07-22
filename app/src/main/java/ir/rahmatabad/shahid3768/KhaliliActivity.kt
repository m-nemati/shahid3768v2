package ir.rahmatabad.shahid3768

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class KhaliliActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_khalili)
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

        title = "شهید خلیلی"
        val btnLifeStyle5: Button =findViewById(R.id.btn_life_sha5)
        val btnRecomend5: Button = findViewById(R.id.btn_recomend_sha5)

        btnLifeStyle5.setOnClickListener {
            val intent = Intent(this,LifeKhaliliActivity::class.java )
            startActivity(intent)
        }

        btnRecomend5.setOnClickListener {
            val intent2 = Intent(this, VasiatActivitySh5::class.java)
            startActivity(intent2)
        }
    }
}