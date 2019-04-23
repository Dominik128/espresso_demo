package ostfalia.martens.espresso_example;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ui_test {

    private String toBeTyped;

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setup(){
        toBeTyped = "Dies ist ein Test!";
    }

    @Test
    public void testUI(){
        // type Text in EditText
        onView(withId(R.id.editText)).perform(typeText(toBeTyped));

        // click Button
        onView(withId(R.id.button)).perform(click());

        // check TextView change
        onView(withId(R.id.textView)).check(matches(withText(toBeTyped)));

        // check if EditText is empty
        onView(withId(R.id.editText)).check(matches(withText("")));
    }
}
