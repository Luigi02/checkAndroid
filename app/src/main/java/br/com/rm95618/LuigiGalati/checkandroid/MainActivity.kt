package br.com.rm95618.LuigiGalati.checkandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var buttonUserDetails: Button
    private lateinit var buttonUserRepos: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextUsername = findViewById(R.id.editTextUsername)
        buttonUserDetails = findViewById(R.id.buttonUserDetails)
        buttonUserRepos = findViewById(R.id.buttonUserRepos)

        buttonUserDetails.setOnClickListener {
            val username = editTextUsername.text.toString()
            // Navegar para a tela de detalhes do usuário
        }

        buttonUserRepos.setOnClickListener {
            val username = editTextUsername.text.toString()
            // Navegar para a tela de repositórios do usuário
        }
    }
}
