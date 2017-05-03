package com.artech.testexpresionessd.testexpresionessd;


import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class ExpressionsTest {

    @Rule
    public ActivityTestRule<Main> mActivityTestRule = new ActivityTestRule<>(Main.class);

    @Test
    public void expressionsTest() {
        // Ubico el botón para probar funciones en eventos SD.
        ViewInteraction dashboardOption = onView(
                allOf(childAtPosition(
                        withId(R.id.DashBoardGridView),
                        0),
                        isDisplayed()));
        // Hago click en el botón.
        dashboardOption.perform(click());

        // ------------------------
        // | SD Numeric Functions |
        // ------------------------
        // Ubico el botón para probar funciones numéricas.
        ViewInteraction menuOption1 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.DashBoardListView),
                                withParent(withId(R.id.DashBoardMainLinearLayout))),
                        0),
                        isDisplayed()));
        // Hago click en el botón.
        menuOption1.perform(click());

        // Ejecuto la prueba.
        ViewInteraction executeButton = onView(
                allOf(withText("Ejecutar"), isDisplayed()));
        executeButton.perform(click());

        ViewInteraction textView = onView(
                allOf(withText(
                        "-------Función Int => Test OK\r\n" +
                                "-------Función Round => Test OK\r\n" +
                                "-------Función RoundToEven => Test OK\r\n" +
                                "-------Función Trunc => Test OK\r\n" +
                                "-------Función Mod => Test OK\r\n" +
                                "-------Función Potencia => Test OK\r\n"
                        ),
                        isDisplayed()));
        textView.check(matches(withText(
                "-------Función Int => Test OK\r\n" +
                        "-------Función Round => Test OK\r\n" +
                        "-------Función RoundToEven => Test OK\r\n" +
                        "-------Función Trunc => Test OK\r\n" +
                        "-------Función Mod => Test OK\r\n" +
                        "-------Función Potencia => Test OK\r\n"
        )));

        pressBack();

        // ----------------------
        // | SD Numeric Methods |
        // ----------------------
        // Ubico el botón para probar métodos numéricos.
        ViewInteraction menuOption2 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.DashBoardListView),
                                withParent(withId(R.id.DashBoardMainLinearLayout))),
                        1),
                        isDisplayed()));
        // Hago click en el botón.
        menuOption2.perform(click());

        // Ejecuto la prueba.
        ViewInteraction executeButton2 = onView(
                allOf(withText("Ejecutar"), isDisplayed()));
        executeButton2.perform(click());

        ViewInteraction textView2 = onView(
                allOf(withText(
                        "-------Metodo ToString => Test OK\r\n" +
                                "-------Metodo Integer => Test OK\r\n" +
                                "-------Metodo Round => Test OK\r\n" +
                                "-------Metodo RoundToEven => Test OK\r\n" +
                                "-------Metodo Trunc => Test OK\r\n"
                        ),
                        isDisplayed()));
        textView2.check(matches(withText(
                "-------Metodo ToString => Test OK\r\n" +
                        "-------Metodo Integer => Test OK\r\n" +
                        "-------Metodo Round => Test OK\r\n" +
                        "-------Metodo RoundToEven => Test OK\r\n" +
                        "-------Metodo Trunc => Test OK\r\n"
        )));

        pressBack();

        // --------------------------
        // | SD Character Functions |
        // --------------------------
        // Ubico el botón para probar funciones de caracteres.
        ViewInteraction menuOption3 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.DashBoardListView),
                                withParent(withId(R.id.DashBoardMainLinearLayout))),
                        2),
                        isDisplayed()));
        // Hago click en el botón.
        menuOption3.perform(click());

        // Ejecuto la prueba.
        ViewInteraction executeButton3 = onView(
                allOf(withText("Ejecutar"), isDisplayed()));
        executeButton3.perform(click());

        ViewInteraction textView3 = onView(
                allOf(withText(
                        "-------Función Str => Test OK\r\n" +
                                "-------Función StrSearch => Test OK\r\n" +
                                "-------Función StrSearchRev => Test OK\r\n" +
                                "-------Función Len => Test OK\r\n" +
                                "-------Función PadL => Test OK\r\n" +
                                "-------Función PadR => Test OK\r\n" +
                                "-------Función StrReplace => Test OK\r\n" +
                                "-------Función SubStr => Test OK\r\n" +
                                "-------Función Lower => Test OK\r\n" +
                                "-------Función Upper => Test OK\r\n" +
                                "-------Función Val => Test OK\r\n" +
                                "-------Función Trim => Test OK\r\n" +
                                "-------Función RTrim => Test OK\r\n" +
                                "-------Función LTrim => Test OK\r\n" +
                                "-------Función ToFormattedString - Caso 1 - Numerico con separador de miles - ToFormattedString(&total)\r\n" +
                                "Esperado: 4,395.35\r\n" +
                                "Resultado: 4,395.35\r\n\r\n" +
                                "-------Función Format => Test OK\r\n" +
                                "-------Función Concat => Test OK\r\n"
                        ),
                        isDisplayed()));
        textView3.check(matches(withText(
                "-------Función Str => Test OK\r\n" +
                        "-------Función StrSearch => Test OK\r\n" +
                        "-------Función StrSearchRev => Test OK\r\n" +
                        "-------Función Len => Test OK\r\n" +
                        "-------Función PadL => Test OK\r\n" +
                        "-------Función PadR => Test OK\r\n" +
                        "-------Función StrReplace => Test OK\r\n" +
                        "-------Función SubStr => Test OK\r\n" +
                        "-------Función Lower => Test OK\r\n" +
                        "-------Función Upper => Test OK\r\n" +
                        "-------Función Val => Test OK\r\n" +
                        "-------Función Trim => Test OK\r\n" +
                        "-------Función RTrim => Test OK\r\n" +
                        "-------Función LTrim => Test OK\r\n" +
                        "-------Función ToFormattedString - Caso 1 - Numerico con separador de miles - ToFormattedString(&total)\r\n" +
                        "Esperado: 4,395.35\r\n" +
                        "Resultado: 4,395.35\r\n\r\n" +
                        "-------Función Format => Test OK\r\n" +
                        "-------Función Concat => Test OK\r\n"
        )));

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
