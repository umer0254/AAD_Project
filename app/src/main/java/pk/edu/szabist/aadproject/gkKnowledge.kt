package pk.edu.szabist.aadproject

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import pk.edu.szabist.aadproject.databinding.ActivityGkKnowledgeBinding
import pk.edu.szabist.aadproject.databinding.ActivityMoviesBinding

class gkKnowledge : AppCompatActivity() {
    private var currentPosition:Int=1
    private var questionList:ArrayList<QuestionData>?=null
    private var selectedOption:Int =0
    private var score:Int=0
    private lateinit var binding : ActivityGkKnowledgeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGkKnowledgeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        questionList=setData.get_gk_Question()
        set_gk_question()
        binding.opt1.setOnClickListener{
            selectedOptionStyle(binding.opt1,1)
        }
        binding.opt2.setOnClickListener{
            selectedOptionStyle(binding.opt2,2)
        }
        binding.opt3.setOnClickListener{
            selectedOptionStyle(binding.opt3,3)
        }
        binding.opt4.setOnClickListener{
            selectedOptionStyle(binding.opt4,4)
        }
        binding.btnSubmit.setOnClickListener {
            if(selectedOption!=0){
                val question=questionList!![currentPosition-1]
                if(selectedOption!=question.correct_ans){
                    set_color(selectedOption,R.drawable.wrong_option)
                }else{
                    score++
                }
                set_color(question.correct_ans,R.drawable.correct_option)
                if(currentPosition==questionList!!.size){
                    binding.btnSubmit.text="Finish"
                } else{
                    binding.btnSubmit.text="Go To Next"
                }
            } else{
                currentPosition++
                when{ //if user proceeds to next question without selecting
                    currentPosition<=questionList!!.size->{
                        set_gk_question()
                    } else->{
                    val intent= Intent(this,Result::class.java)
                    intent.putExtra(setData.score,score.toString())
                    intent.putExtra("total size",questionList!!.size)
                    startActivity(intent)
                    finish()
                }
                }
            }
            selectedOption=0
        }

    }
    fun set_color (opt: Int,color:Int){
        when(opt){
            1->{
                binding.opt1.background= ContextCompat.getDrawable(this,color)
            }   2->{
            binding.opt2.background= ContextCompat.getDrawable(this,color)
        } 3->{binding.opt3.background= ContextCompat.getDrawable(this,color)}
            4->{binding.opt4.background= ContextCompat.getDrawable(this,color)}
        }

    }
    fun set_gk_question(){
        var que=questionList!![currentPosition-1]
        setOption_Style()
        binding.progressBar.progress=currentPosition
        binding.progressBar.max=questionList!!.size
        binding.progressText.text="${currentPosition}"+"/"+"${questionList!!.size}"
        binding.questionText.text=que.question
        binding.opt1.text=que.option_one
        binding.opt2.text=que.option_two
        binding.opt3.text=que.option_three
        binding.opt4.text=que.option_four }
    fun setOption_Style(){
        //for set options to default font settings
        var optionList:ArrayList<TextView> =arrayListOf()
        optionList.add(0,binding.opt1)
        optionList.add(1,binding.opt2)
        optionList.add(2,binding.opt3)
        optionList.add(3,binding.opt4)
        for(op in optionList){
            op.setTextColor(Color.parseColor("#555151"))
            op.background= ContextCompat.getDrawable(this,R.drawable.question_option)
            op.typeface= Typeface.DEFAULT
        }}
    fun selectedOptionStyle(view: TextView, opt:Int){
        setOption_Style()
        selectedOption=opt
        view.background= ContextCompat.getDrawable(this,R.drawable.selected_question_option)
        view.typeface= Typeface.DEFAULT_BOLD
        view.setTextColor(Color.parseColor("#000000"))
    }



}
