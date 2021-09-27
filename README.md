# Instructions

Create a new class under `src.com.helloworld` named
`Main.java`.

Add the `main` method as you've been doing.

The main method should print to the console
`"Hello my name is _____"` with the blank
replaced with a name.

## Running the Tests

### Through the Command Line

First open the command line and navigate to
the gradletest directory.

Run the command `./gradlew -q clean :test` to
run all tests.

You should see **2 passing tests and 1 failed test!**.

### Through the IDE

The failed test wants you to add an exclamation
mark at the end of your message.

Fix this issue and then navigate to the file:
`tst/com/helloworld/MainTest`

Click the green arrow icon to the left of 
`public MainTest` at the top of the file and 
select "Run Tests".

**You should now see three passing test cases
in the bottom console window**.