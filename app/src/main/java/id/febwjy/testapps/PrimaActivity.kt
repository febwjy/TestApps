package id.febwjy.testapps

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.febwjy.testapps.databinding.ActivityPrimaBinding
import kotlin.math.sqrt

/**
 * Created by Febby Wijaya on 25/01/2024.

 */
class PrimaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPrimaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrimaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnGenerate.setOnClickListener {

            val prime = binding.etPrima.text.toString()

            if (isPrimeNumber(Integer.parseInt(prime))) {
                Toast.makeText(this, "Angka tersebut adalah bilangan prima", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Angka tersebut bukan bilangan prima", Toast.LENGTH_SHORT).show()
            }

        }
    }

    private fun isPrimeNumber(primeNumber: Int):Boolean {
        if (primeNumber <= 1)
            return false

        for (i in 2..sqrt(primeNumber.toDouble()).toInt())
            if (primeNumber % i== 0) return false

        return true
    }

}