/**
 * 创建一个最基本的activity的kotlin 模式
 */


import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.test.cn.R
import kotlinx.android.synthetic.main.activity_main.*

class BaseKotlinActivity:Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 通过kotlin的方式进行数值的设置
        show_txt.text = "" ;
        show_txt.textSize = 21f ;
        // 设置背景颜色
        show_txt.setBackgroundColor(getColor(R.color.colorPrimary));

        // 创建一个textView
        var testView = TextView(this);

        testView.setText("");


    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStart() {
        super.onStart()
    }
    override fun onDestroy() {
        super.onDestroy()
    }


}