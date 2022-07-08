package `in`.planckstudio.bulksms

import `in`.planckstudio.bulksms.ui.screen.CampaignScreen
import `in`.planckstudio.bulksms.ui.screen.ContactsScreen
import `in`.planckstudio.bulksms.ui.screen.GroupScreen
import `in`.planckstudio.bulksms.ui.screen.SettingScreen
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomBar: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomBar = findViewById(R.id.mainBottomBar)

        bottomBar.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.pageHome -> {
                    true
                }
                R.id.pageCampaign -> {
                    startActivity(Intent(this, CampaignScreen::class.java))
                    true
                }
                R.id.pageSettings -> {
                    startActivity(Intent(this, SettingScreen::class.java))
                    true
                }
                R.id.pageGroup -> {
//                    startActivity(Intent(this, CoinActivity::class.java))
                    startActivity(Intent(this, GroupScreen::class.java))
                    true
                }
                R.id.pageContacts -> {
                    startActivity(Intent(this, ContactsScreen::class.java))
                    true
                }
                else -> {
                    false
                }
            }
        }
    }
}