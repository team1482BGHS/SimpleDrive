# SimpleDrive
A class that's designed to be simpler to use.

In the loop and init functions is where you will write code.
`init` is ran only once when the robot is started up and `loop` is ran many times per second.

## Driving
Drive the robot with the `drive(double power, double direction)` function.
Power and direction are both doubles between -1.0 and 1.0.
A negative power drives in reverse and a negative direction turns left; positive turns right.

## Input
Get controller input with the `getX()` and `getY()` functions.
Both evaluate to a double between -1.0 and 1.0.

Edit your code in `Robot.java` and check out `SimpleDrive.java` for a full function list.
