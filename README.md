# Madlibzzzzzzzzzzzzzzzzzzzzzzzz
Halloween Mad Libs Generator Project

This is a Java program created for a school assignment to practice user input, arrays, and string manipulation. The program asks the user for six different words and automatically places them into a spooky Halloween story template.

Project Files and Design

The project is split into four separate files to keep the code organized and easy to read:

Halloween_MadLibs.java is the main file that runs the program. It calls the methods to collect words, gets the story template, generates the final story, and prints the result to the console.

InputCollector.java handles all user interaction. It uses a Scanner object to prompt the user for six words in a specific order: a noun, a verb, an adjective, another noun, another verb, and another adjective. It stores these words in an array and returns them.

StoryGenerator.java contains the core logic for the project. It takes the story template and the array of words, then loops through to replace the placeholders with the user provided words one by one.

StoryTemplate.java stores the raw Halloween story text containing the format placeholders where the words will go.

Development Milestones

Step 1. Forked the GitHub repository and planned out how to divide the code into multiple classes.

Step 2. Built the input collector class and tested it to make sure it correctly captures all six required words from the user.

Step 3. Created the story template and wrote the generation logic to safely swap out the placeholders using a loop and string replacement methods.

Step 4. Ran final test cases to check that the program works correctly from start to finish and prepared this documentation.

How to Run the Program

Open your terminal or command prompt window.

Compile all the Java source files by typing this command and pressing enter:
javac Halloween_MadLibs.java InputCollector.java StoryGenerator.java StoryTemplate.java

Run the compiled program by typing this command and pressing enter:
java Halloween_MadLibs

Screenshots

<img width="973" height="900" alt="image" src="https://github.com/user-attachments/assets/1f270824-a6a6-43ab-b40e-497bd05f8a1a" />
