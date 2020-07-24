####Syntax Encompassing Documentation

![java](java-syntaxSheet.jpg)

![javaString](JavaString-syntaxSheet.jpg)

![javaEncompassing](JavaCheatSheet.pdf)

How to read a file through main:

```
	File fileReceived = new File(args[0]);
	//Initialize scanner
    Scanner sc = null;
    //Try to create scanner that contains parameters, ie passing in, fileReceived 
    		//catch FileNotFoundException errors in the process
    try {
        sc = new Scanner(fileReceived);
    } catch (FileNotFoundException e) {
    }
	//Loop that will iteratively read the file until it does not contain a subsequent line
    while (sc.hasNextLine()) {
    	//Grab individual line of the file as String Data Type
    		String dataonfile = sc.next();
    		//Convert line string data(dataonfile) to integer for the ability to add to the class variable integerset
    			Integer dataConversion = Integer.parseInt(dataonfile);
    			//call setter method to add to the array
        		instancecounter.setarraylist(dataConversion);
    }


```

Static VS Instance Methods Java:

STATIC: A Static Method Belongs to a class rather than an instance of a class. The method is accessible to every instance of a class, but methods defined in an instance are only able to be accessed by that member of a class.

INSTANCE: Methods that require an object of its class to be created before calling it is called as  Instance methods. To invoke a instance method, we have to create an Object of the class in within which it defined
