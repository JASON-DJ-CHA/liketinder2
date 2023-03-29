package com.jason.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jason.example.myapplication.cardslider.CardStackAdapter
import com.yuyakaido.android.cardstackview.CardStackLayoutManager
import com.yuyakaido.android.cardstackview.CardStackListener
import com.yuyakaido.android.cardstackview.CardStackView
import com.yuyakaido.android.cardstackview.Direction

class MainActivity : AppCompatActivity() {

    lateinit var cardStackAdapter : CardStackAdapter
    lateinit var manager : CardStackLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardStackView = findViewById<CardStackView>(R.id.cardStackView)

        manager = CardStackLayoutManager(baseContext, object : CardStackListener{
            override fun onCardDragging(direction: Direction?, ratio: Float) {
            }

            override fun onCardSwiped(direction: Direction?) {
            }

            override fun onCardRewound() {
            }

            override fun onCardCanceled() {
            }

            override fun onCardAppeared(view: View?, position: Int) {
            }

            override fun onCardDisappeared(view: View?, position: Int) {
            }

        })

        val testList = mutableListOf<String>()
        testList.add("a1")
        testList.add("a2")
        testList.add("a3")


        //어뎁터의 아이템을 cardstackview에 넣어준다. 어뎁터에서는 문자열 리스트로 설정해주었다.
        cardStackAdapter =CardStackAdapter(baseContext, testList)
        // layoutmanager에 만든 manager를 연결
        cardStackView.layoutManager = manager
        // layout에 있는 카드스택뷰의 어뎁터에 내가 구현한 어뎁터를 연결해준다.
        cardStackView.adapter = cardStackAdapter

    }
}