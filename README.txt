UTEID: eab2982; dmd2479;

FIRSTNAME: Daniel; Eddie;

LASTNAME: Duncan; Babbe;

CSACCOUNT: dmduncan; babbe99;

EMAIL: daniel.duncan@utexas.edu; babbe2012@utexas.edu;

[Program 1]
[Description]
Our project requires 6 java files to be ran correctly. The main method is contained in Securesystem.java, and from there most of the other classes
will be accessed. When subjects are created, createSubject is called which accesses a method in SecureSystem(since this file manages subjects as the instructions wanted).
While here, a new subject is made with the given name and an initial temp value of 0(the SecureSubject class is used for this). The subjects are stored in a list, and their name and SecurityLevel, from the 
SecurityLevel class, are sent to ReferenceMonitor where a mapping is held. New objects are stored in ReferenceMonitor, with a mapping to their level. Once the mapping is saved, they are sent to the nested class
ObjectManager, which stores the new object with a default value of 0. The file "instructionList" is read in the SecureSystem class, and possible commands are converted into a string array, in order to better validate whether they are valid or not.
If the first word is not read or write, a badInstruction is created. If the second is not a subject or the third is not an object, a badInstruction is created. And finally, in the case of the write command, if the fourth is not a number, then a badInstruction is created. 
If the conditions are met, the ReferenceMonitor is accessed to see if that subject has read or write permissions to that object. If so, the ReferenceMonitor accesses the ObjectManager to carry out that command. Then, the instruction and current state will be printed.
This will continue until all lines in the instructionList are read. Our program is compiled with javac *.java and ran with java SecureSystem instructionList.
