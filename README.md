# Java Digital Clock using a thread that will sleep for one second and then increment the clock's display:

### Explanation of Thread Implementation:

In the DigitalClock application, a separate thread is used to update the time displayed on the GUI at regular intervals. Here's how it works:

- The `DigitalClock` class initializes a JFrame (`frame`) and a JLabel (`timeLabel`).
- Inside the constructor, a new instance of the `UpdateTime` class is created and passed to a new `Thread` object (`updateTimeThread`).
- The `UpdateTime` class implements the `Runnable` interface, which allows objects of this class to be executed in a separate thread.
- The `run()` method of the `UpdateTime` class contains the logic for updating the time displayed on the JLabel (`timeLabel`). It uses a `while` loop to continuously update the time at intervals of one second.
- Inside the `updateTime()` method, the current time is obtained using a `SimpleDateFormat` object, and then it's formatted into a string and set as the text of the `timeLabel`.
- The `Thread.sleep(1000)` statement causes the thread to sleep for one second before updating the time again.
- The `main()` method creates an instance of the `DigitalClock` class, which initializes the GUI and starts the thread responsible for updating the time.

This implementation ensures that the time displayed on the digital clock GUI is updated continuously without freezing the UI, thanks to the separate thread dedicated to this task.
