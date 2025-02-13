package com.example.tipcalc

import org.junit.Test

import org.junit.Assert.*
import java.text.NumberFormat

class TipCalcTests {
    @Test
    fun calculateTip20Percent() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}