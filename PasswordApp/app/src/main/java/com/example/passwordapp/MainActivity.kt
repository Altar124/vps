package com.example.passwordapp

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.passwordapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        promptForPassword()
    }

    private fun promptForPassword() {
        val inputLayout = layoutInflater.inflate(R.layout.dialog_password, null)
        val editText = inputLayout.findViewById<android.widget.EditText>(R.id.passwordEditText)

        val dialog = AlertDialog.Builder(this)
            .setTitle(getString(R.string.enter_password))
            .setView(inputLayout)
            .setCancelable(false)
            .setPositiveButton(R.string.ok, null)
            .setNegativeButton(R.string.exit) { _: DialogInterface, _: Int ->
                finish()
            }
            .create()

        dialog.setOnShowListener {
            val button = dialog.getButton(AlertDialog.BUTTON_POSITIVE)
            button.setOnClickListener {
                val entered = editText.text?.toString() ?: ""
                val expected = getString(R.string.app_password)
                if (entered == expected) {
                    Toast.makeText(this, R.string.access_granted, Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                } else {
                    editText.error = getString(R.string.incorrect_password)
                }
            }
        }

        dialog.show()
    }
}

