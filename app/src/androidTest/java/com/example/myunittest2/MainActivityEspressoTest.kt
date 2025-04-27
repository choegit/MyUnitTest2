package com.example.myunittest2

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
class MainActivityEspressoTest {

    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @Before
    fun setUp() {
        hiltRule.inject()
    }

    @Test
    fun testActivityLaunchAndBasicView() {
        // Launch MainActivity
        ActivityScenario.launch(MainActivity::class.java)

        // Find a TextView with specific text (for Compose it wraps into view hierarchy!)
        onView(withText("Hello Hilt + Compose!"))
            .check(matches(isDisplayed()))
    }
}
