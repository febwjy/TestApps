package id.febwjy.testapps

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.febwjy.testapps.databinding.ActivityMainBinding

/**
 * Created by Febby Wijaya on 25/01/2024.
 */
class MainActivity  : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnStarted.setOnClickListener {
            intent = Intent(this, PrimaActivity::class.java)
            startActivity(intent)
        }

    }
}
