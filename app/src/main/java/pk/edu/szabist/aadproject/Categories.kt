package pk.edu.szabist.aadproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import pk.edu.szabist.aadproject.databinding.ActivityCategoriesBinding
import pk.edu.szabist.aadproject.databinding.ActivityQuestionsBinding

class Categories : AppCompatActivity() {
    private lateinit var la: ConstraintLayout
    private lateinit var binding : ActivityCategoriesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCategoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        la=findViewById(R.id.la)
        la.animate().alpha(1f).translationX(0f).setDuration(2000)
        binding.maths.setOnClickListener{
            val intent= Intent(this,Questions::class.java)
            startActivity(intent)
        }
        binding.books.setOnClickListener{
            val intent= Intent(this,books::class.java)
            startActivity(intent)
        }
        binding.movies.setOnClickListener{
            val intent= Intent(this,movies::class.java)
            startActivity(intent)
        }
        binding.gkKnowledge.setOnClickListener{
            val intent= Intent(this,gkKnowledge::class.java)
            startActivity(intent)
        }
    }
}