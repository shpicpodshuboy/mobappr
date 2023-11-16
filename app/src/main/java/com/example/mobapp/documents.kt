package com.example.mobapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class documents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_documents)
        val documents = listOf(
            Document("1", "Справка 1", "Содержимое 1", "Ожидает", "1"),
            Document("2", "Отчёт 2", "Содержимое 2", "Подписан", "2"),
            Document("3", "Данные 3", "Содержимое 3", "Не подписан", "3")
        )
        val documentListTextView = findViewById<TextView>(R.id.documentListTextView)
        val stringBuilder = StringBuilder()
        for (document in documents) {
            stringBuilder.append("Название документа: ${document.document_name}\n")
            stringBuilder.append("Содержимое документа: ${document.document_content}\n")
            stringBuilder.append("Статус документа: ${document.document_status}\n")
            stringBuilder.append("ID пользователя: ${document.user_id}\n\n")
        }
        documentListTextView.text = stringBuilder.toString()

    }

}