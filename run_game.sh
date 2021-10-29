#!/bin/bash

echo "Marcus Elwing Program"
mkdir Marcus_Elwing_labb
cp *.java Marcus_Elwing_labb
cd Marcus_Elwing_labb
echo "Running game from $PWD"
echo "Compiling..."
echo "Starting Game"
javac GuessingGame.java
java GuessingGame
echo "The program is now done and will delete all class files"
rm  *.class
echo "These are the remaining files in the directory"
ls
