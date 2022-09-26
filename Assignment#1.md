# assignment-1_Review
## first step : ##
Initially 3 Folder were created (Controller, Model , Service)
In the firt folder, the model , 1- a general folder has been created with the (student file) 
                   2- Master student file 
                   3- Medical student file
                   4- Engeneering student file
                   5- Student list file
In the second folder, the Service , 1- interface folder has been created with the (student interface file) 
                        2- student service file 
In the third folder, the Controller , 1- a student controller file

## second step : ##

In the model folder
**at first** - the student file  was filled out, 1- properties : int id , string name , localDate Date of birth then Created (set,get function) for                                                                      all of them
                                             2- behaviours: Override equals ,  getAge , print 
                                             * Override  equals : take prameter from type object student and create other object in same type then compare all                                                        properties if equals then return boolean datatype. 
                                             * getAge : compute age between( localdate now and get date of birth) and return age
                                             * print :system out get name , get id , get date of birth
**At second** - list student file was filled out , 1- properties: list of student called students
                                               2- behaviours: findById,addStudent,removeStudent
                                               *findById : take one prameter int id , this function سearches for the student in the listStudent using the ID then                                                      return student.
                                               *addStudent : take student as parameter to add him to the list student, this function return list student
                                               *removeStudent : take two parameters(student, id) then find the student using student id to remove student to the list                                                   student, this function return list student after removing
                                               **These functions will be called in the service file**
**At third**- 1- Master student file : 1- properties : research, supervisor as string 
                                   2- behaviours :#submitResearch : take research and print "student adds a research paper"
                                                 #getSupervisor : return supervisor as string 
          2- Medical student file :1-properties: research as string , object hospital
                                   2- behaviours :#submitResearch : take research as string 
          3- Engeneering student file :1- properties : lab as string 
                                   2- behaviours :#submitLab : take lab and print "lab has been submit."
          4- Hospital file : Name as strimg , id as integare, number as long 
                                                
                                                                                           
## third step ##

In the Service folder 
**at first** - the Student service was filled out : 1- properties **static** : addCounter: Counting counter for each student addition
                                                                              retrieveCounter : Counting counter for each student retrieval
                                                                              removeCounter : Counting counter for each student deletion
                                                    2-behaviours : 1- addStudent :take two parameters liststudent(للاضافة عليها),student(الطالب الذي نريد اضافته)                                                                          return studentlist(بعد الاضافة), this function call addStudnet function from student list file and                                                                      addCounter plus plus(عند كل عملية اضافة).
                                                                   2-retrieveStudent :take one parameter liststudent(لاسترجاع معلومات الطالب منها ),                                                                                        return studentlist(معلومات الطالب), and retreveCounter plus plus(عند كل عملية استرجاع).
                                                                   3-removeStudent : take three parameters liststudent(للحذف منها ),                                                                                                       student(لتحديد الطالب الي نريد حذفه), student id (لايجاد الطالب الذي نريد حذفه)
                                                                    return studentlist(بعد الحذف), this function call removeStudnet function from student list file                                                                       and removeCounter plus plus(عند كل عملية حذف).
                                                                   4-report : Report on the number of students that have been added, deleted and retrieved
                                                                   5-getAge : take two parameter student list and student , this function is search the student using                                                                                 the ID, if found called function getAge from student file then return age else return                                                                                   zero
                                                                   6-print : this function print all the information for the student
at second - the interfaces folder contains the student interface file : It contains all the functions( addStudent ,retrieveStudent ,removeStudent ,report ,print ,getAge) in the studentService file without an implementation.

## forth step ##

In the Controller folder : this file is all functions have been callded (report ,equls ,removeStudent ,retrieveStudent ,addStudent ,print ,getAge)
                   
