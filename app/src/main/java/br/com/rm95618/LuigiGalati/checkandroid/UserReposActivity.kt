package br.com.rm95618.LuigiGalati.checkandroid

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class UserReposActivity : AppCompatActivity() {

    private lateinit var listViewRepos: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_repos)

        listViewRepos = findViewById(R.id.listViewRepos)

        val username = intent.getStringExtra("username") ?: return

        // Chamar a API do GitHub para obter repositórios do usuário
        fetchUserRepos(username)
    }

    private fun fetchUserRepos(username: String) {
        // Implementar Retrofit para obter repositórios e exibir em ListView
    }
}
