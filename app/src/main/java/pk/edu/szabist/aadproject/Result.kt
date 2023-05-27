package pk.edu.szabist.aadproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pk.edu.szabist.aadproject.databinding.ActivityQuestionsBinding
import pk.edu.szabist.aadproject.databinding.ActivityResultBinding

class Result : AppCompatActivity() {
    private lateinit var binding : ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_VISIBLE
        val score=intent.getStringExtra(setData.score)
        val totalques:String="5"
        binding.Score.text="${score}/ ${totalques}"
binding.button.setOnClickListener{
    startActivity(Intent(this,Categories::class.java))
    finish()
}
    }
}