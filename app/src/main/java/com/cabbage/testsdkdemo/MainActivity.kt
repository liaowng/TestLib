package com.cabbage.testsdkdemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cabbage.testlib.Constants
import com.cabbage.testlib.TestThing1
import com.cabbage.testlib.TestThing3
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_test_lib_1.text = getString(R.string.lib_content_1)
        tv_test_lib_2.text = getString(R.string.lib_content_2)
        // Resource from inner lib
        tv_inner_lib_1.text = getString(R.string.inner_content_1)
        tv_inner_lib_2.text = getString(R.string.inner_content_2)

        tv_test_lib_type.text = "Test lib type: ${Constants.typeName}"


        TestThing1("abc")

        // Won't work as InnerThing is not exposed
//        TestThing2(InnerThing("abc"))

        TestThing3("abc")
    }
}
