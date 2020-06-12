package com.example.natasaandzic.courtcounter

import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var scoreA = 0
    private var scoreB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aPlusThreeBtn.setOnClickListener {
            this.scoreA = increment(this.scoreA, 3)
            displayScore(scoreATv, this.scoreA)
        }

        aPlusTwoBtn.setOnClickListener {
            this.scoreA = increment(scoreA, 2)
            displayScore(scoreATv, this.scoreA)
        }

        aPlusOneBtn.setOnClickListener {
            this.scoreA = increment(scoreA, 1)
            displayScore(scoreATv, this.scoreA)
        }

        resetBtn.setOnClickListener {
            scoreA = 0
            scoreB = 0
            displayScore(scoreATv, 0)
            displayScore(scoreBTv, 0)
        }

        bPlusThreeBtn.setOnClickListener {
            this.scoreB = increment(scoreB, 3)
            displayScore(scoreBTv, this.scoreB)
        }

        bPlusTwoBtn.setOnClickListener {
            this.scoreB = increment(scoreB, 2)
            displayScore(scoreBTv, this.scoreB)
        }

        bPlusOneBtn.setOnClickListener {
           this.scoreB = increment(scoreB, 1)
            displayScore(scoreBTv, this.scoreB)
        }
    }

    private fun displayScore(view: TextView, score: Int) {
        view.text = score.toString()
    }

    private fun increment(number: Int, plus: Int): Int {
        return number + plus
    }

}