# Java Annotations and Reflection

## Overview
This project demonstrates the use of **Custom Annotations and Java Reflection** to identify annotated methods and execute them dynamically at runtime.

## Concepts Covered
- Custom Annotations using `@interface`
- `@Retention(RetentionPolicy.RUNTIME)`
- `@Target(ElementType.METHOD)`
- Java Reflection API
- `getMethod()` for accessing methods
- `isAnnotationPresent()` for checking annotations
- `Method.invoke()` for executing methods dynamically

## Project Structure
```text
Annotations-Reflection/
├── Important.java
├── Student.java
└── StudentDriver.java
```

## How It Works
1. Create a custom annotation named `@Important`.
2. Apply the annotation to a method in the `Student` class.
3. Use Java Reflection to retrieve the method.
4. Check whether the method contains the `@Important` annotation.
5. Invoke the method only when the annotation is present.

## Example Output
```text
Student is Studying
```

## Learning Objective
The objective of this project is to understand how custom annotations provide metadata and how Java Reflection can inspect annotations and invoke methods dynamically at runtime.

## Technologies Used
- Java
- Java Reflection API
- Custom Annotations

## Conclusion
This project provides practical experience with custom annotations and reflection in Java. These concepts help developers understand how frameworks can inspect metadata and perform actions based on annotations.
