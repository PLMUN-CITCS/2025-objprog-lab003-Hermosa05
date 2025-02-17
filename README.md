# **2025-OBJPROG-LAB003**
Week 02 - Introduction to Java Programming

Laboratory # 03 - Guided Coding Exercise: Input and Output with Text Formatting

## **Instructions**

### **Step 1.1: Accept the Assignment**

   1. Click on the assignment link provided by your instructor.
   2. GitHub Classroom will create a **private repository** under your GitHub account.
   3. After the repository is created, click **"Go to Repository"** to view your assignment.

---

### **Step 1.2: Setup your Git Environment**
Only perform this if this is the first time you will setup your Git Environment

   1. Create a GitHub Account:
   ```bash
   https://github.com/signup?source=login
   ```
      
   2. Download and Install Git on your Laptop/Desktop:
   ```bash
   https://git-scm.com/downloads
   ```
   
   3. Create a Folder in your Laptop/Desktop
   4. Right-click anywhere in the created folder and select "Open Git Bash Here".
   5. In the Git Bash Terminal, set your git name, perform command:
   ```bash
   git config --global user.name "Your Name"
   ```
   
   6. In the Git Bash Terminal, set your git email, perform command:
   ```bash
   git config --global user.email "your.email@example.com"
   ```
   
   7. Create your SSH Key, just follow the instructions, no need to provide filename and passphrase. In the Git Bash Terminal, perform command:
   ```bash
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
   
   8. Copy your SSH Keys into clipboard. In the Git Bash Terminal, perform command:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
   
   9. Log in to your GitHub account.
   10. In the upper-right corner of GitHub, click your profile picture and select Settings.
   11. In the left sidebar, click on SSH and GPG keys.
   12. Click the New SSH key button.
   13. In the Title field, give the key a recognizable name (e.g., "My Windows Laptop").
   14. In the Key field, CTRL + V or paste the keys copied into your clipboard. Save the key.
   15. Go Back to terminal, use command:
   ```bash
   ssh -T git@github.com
   ```

### **Step 2: Clone the Repository to Your Local Machine**

   1. On your repository page, click the green **"Code"** button.
   2. Copy the repository URL (choose HTTPS for simplicity).
   3. Open your terminal (or Git Bash, Command Prompt, or PowerShell) and run:
   
   ```bash
   git clone <git_repo_url>
   ```
   
   4. Navigate into the cloned folder:
   
   ```bash
   cd <git_cloned_folder>
   ```

### **Step 3: Complete the Assignment**

**Laboratory # 03 - Guided Coding Exercise: Input and Output with Text Formatting**

   **Objective:**
   - Learn to use input (via the `Scanner` class) and output statements.
   - Apply text formatting when displaying numbers, decimals, and strings.
   - Understand the differences between `print`, `println`, and `printf`.

   **Desired Output:**
   ```txt
   Enter an integer: 5
   Enter a decimal number: 10
   Enter a word or sentence: This is a String
   Your integer: 5
   Your decimal number: 10.00
   Your string: This is a String
   ```

   **File Naming Convention:**
   - `InputOutputDemo.java`

   **Notable Observations (to be discussed after completing the exercise):**
   - Input Handling: The activity demonstrates how to handle different types of input (integers, doubles, strings) using the Scanner class. The crucial step of consuming the newline character after numeric input is highlighted.
   - Output Formatting: The use of printf() is the key observation. Students learn how to format output using format specifiers, which is very important for presenting data clearly. The difference between print(), println(), and printf() becomes clear.
   - Newline Consumption: The exercise emphasizes the importance of handling the newline character left in the input buffer after reading numbers. This is a common source of errors for beginners.
   - Resource Management: The instruction to close the Scanner is a good introduction to resource management, although the impact is more significant in larger applications.

   **Java Best Practices**
   - Import Necessary Classes: Remember to import classes you need, like java.util.Scanner for input. Do this before your class declaration.
   - Scanner for Input: Use the Scanner class to get user input. Create a Scanner object connected to System.in.
   - Prompt the User: Always provide clear prompts to the user so they know what kind of input is expected. Use System.out.print() for prompts on the same line as input.
   - Handle Newlines: After reading numeric input (nextInt(), nextDouble()), use input.nextLine() to consume the leftover newline character before reading a string with nextLine(). This prevents skipping the string input.
   - print(), println(), printf(): Understand the differences:
      - print(): Output stays on the same line.
      - println(): Output moves to the next line.
      - printf(): Formatted output using format specifiers (%d, %.2f, %s, %n). Use printf() for precise control over output formatting.
   - Format Specifiers: Use the correct format specifiers in printf(): %d for integers, %.2f for floating-point numbers (specifies 2 decimal places), %s for strings, and %n for newlines.
   - Close the Scanner: Close the Scanner object (input.close()) when you're finished with it to release resources. This is good practice, especially in larger programs.
   - Descriptive Variable Names: Use meaningful names for your variables (e.g., userInt, userDouble, userString). This makes your code more readable.
   - Comments: Add comments to explain what your code does. This is essential for understanding and maintaining code.

   **Step-by-Step Instructions:**

   1. Import the Scanner Class
      - Create a file named `InputOutputDemo.java`.
      - At the very top of your file (before the class declaration), import the `Scanner` class.  This allows you to get input from the user.
      ```Java
      import java.util.Scanner;
      ```
      
   2. Class and Main Method
      - Define the class `InputOutputDemo` and its main method.
      ```Java
      public class InputOutputDemo {
          public static void main(String[] args) {
      
          }
      }
      ```
            
   3. Create a Scanner Object
      - Inside the `main` method, create a `Scanner` object.  This object will be used to read user input from the console.
      ```Java
      Scanner input = new Scanner(System.in);
      ```

   4. Prompt for and Input an Integer
      - Use `System.out.print()` to display a message prompting the user to enter an integer.  `print` keeps the cursor on the same line.
      ```Java
      System.out.print("Enter an integer: ");
      ```
      
      - Use the `nextInt()` method of the `Scanner` object to read the integer entered by the user and store it in an integer variable named `userInt`.
      ```Java
      int userInt = input.nextInt();
      ```

   5. Prompt for and Input a Double
      - Use `System.out.print()` to prompt the user to enter a decimal number (a double).
      ```Java
      System.out.print("Enter a decimal number: ");
      ```
      
      - Use the `nextDouble()` method of the `Scanner` object to read the double and store it in a double variable named `userDouble`.
      ```Java
      double userDouble = input.nextDouble();
      ```

   6. Consume Newline and Prompt for a String
      - After reading a number (integer or double), there's often a leftover newline character in the input buffer. This can cause issues when reading a string next.  So, add `input.nextLine();` to consume this leftover newline.
      ```Java
      input.nextLine(); // Consume newline
      ```

      - Use `System.out.print()` to prompt the user to enter a word or sentence (a string).
      ```Java
      System.out.print("Enter a word or sentence: ");
      ```

      - Use the `nextLine()` method of the Scanner object to read the entire line of text (including spaces) entered by the user and store it in a String variable named `userString`.
      ```Java
      String userString = input.nextLine();
      ```

   7. Output with Formatting (Integer)
      - Use `System.out.printf()` to display the value of `userInt` with a formatted label.  Use `%d` as the format specifier for integers. `%n` adds a newline.
      ```Java
      System.out.printf("Your integer: %d%n", userInt);
      ```

   8. Output with Formatting (Double)
      - Use `System.out.printf()` to display the value of `userDouble`. Use `%.2f` to format the double to two decimal places.
      ```Java
      System.out.printf("Your decimal number: %.2f%n", userDouble);
      ```

   9. Output with Formatting (String)
      - Use `System.out.printf()` to display the value of `userString`. Use `%s` as the format specifier for strings.
      ```Java
      System.out.printf("Your string: %s%n", userString);
      ```

   10. Output Case Sensitivity Variables
      - It's good practice to close the `Scanner` object when you're finished with it to release system resources.
```Java
input.close();
```

   11. Compile and Run
      - Save the file as `InputOutputDemo.java`.
      - Compile the code using `javac InputOutputDemo.java` in your terminal or command prompt.
      - Run the compiled code using `java InputOutputDemo`.

### **Step 4: Push Changes to GitHub**
Once you've completed your changes, follow these steps to upload your work to your GitHub repository.

1. Check the status of your changes:
   Open the terminal and run:
   
   ```bash
   git status
   ```
   This command shows any modified or new files.
   
2. Stage the changes:
   Add all modified files to staging:
   
   ```bash
   git add .
   ```
   
3. Commit your changes:
   Write a meaningful commit message:
   
   ```bash
   git commit -m "Submitting OBJPROG Week 02 - Session 01 - Exercise 02"
   ```
   
4. Push your changes to GitHub:
   Upload your changes to your remote repository:
   
   ```bash
   git push origin main
   ```
