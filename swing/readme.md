# Java AWT Tutorial

- Java AWT (Abstract Window Toolkit) is an API to develop GUI or window-based applications in java.
- Java AWT components are platform-dependent i.e. components are displayed according to the view of operating system. AWT is heavyweight i.e. its components are using the resources of OS.
- The java.awt package provides classes for AWT api such as TextField, Label, TextArea, RadioButton, CheckBox, Choice, List etc.

# Swing

Swing API is a set of extensible GUI Components to ease the developer's life to create JAVA based Front End/GUI Applications. It is build on top of AWT API and acts as a replacement of AWT API, since it has almost every control corresponding to AWT controls. Swing component follows a Model-View-Controller architecture to fulfill the following criterias.
- A single API is to be sufficient to support multiple look and feel.
- API is to be model driven so that the highest level API is not required to have data.
- API is to use the Java Bean model so that Builder Tools and IDE can provide better services to the developers for use.

# Design Pattern

Design patterns represent the best practices used by experienced object-oriented software developers. Design patterns are solutions to general problems that software developers faced during software development.

## Gang of Four (GOF)?

In 1994, four authors Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides published a book titled Design Patterns - Elements of Reusable Object-Oriented Software which initiated the concept of Design Pattern in Software development.

## Usage of Design Pattern

- Common platform for developers
- Best Practices

## Types of Design Patterns

### Creational Patterns

These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. This gives program more flexibility in deciding which objects need to be created for a given use case.

### Structural Patterns

These design patterns concern class and object composition. Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities.

### Behavioral Patterns

These design patterns are specifically concerned with communication between objects.

### J2EE Patterns

These design patterns are specifically concerned with the presentation tier. These patterns are identified by Sun Java Center.

# MVC Architecture
Swing API architecture follows loosely based MVC architecture in the following manner.

- Model represents component's data.
- View represents visual representation of the component's data.
- Controller takes the input from the user on the view and reflects the changes in Component's data.
- Swing component has Model as a seperate element, while the View and Controller part are clubbed in the User Interface elements. Because of which, Swing has a pluggable look-and-feel architecture.

# Swing Features
- Light Weight − Swing components are independent of native Operating System's API as Swing API controls are rendered mostly using pure JAVA code instead of underlying operating system calls.
- Rich Controls − Swing provides a rich set of advanced controls like Tree, TabbedPane, slider, colorpicker, and table controls.
- Highly Customizable − Swing controls can be customized in a very easy way as visual apperance is independent of internal representation.
- Pluggable look-and-feel − SWING based GUI Application look and feel can be changed at run-time, based on available values.

-- ---------------------------------------------------
Every user interface considers the following three main aspects:

## UI Elements 
These are the core visual elements the user eventually sees and interacts with. GWT provides a huge list of widely used and common elements varying from basic to complex, which we will cover in this tutorial.

## Layouts
They define how UI elements should be organized on the screen and provide a final look and feel to the GUI (Graphical User Interface). This part will be covered in the Layout chapter.

## Behavior
These are the events which occur when the user interacts with UI elements. This part will be covered in the Event Handling chapter.

-- ---------------------------------------------------
Every SWING controls inherits properties from the following Component class hiearchy.

## Component
A Component is the abstract base class for the non menu user-interface controls of SWING. Component represents an object with graphical representation

## Container
A Container is a component that can contain other SWING components. Swing defines two types of containers. The first are top-level containers: JFrame, JApplet, JWindow, and JDialog. These containers do not inherit JComponent. They do, however, inherit the AWT classes Component and Container. Unlike Swing’s other components, which are lightweight, the top-level containers are heavyweight. This makes the top-level containers a special case in the Swing component library.

## JComponent
A JComponent is a base class for all SWING UI components. In order to use a SWING component that inherits from JComponent, the component must be in a containment hierarchy whose root is a top-level SWING container

-- ---------------------------------------------------
## SWING UI Elements or Compoenents
In general, Swing components are derived from the JComponent class. (The only exceptions
to this are the four top-level containers, described in the next section.) JComponent provides
the functionality that is common to all components. For example, JComponent supports the
pluggable look and feel. JComponent inherits the AWT classes Container and Component.
Thus, a Swing component is built on and compatible with an AWT component.

JLabel - A JLabel object is a component for placing text in a container.

JButton - This class creates a labeled button.

JColorChooser - A JColorChooser provides a pane of controls designed to allow a user to manipulate and select a color.

JCheck Box - A JCheckBox is a graphical component that can be in either an on (true) or off (false) state.

JRadioButton - The JRadioButton class is a graphical component that can be in either an on (true) or off (false) state. in a group.

JList - A JList component presents the user with a scrolling list of text items.

JComboBox - A JComboBox component presents the user with a to show up menu of choices.

JTextField - A JTextField object is a text component that allows for the editing of a single line of text.

JPasswordField - A JPasswordField object is a text component specialized for password entry.

JTextArea - A JTextArea object is a text component that allows editing of a multiple lines of text.

ImageIcon - A ImageIcon control is an implementation of the Icon interface that paints Icons from Images

JScrollbar - A Scrollbar control represents a scroll bar component in order to enable the user to select from range of values.

JOptionPane - JOptionPane provides set of standard dialog boxes that prompt users for a value or informs them of something.

JFileChooser - A JFileChooser control represents a dialog window from which the user can select a file.

JProgressBar - As the task progresses towards completion, the progress bar displays the task's percentage of completion.

JSlider - A JSlider lets the user graphically select a value by sliding a knob within a bounded interval.

JSpinner - A JSpinner is a single line input field that lets the user select a number or an object value from an ordered sequence.

## What is an Event?
Change in the state of an object is known as Event, i.e., event describes the change in the state of the source.

Foreground Events − These events require direct interaction of the user. 

Background Events − These events require the interaction of the end user. Operating system interrupts, hardware or software failure, timer expiration, and operation completion are some examples of background events.

## What is Event Handling?
Event Handling is the mechanism that controls the event and decides what should happen if an event occurs.

