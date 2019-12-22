READ ME
Author: Darryl Carter
Date: 9-25-19
Version 0.0.0.1

Color Calculator
 
I. The Design
Simple calculator design with ADD/Subtract/Multiplication/Divide functionality.
Allows user to change the background with a click of a button, COLOR GENERATOR button.
The clear button deletes the input from the right. Created with a Relative layout. Pressing 
any operation buttons before a value will exit the app. When dividing by 0, a Toast message
will pop up telling the user Dividing by 0 is not allowed.

I.A Function Design
	1.button functions
		a. button(0-9) appends to text view
		b. operation button(Add,Sub,Mul,Div) do there respective
		   functions
		c. buttonClear deletes value from the right
		d. buttonEql calculates the values
	2. Text View - displays the users input and results

II. Design Decision
Created the app with a Relative Layout so the app can work around any size device. Also, with
the Color Generator button is implemented in the same view as the calculator for easier access
instead of having to switch between to functionalities.	