package ir.rahmatabad.shahid3768

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class VasiatActivitySh1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vasiat_sh1)
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
    }
}