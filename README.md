# highlight-checkerboard

My solution for Chapter 6 Exercise 5 of “Introduction to Programming Using Java”.

NOTE: This is a javafx program. It requires the javafx library as a dependency. (See bottom of this README for javafx instructions).

Project Description:
In Exercise 3.8, you drew a checkerboard. For this exercise, write a program where the user
can select a square by clicking on it. Highlight the selected square by drawing a colored
border around it. When the program starts, no square is selected. When the user clicks
on a square that is not currently selected, it becomes selected, and the previously selected
square, if any, is unselected. If the user clicks the square that is selected, it becomes
unselected. Assume that the size of the checkerboard is exactly 400 by 400 pixels, so that
each square on the checkerboard is 50 by 50 pixels.

Javafx setup instructions:
Download javafx from: https://gluonhq.com/products/javafx/ (I used javafx 12). Save it to a location of your choice.
Unpack the zip folder.
Open my project with your IDE of choice (I use intellij IDEA).
Add the javafx/lib folder as an external library for the project. For intellij, this means going to "project structure" -> "libraries" -> "add library" ->{javafx location}/lib
Add the following as a VM argument for the project: --module-path "{full path to your javafx/lib folder}" --add-modules javafx.controls,javafx.fxml,javafx.base,javafx.graphics,javafx.media,javafx.swing,javafx.web
Build and run the project as normal.
