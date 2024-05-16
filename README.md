# Mouse Listener Example in Java

## Overview
This project demonstrates the use of the `MouseListener` interface in Java to handle mouse events. It extends the `Frame` class and implements the `MouseListener` interface to respond to different mouse actions such as clicks, presses, releases, and mouse movements (entering and exiting the component area).

## Features
- **Mouse Event Handling**: Responds to mouse clicks, presses, releases, and when the mouse enters or exits the frame area.
- **Dynamic Label Update**: Displays a message on the frame indicating the type of mouse event that occurred.

## Requirements
- Java Development Kit (JDK) 1.8 or above.

## How to Run the Program
To run this Mouse Listener example application, follow these steps:

1. **Ensure Java is installed**:
   - You need Java installed on your computer to compile and run this application. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) if it's not already installed.

2. **Download the source code**:
   - Download the source files to your local machine.

3. **Compile the Program**:
   - Open your terminal or command prompt.
   - Navigate to the directory where the file is stored.
   - Compile the code using the following command:
     ```bash
     javac MouseListenerExample.java
     ```

4. **Run the Compiled Program**:
   - Run the program with the following command:
     ```bash
     java MouseListenerExample
     ```

## Classes and Methods

### `MouseListenerExample`
This is the main class that extends `Frame` and implements `MouseListener`.

- **Constructor**:
  - `MouseListenerExample()`: Sets up the frame, adds a mouse listener, initializes the label, and configures the frame properties.

- **Mouse Event Methods**:
  - `mouseClicked(MouseEvent e)`: Invoked when the mouse is clicked.
  - `mouseEntered(MouseEvent e)`: Invoked when the mouse enters the frame area.
  - `mouseExited(MouseEvent e)`: Invoked when the mouse exits the frame area.
  - `mousePressed(MouseEvent e)`: Invoked when the mouse button is pressed.
  - `mouseReleased(MouseEvent e)`: Invoked when the mouse button is released.

### `main` Method
- `public static void main(String[] args)`: The entry point of the program. Creates an instance of `MouseListenerExample`.

## How It Works
1. The `MouseListenerExample` class sets up a GUI frame.
2. It registers itself as a mouse listener for handling mouse events.
3. When a mouse event occurs, the corresponding method (e.g., `mouseClicked`, `mouseEntered`, etc.) is called, and the label text is updated to indicate the event.

## Conclusion
This Java application provides a basic example of how to use the `MouseListener` interface to handle mouse events in a GUI application. It is a useful starting point for understanding event-driven programming in Java.

## Future Enhancements
- Adding more detailed event handling, such as differentiating between left and right mouse button actions.
- Extending the GUI with additional components to demonstrate more complex interactions.
- Improving the visual design with advanced layout managers and styles.

