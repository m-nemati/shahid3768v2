package ir.rahmatabad.shahid3768

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SadeghpourActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sadeghpour)
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

        title = "شهید صادقپور"
        val btnLifeStyle2: Button =findViewById(R.id.btn_life_sha2)

        btnLifeStyle2.setOnClickListener {
            val intent = Intent(this,LifeSadeghpourActivity::class.java )
            startActivity(intent)
        }
    }
}