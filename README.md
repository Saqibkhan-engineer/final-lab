# final-lab



MVC Architecture:



The Model-View-Controller (MVC) pattern is used to separate concerns within the system. Here's how each part works:

Model: Represents the data and business logic. In this case, SmartLight is the model that holds the state (e.g., status) of the light.
View: Represents the UI or the visual components of the system. Here, LightControlUI acts as the view, providing a user interface to control the light and display its status.
Controller: Manages communication between the view and model. User plays the role of a controller, sending commands to the SmartLight (model) via the Command interface. The LightControlUI can also be seen as the controller in terms of interacting with both the model and the user.






How the code works:


User sends a command (e.g., TurnOnCommand or TurnOffCommand) to control the light through the method controlLight(). This method is part of the User class, and it uses the Command pattern to send commands to the SmartLight object.

The Command object is passed to the SmartLight, and when executed, it calls methods like turnOn() or turnOff() on the SmartLight class, depending on the concrete command.

The LightControlUI class is responsible for the user interface. It updates the status of the light based on the user’s interaction and provides methods like setupUI() to initialize the UI components and updateStatus() to display the current state of the light (on or off).

SmartLight contains the light's status and can be turned on or off through methods like turnOn() and turnOff().
