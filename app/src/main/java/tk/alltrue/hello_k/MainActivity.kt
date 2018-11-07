package tk.alltrue.hello_k

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var mHelloKittyTextView: TextView;
    private lateinit var mNameEditText: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mHelloKittyTextView = findViewById(R.id.textView)
        mNameEditText = findViewById(R.id.editText2)
    }

    fun onClick(view: View) {
        if (mNameEditText.length() == 0) {
            mHelloKittyTextView.setText("Hello Kitty!")
        } else {
            mHelloKittyTextView.setText("Hi, " + mNameEditText.text)
        }
    }
}
