package kr.co.soptfirstsemina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kr.co.soptfirstsemina.databinding.ActivityMain2Binding
import kr.co.soptfirstsemina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    initButtonClickEvent()


    }
    private fun initButtonClickEvent(){
        binding.loginbtn.setOnClickListener{
            val userID:String = binding.loginid.text.toString();//값받아와서 유저아이디로 저장하기면
            //클릭시에 값을 받아온
            if(userID.isNullOrBlank()){ //유저 아이디 값이 널값이라다
                Toast.makeText(this@MainActivity,"ID를 입력해주세요",Toast.LENGTH_SHORT).show()

            }else {
                Toast.makeText(this@MainActivity, "안녕하세요", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity,MainActivity2::class.java)
                startActivity(intent)
            }
            //show까지해야 사용자에게 보여질 수 있다. 안녕하세요가 찍힌다. binding class쓰기
       }
    }


}