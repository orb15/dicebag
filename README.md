# dicebag
models ployhedral dice used in gaming


Provides the following features:  

* Has dice for the following: d2 d3 d4 d6 d8 d10 d12 d20 d100  
* Also supports: dFudge (for FUDGE +1/0/-1 rolls)  
* Supports a dX class so you can create your own die type if needed  
* Includes the "DiceBag" class with public static members to make using the lib as easy as possible
* Provides commonly needed methods to roll one or more dice and optionally sum them  
* Provides a method for rolling a specific die and compare the result against a provided target number

Usage:

include the jar file via whatever means you'd like, then:  
DiceBag.D3.roll() to generate a random number between 1 and 3 inclusive

