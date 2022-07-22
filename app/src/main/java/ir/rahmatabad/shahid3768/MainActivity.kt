package ir.rahmatabad.shahid3768

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var media1: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);


        // Play Background Sound
        media1 = MediaPlayer.create(this, R.raw.hadadian)
        media1.start()

        // *********** Define Widgets *************
        val btnShahid1: Button = findViewById(R.id.btn_sh1)
        val btnShahid2: Button = findViewById(R.id.btn_sh2)
        val btnShahid3: Button = findViewById(R.id.btn_sh3)
        val btnShahid4: Button = findViewById(R.id.btn_sh4)
        val btnShahid5: Button = findViewById(R.id.btn_sh5)
        val btnShahid6: Button = findViewById(R.id.btn_sh6)

        // ******** SetOnClick Listener Methods ************
        btnShahid1.setOnClickListener {
            val intent = Intent(this,BarotkobianActivity::class.java )
            startActivity(intent)
        }
        btnShahid2.setOnClickListener {
            val intent = Intent(this,SadeghpourActivity::class.java )
            startActivity(intent)
        }
        btnShahid3.setOnClickListener {
            val intent = Intent(this,TeymoriActivity::class.java )
            startActivity(intent)
        }
        btnShahid4.setOnClickListener {
            val intent = Intent(this,GolabiActivity::class.java )
            startActivity(intent)
        }
        btnShahid5.setOnClickListener {
            val intent = Intent(this,KhaliliActivity::class.java )
            startActivity(intent)
        }
        btnShahid6.setOnClickListener {
            val intent = Intent(this,RezaeiActivity::class.java )
            startActivity(intent)
        }

    }  // ********  end of onCreate Method *********

    override fun onStop() {
        //media1.stop()
        super.onStop()
    } // ********  end of onStop Method *********

    override fun onPause() {
        media1.pause()
        super.onPause()
    }
    override fun onResume() {
        media1.start()
        super.onResume()
    }

    // ********  Create Option menu *********
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true

    }

    // ********  Handel menu events *********
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        // Handle item selection
        return when (item.itemId) {
            R.id.about_me -> {
                aboutMe()
                true
            }
            R.id.exit_app -> {
                showExitDialog();
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    // ********  About me *********
    private fun aboutMe(){
        val intent = Intent(this,AboutmeActivity::class.java )
        startActivity(intent)
    }

    // ********  Alert dialog for exit application *********
    private fun showExitDialog() {
        AlertDialog.Builder(this).setMessage("تأئید خروج از برنامه؟")
            .setPositiveButton("بلی",
                DialogInterface.OnClickListener { paramAnonymousDialogInterface, paramAnonymousInt ->
                    System.exit(
                        0
                    )
                })
            .setNegativeButton("خیر",
                DialogInterface.OnClickListener { paramAnonymousDialogInterface, paramAnonymousInt -> })
            .show()
    }

} // ********  end of Class MainActivity *********