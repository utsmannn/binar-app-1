package com.utsman.binarapp1

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.utsman.binarapp1.databinding.ActivityDialogBinding
import com.utsman.binarapp1.databinding.DialogCustomDialogBinding
import com.utsman.binarapp1.fragment.CustomDialogFragment

class DialogActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // dialog builder standar
        val dialogBuilderStandar = AlertDialog.Builder(this)
        dialogBuilderStandar.setTitle("dialog standar")
        dialogBuilderStandar.setMessage("ini dialog standar ya")

        // ini dialog standar
        val dialogStandar = dialogBuilderStandar.create()

        // dialog builder standar with action
        val dialogBuilderStandarAction = AlertDialog.Builder(this)
        dialogBuilderStandarAction.setTitle("dialog standar")
        dialogBuilderStandarAction.setMessage("ini dialog standar ya")
        dialogBuilderStandarAction.setCancelable(false)
        dialogBuilderStandarAction.setPositiveButton("ok") { _, _ ->
            Toast.makeText(this, "ok click", Toast.LENGTH_SHORT).show()
        }
        dialogBuilderStandarAction.setNegativeButton("Cancel") { dialogInterface, _ ->
            Toast.makeText(this, "cancel click", Toast.LENGTH_SHORT).show()
            dialogInterface.dismiss()
        }
        dialogBuilderStandarAction.setNeutralButton("netral") { _, _ ->

        }

        // ini dialog standar with action
        val dialogStandarAction = dialogBuilderStandarAction.create()

        // ini dialog custom builder

        val dialogView = LayoutInflater.from(this)
            .inflate(R.layout.dialog_custom_dialog, null, false)

        val dialogViewBinding = DialogCustomDialogBinding.bind(dialogView)
        val dialogCustomLayoutBuilder = AlertDialog.Builder(this)
            .setView(dialogViewBinding.root)

        val dialogCustomLayout = dialogCustomLayoutBuilder.create()

        dialogViewBinding.dialogText.text = "ini text dialog custom"
        dialogViewBinding.btnPositive.setOnClickListener {
            Toast.makeText(this, "ini positive button", Toast.LENGTH_SHORT).show()
            dialogCustomLayout.dismiss()
        }

        val customDialogFragment = CustomDialogFragment()
        customDialogFragment.isCancelable = false

        binding.apply {
            btnDialogStandar.setOnClickListener {
                dialogStandar.show()
            }

            btnDialogAction.setOnClickListener {
                dialogStandarAction.show()
            }

            btnDialogCustome.setOnClickListener {
                dialogCustomLayout.show()
            }

            btnDialogFragment.setOnClickListener {
                customDialogFragment.show(supportFragmentManager, null)
            }
        }

    }
}