In the last challenge, we needed you to figure out how much fuel we needed, but we are doing some additional calculations behind the scenes that we now need your help to automate.
    
Now that we know how much fuel (Kerosene) we need for our test, we need you to figure out how much liquid oxidizer (LOX) is needed per kilogram of fuel and how much the total propellant, "Rocket Propellant 1" (RP-1) weighs.
    
Every kilogram of kerosene requires 2.56 kilograms of LOX to create the RP-1 mixture for our rockets. Make sure that you use a constant for the ratio value named "LOX_RECIPE."

Write a program that accepts an input for how much fuel we need for a test and then gives us a value for how much LOX we need and what the total weight of the propellant is once mixed.

> Things you will need to pass the tests:
> - Prompt 1: "How many kilograms of fuel are needed for the test?"
> - Formula 1: `LOX = fuel * 2.56`
> - Formula 2: `RP1 = LOX + fuel`
> - Output 1: "You need `[LOX]` kilograms of oxidizer for `[fuel]` kilograms of fuel."
> - Output 2: "The total weight of RP-1 required is `[RP1]` kilograms."
