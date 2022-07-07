package ir.rahmatabad.shahid3768

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class GolabiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_golabi)
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

        title = "شهید گلابی"
        val btnLifeStyle4: Button =findViewById(R.id.btn_life_sha4)

        btnLifeStyle4.setOnClickListener {
            val intent = Intent(this,LifeGolabiActivity::class.java )
            startActivity(intent)
        }
    }
}