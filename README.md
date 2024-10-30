Understanding Android UI with XML:
XML layouts are used to define the user interface (UI) elements in Android apps.
You used a LinearLayout with vertical and horizontal orientations to arrange EditText, Button, and TextView elements.
IDs in XML (e.g., android:id="@+id/et_a") allow these elements to be accessed and manipulated in Kotlin code.
UI components used:
EditText: To accept user input (like numbers).
Button: For performing actions (e.g., +, -, *, /).
TextView: To display results.
2. Connecting XML and Kotlin:
Kotlin is used to define the logic and behavior for your app.
In your MainActivity, you learned how to:
Link UI elements in XML to Kotlin using findViewById().
Set onClick listeners for buttons to respond to user interactions.
Perform operations (like addition, subtraction, etc.) and display results using TextView.
