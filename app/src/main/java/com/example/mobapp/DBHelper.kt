package com.example.mobapp

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

// Пользователи
data class User(
    val user_id: String,
    val username: String,
    val password: String,
    val role: String
)
// Документы
data class Document(
    val document_id: String,
    val document_name: String,
    val document_content: String,
    val document_status: String,
    val user_id: String
)
// Заявки на подписание документов
data class SignatureRequest(
    val request_id: String,
    val document_id: String,
    val user_id: String,
    val request_status: String
)
// История подписанных документов
data class SignedDocumentHistory(
    val history_id: String,
    val document_id: String,
    val user_id: String,
    val timestamp: Long
)
// Категории документов
data class DocumentCategory(
    val category_id: String,
    val category_name: String
)
// Права доступа пользователей
data class UserAccess(
    val access_id: String,
    val user_id: String,
    val category_id: String,
    val access_level: String
)