package ir.rahmatabad.shahid3768

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LifeRezaeiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_rezaei)
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

        title = "زندگی نامه شهید"
    }
}