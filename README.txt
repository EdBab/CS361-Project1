UTEID: eab2982; dmd2479;
FIRSTNAME: Daniel; Eddie;
LASTNAME: Duncan; Babbe;
CSACCOUNT: dmduncan; babbe99;
EMAIL: daniel.duncan@utexas.edu; babbe2012@utexas.edu;

[Program 1]
[Description]
Our project requires 6 java files to be ran correctly. The main method is contained in Securesystem.java, and from there most of the other classes
will be accessed. When subjects are created, createSubject() is called which accesses a method in SecureSystem(since this file manages subjects as the instructions wanted).
While here, a new subject is made with the given name and an initial temp value of 0(the SecureSubject class is used for this). The subjects are stored in a list, and their name and SecurityLevel, from the 
SecurityLevel class, are sent to ReferenceMonitor where a mapping is held. New objects are stored in ReferenceMonitor, with a mapping to their level. Once the mapping is saved, they are sent to the nested class
ObjectManager, which stores the new object with a default value of 0. The file "instructionList" is read in the SecureSystem class, and possible commands are converted into a string array, in order to better validate whether they are valid or not.
If the first word is not read or write, a badInstruction is created. If the line is not of word length 3 or 4(for a read or write commmand), a badInstruction is created. Finally, if the last string in a write command is not a number, a badInstruction is created. 
If the conditions are met, the ReferenceMonitor is accessed to see if that subject has read or write permissions to that object. If so, the ReferenceMonitor accesses the ObjectManager to carry out that command. Then, the instruction and current state will be printed.
This will continue until all lines in the instructionList are read. Our program is compiled with javac *.java and ran with java SecureSystem instructionList. Eddie wrote SecureSystem and ReferenceMonitor, Daniel wrote SecureObject, SecurityLevel, and SecureSubject. We also used Professor Young's
Instruction class. 

[Finish]
We have completely finished the assignment.

[Test Cases]
We have made five test cases, including the one given to us. They all were read from 
instructionList.


[Input of test 1]
write Hal HObj 
read Hal 
write Lyle LObj 10
read Hal LObj 
write Lyle HObj 20
write Hal LObj 200
read Hal HObj
read Lyle LObj
read Lyle HObj
foo Lyle LObj
Hi Lyle,This is Hal
The missile launch code is 1234567

[Output of test 1]


Bad Instruction
The current state is: 
   LObj has value: 0
   HObj has value: 0
   Lyle has recently read: 0
   Hal has recently read: 0

Bad Instruction
The current state is: 
   LObj has value: 0
   HObj has value: 0
   Lyle has recently read: 0
   Hal has recently read: 0

lyle writes value 10 to lobj
The current state is: 
   LObj has value: 10
   HObj has value: 0
   Lyle has recently read: 0
   Hal has recently read: 0

hal reads lobj
The current state is: 
   LObj has value: 10
   HObj has value: 0
   Lyle has recently read: 0
   Hal has recently read: 10

lyle writes value 20 to hobj
The current state is: 
   LObj has value: 10
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 10

hal writes value 200 to lobj
The current state is: 
   LObj has value: 10
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 10

hal reads hobj
The current state is: 
   LObj has value: 10
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 20

lyle reads lobj
The current state is: 
   LObj has value: 10
   HObj has value: 20
   Lyle has recently read: 10
   Hal has recently read: 20

lyle reads hobj
The current state is: 
   LObj has value: 10
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 20

Bad Instruction
The current state is: 
   LObj has value: 10
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 20

Bad Instruction
The current state is: 
   LObj has value: 10
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 20

Bad Instruction
The current state is: 
   LObj has value: 10
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 20
   

[Input of test 2]
write Lyle HObj 40
read Hal Lyle
write Lyle Hal 10
read Hal LObj 20
write Lyle HObj 20
write Hal LObj 60
read Hal HObj
write Lyle LObj 30
read Lyle HObj
read HObj LObj
read Hal LObj
write Lyle HObj 30


[Output of test 2]
lyle writes value 40 to hobj
The current state is: 
   LObj has value: 0
   HObj has value: 40
   Lyle has recently read: 0
   Hal has recently read: 0
hal reads lyle
The current state is: 
   LObj has value: 0
   HObj has value: 40
   Lyle has recently read: 0
   Hal has recently read: 0
lyle writes value 10 to hal
The current state is: 
   LObj has value: 0
   HObj has value: 40
   Lyle has recently read: 0
   Hal has recently read: 0
BadInstruction
The current state is: 
   LObj has value: 0
   HObj has value: 40
   Lyle has recently read: 0
   Hal has recently read: 0
lyle writes value 20 to hobj
The current state is: 
   LObj has value: 0
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 0
hal writes value 60 to lobj
The current state is: 
   LObj has value: 0
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 0
hal reads hobj
The current state is: 
   LObj has value: 0
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 20
lyle writes value 30 to lobj
The current state is: 
   LObj has value: 30
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 20
lyle reads hobj
The current state is: 
   LObj has value: 30
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 20
hobj reads lobj
The current state is: 
   LObj has value: 30
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 20
hal reads lobj
The current state is: 
   LObj has value: 30
   HObj has value: 20
   Lyle has recently read: 0
   Hal has recently read: 30
lyle writes value 30 to hobj
The current state is: 
   LObj has value: 30
   HObj has value: 30
   Lyle has recently read: 0
   Hal has recently read: 30

[Input of test 3]
write Lyle HObj 40 49
read Hal Lyle 39
write Lyle HObj 10
read Hal 
write 
write Lyle LObj 70
read Hal LObj
write Lyle LObj 
read Lyle LObj
write HObj HObj 38
read Hal HObj
write Lyle HObj 09

[Output of test 3]
BadInstruction
The current state is: 
   LObj has value: 0
   HObj has value: 0
   Lyle has recently read: 0
   Hal has recently read: 0
BadInstruction
The current state is: 
   LObj has value: 0
   HObj has value: 0
   Lyle has recently read: 0
   Hal has recently read: 0
lyle writes value 10 to hobj
The current state is: 
   LObj has value: 0
   HObj has value: 10
   Lyle has recently read: 0
   Hal has recently read: 0
BadInstruction
The current state is: 
   LObj has value: 0
   HObj has value: 10
   Lyle has recently read: 0
   Hal has recently read: 0
BadInstruction
The current state is: 
   LObj has value: 0
   HObj has value: 10
   Lyle has recently read: 0
   Hal has recently read: 0
lyle writes value 70 to lobj
The current state is: 
   LObj has value: 70
   HObj has value: 10
   Lyle has recently read: 0
   Hal has recently read: 0
hal reads lobj
The current state is: 
   LObj has value: 70
   HObj has value: 10
   Lyle has recently read: 0
   Hal has recently read: 70
BadInstruction
The current state is: 
   LObj has value: 70
   HObj has value: 10
   Lyle has recently read: 0
   Hal has recently read: 70
lyle reads lobj
The current state is: 
   LObj has value: 70
   HObj has value: 10
   Lyle has recently read: 70
   Hal has recently read: 70
hobj writes value 38 to hobj
The current state is: 
   LObj has value: 70
   HObj has value: 10
   Lyle has recently read: 70
   Hal has recently read: 70
hal reads hobj
The current state is: 
   LObj has value: 70
   HObj has value: 10
   Lyle has recently read: 70
   Hal has recently read: 10
lyle writes value 9 to hobj
The current state is: 
   LObj has value: 70
   HObj has value: 9
   Lyle has recently read: 70
   Hal has recently read: 10


[Input of test 4]
read Lyle HObj 40 49
write Hal Lyle 
write Lyle HObj 10
write Hal HObj 33 
read 
write lyle lobj 3
read Hal HObj
write Lyle LObj 92 
read Lyle LObj
read Hal HObj 38
read Hal HObj
write Lyle LObj 82
[Output of test 4]
BadInstruction
The current state is: 
   LObj has value: 0
   HObj has value: 0
   Lyle has recently read: 0
   Hal has recently read: 0
BadInstruction
The current state is: 
   LObj has value: 0
   HObj has value: 0
   Lyle has recently read: 0
   Hal has recently read: 0
lyle writes value 10 to hobj
The current state is: 
   LObj has value: 0
   HObj has value: 10
   Lyle has recently read: 0
   Hal has recently read: 0
hal writes value 33 to hobj
The current state is: 
   LObj has value: 0
   HObj has value: 33
   Lyle has recently read: 0
   Hal has recently read: 0
BadInstruction
The current state is: 
   LObj has value: 0
   HObj has value: 33
   Lyle has recently read: 0
   Hal has recently read: 0
lyle writes value 3 to lobj
The current state is: 
   LObj has value: 3
   HObj has value: 33
   Lyle has recently read: 0
   Hal has recently read: 0
hal reads hobj
The current state is: 
   LObj has value: 3
   HObj has value: 33
   Lyle has recently read: 0
   Hal has recently read: 33
lyle writes value 92 to lobj
The current state is: 
   LObj has value: 92
   HObj has value: 33
   Lyle has recently read: 0
   Hal has recently read: 33
lyle reads lobj
The current state is: 
   LObj has value: 92
   HObj has value: 33
   Lyle has recently read: 92
   Hal has recently read: 33
BadInstruction
The current state is: 
   LObj has value: 92
   HObj has value: 33
   Lyle has recently read: 92
   Hal has recently read: 33
hal reads hobj
The current state is: 
   LObj has value: 92
   HObj has value: 33
   Lyle has recently read: 92
   Hal has recently read: 33
lyle writes value 82 to lobj
The current state is: 
   LObj has value: 82
   HObj has value: 33
   Lyle has recently read: 92
   Hal has recently read: 33

[Input of Test 5]
read lyle lObj 
write Hal Lyle 43
write lyle lObj 40
write hal hObj 54 
read hal lobj
write lyle lbj 22
read Hal hl
write LylefObj 92 
read LyleLObj
read Hal HObj 
write Hal HObj 38
write Lyle LObj 33

[Output of Test 5]
lyle reads lobj
The current state is: 
   LObj has value: 0
   HObj has value: 0
   Lyle has recently read: 0
   Hal has recently read: 0
hal writes value 43 to lyle
The current state is: 
   LObj has value: 0
   HObj has value: 0
   Lyle has recently read: 0
   Hal has recently read: 0
lyle writes value 40 to lobj
The current state is: 
   LObj has value: 40
   HObj has value: 0
   Lyle has recently read: 0
   Hal has recently read: 0
hal writes value 54 to hobj
The current state is: 
   LObj has value: 40
   HObj has value: 54
   Lyle has recently read: 0
   Hal has recently read: 0
hal reads lobj
The current state is: 
   LObj has value: 40
   HObj has value: 54
   Lyle has recently read: 0
   Hal has recently read: 40
lyle writes value 22 to lbj
The current state is: 
   LObj has value: 40
   HObj has value: 54
   Lyle has recently read: 0
   Hal has recently read: 40
hal reads hl
The current state is: 
   LObj has value: 40
   HObj has value: 54
   Lyle has recently read: 0
   Hal has recently read: 0
BadInstruction
The current state is: 
   LObj has value: 40
   HObj has value: 54
   Lyle has recently read: 0
   Hal has recently read: 0
BadInstruction
The current state is: 
   LObj has value: 40
   HObj has value: 54
   Lyle has recently read: 0
   Hal has recently read: 0
hal reads hobj
The current state is: 
   LObj has value: 40
   HObj has value: 54
   Lyle has recently read: 0
   Hal has recently read: 54
hal writes value 38 to hobj
The current state is: 
   LObj has value: 40
   HObj has value: 38
   Lyle has recently read: 0
   Hal has recently read: 54
lyle writes value 33 to lobj
The current state is: 
   LObj has value: 33
   HObj has value: 38
   Lyle has recently read: 0
   Hal has recently read: 54
