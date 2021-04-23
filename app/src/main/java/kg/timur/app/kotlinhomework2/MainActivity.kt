package kg.timur.app.kotlinhomework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.timur.app.kotlinhomework2.extensions.loadImage
import kg.timur.app.kotlinhomework2.extensions.showMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var imagesArray = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagesArray.add("https://images.wallpaperscraft.ru/image/avtomobili_stoianka_derevia_204131_1280x1024.jpg")
        imagesArray.add("https://images.wallpaperscraft.ru/image/mlechnyj_put_zvezdnoe_nebo_galaktika_119519_1280x1024.jpg")
        imagesArray.add("https://images.wallpaperscraft.ru/image/more_bereg_minimalizm_100029_1280x1024.jpg")
        imagesArray.add("https://images.wallpaperscraft.ru/image/bmw_k100_mototsikl_bajk_123991_1280x1024.jpg")
        imagesArray.add("https://images.wallpaperscraft.ru/image/sport_bavariya_myunkhen_fc_bayern_munchen_germaniya_klub_futbol_emblema_97196_1280x1024.jpg")


        btn_submit.setOnClickListener {
            if (!et_text?.text.toString().isNullOrBlank()) {
                imagesArray.add(et_text?.text.toString())
                showMessage(et_text?.text.toString())
            }
        }

        btn_random.setOnClickListener {
            if (!imagesArray.isNullOrEmpty()) {
                val url = imagesArray.random()
                iv_image.loadImage(this, url)
            }
        }
    }
}