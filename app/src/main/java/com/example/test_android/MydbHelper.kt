package com.example.test_android

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MydbHelper(context:Context) :SQLiteOpenHelper(context,"JOKESDB", null, 1 ) {
    override fun onCreate(p0: SQLiteDatabase?) {

        p0?.execSQL("CREATE TABLE JOKES(JOKEID Integer PRIMARY KEY AUTOINCREMENT, CONTENT TEXT) ")

        p0?.execSQL("INSERT INTO JOKES(CONTENT) VALUES('A child asked his father, \"How were people born?\" So his father said, \"Adam and Eve made babies, then their babies became adults and made babies, and so on.\"The child then went to his mother, asked her the same question and she told him, \"We were monkeys then we evolved to become like we are now.\"The child ran back to his father and said, \"You lied to me!\" His father replied, \"No, your mom was talking about her side of the family.\"')")
        p0?.execSQL("INSERT INTO JOKES(CONTENT) VALUES('Teacher: \"Kids,what does the chicken give you?\" Student: \"Meat!\" Teacher: \"Very good! Now what does the pig give you?\" Student: \"Bacon!\" Teacher: \"Great! And what does the fat cow give you?\" Student: \"Homework!\"')")
        p0?.execSQL("INSERT INTO JOKES(CONTENT) VALUES('A housewife, an accountant and a lawyer were asked \"How much is 2+2?\" The housewife replies: \"Four!\". The accountant says: \"I think it s either 3 or 4. Let me run those figures through my spreadsheet one more time.\" The lawyer pulls the drapes, dims the lights and asks in a hushed voice, \"How much do you want it to be?\"')")


    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}