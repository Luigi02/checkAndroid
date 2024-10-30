package br.com.rm95618.LuigiGalati.checkandroid

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserDetailsActivity : AppCompatActivity()  {

    private lateinit var imageViewAvatar: ImageView
    private lateinit var textViewName: TextView
    private lateinit var textViewFollowers: TextView
    private lateinit var textViewPublicRepos: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details)

        imageViewAvatar = findViewById(R.id.imageViewAvatar)
        textViewName = findViewById(R.id.textViewName)
        textViewFollowers = findViewById(R.id.textViewFollowers)
        textViewPublicRepos = findViewById(R.id.textViewPublicRepos)

        val username = intent.getStringExtra("username") ?: return

        // Chamar a API do GitHub para obter os detalhes do usuário
        fetchUserDetails(username)
    }

    private fun fetchUserDetails(username: String) {
        // Implementar Retrofit para obter dados do usuário e exibir
    }
}