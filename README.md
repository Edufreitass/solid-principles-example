# SOLID Design Principles

## S : Single Responsibility Principle (SRP)

The single responsibility principle states that **every Java class must perform a single functionality.**
Implementation of multiple functionalities in a single class mashup the code.

## O : Open closed Principle (OSP)

The open-closed principle states that according to new requirements the module should be open for extension but closed for modification.

## L : Liskov substitution Principle (LSP)

It applies to inheritance in such a way that the **derived classes must be completely substitutable for their base classes.**
In other words, if class A is a subtype of class B, then we should be able to replace B with aA without interrupting the behaviour of the program.

## I : Interface Segregation Principle (ISP)

The principle states that the larger interfaces split into smaller ones. Because the implementation classes use only the methods that are required.
We should not force the client to use the methods that they do not want to use.
The goal of the interface segregation principle is similar to the single responsibility principle.

## D : Dependency Inversion Principle (DIP)

