# TCP Server with Netcat (Java)

## Overview

This simple Java program demonstrates a basic TCP server that accepts connections on port 12345 and communicates with clients using the Netcat (`nc`) tool. The server reads messages from clients, prints them to the console, and sends the same message back to the client unless the message is "quit," which terminates the connection.

## Usage

1. **Compile the Code:**
   - Ensure you have Java installed.
   - Compile the `TCP_Server.java` file using the following command:

     ```bash
     javac TCP_Server.java
     ```

2. **Run the Server:**
   - Execute the compiled program with:

     ```bash
     java TCP_Server
     ```

3. **Connect with Netcat:**
   - Open a terminal and use `nc` to connect to the server:

     ```bash
     nc localhost 12345
     ```

4. **Communicate with the Server:**
   - Type messages in the Netcat terminal and observe server responses.

5. **Quit the Connection:**
   - Type "quit" to exit the loop and close the connection.
