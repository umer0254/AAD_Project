package pk.edu.szabist.aadproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import pk.edu.szabist.aadproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
            private lateinit var firebaseAuth: FirebaseAuth
                    override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth=FirebaseAuth.getInstance()
window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_VISIBLE //hiding status bar

        binding.signUp.setOnClickListener{
            val email=binding.email.text.toString()
            val pass=binding.password.text.toString()
            if(email.isNotEmpty() && pass.isNotEmpty()){
                firebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(){
                    if(it.isSuccessful){                                                            
                        Toast.makeText(this, "Sign Up Successful", Toast.LENGTH_SHORT).show()
                    } else{
                        Toast.makeText(this, "SignUp Not Successful", Toast.LENGTH_SHORT).show()                    }                                                       
                }
            }else{
                Toast.makeText(this, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()
            }
        }
        binding.login.setOnClickListener{
            val email=binding.email.text.toString()
            val pass=binding.password.text.toString()
            if(email.isNotEmpty() && pass.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(){
                    if(it.isSuccessful){
                        val intent= Intent(this,Categories::class.java)
                        startActivity(intent)
                        Toast.makeText(this, "Log In Successful", Toast.LENGTH_SHORT).show()
                    } else{
                        Toast.makeText(this, "Email or Password is Incorrect", Toast.LENGTH_SHORT).show()                    }
                }
            }else{
                Toast.makeText(this, "Both Fields Are Mandatory", Toast.LENGTH_SHORT).show()
            }

        }
    }
}