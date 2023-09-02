# YAML-Editor-For-Java
This package can be used to read and write into yaml file.

- --
There are two main ways you can write data in the yaml file.
- --

- The Normal way :
  
```java
{Key1 = value1, key2 = value2, key3 = value3}
```
- or the dynamic way
```java
key1 : value1
key2 : value2
key3 : value3
```

- --
- [Download Jar File ](https://github.com/sagarbhusal01/YAML-Editor-For-Java/releases)
- --

# How to use it?


- First you have to download the jar file from this repo and place it in the project file.
- After that you have to add that jar file as a dependencies into your project.
- Then create an object for the YAML

```java
  YAML yaml=new YAML();
```

- Then set the mode of the Yaml read and Write operation

```java
//either 

yaml.setMode("normal");

//or 
yaml.setMode("dynamic");

//Dynamic mode will set as default mode if setMode is not called 
```
- Set the path of the yaml file 
```java
String Path="YAML.yaml";
```
- To write into the file, create a HashMap

```java
        HashMap<String,String> MappedData = new HashMap<>();
        MappedData.put("Name","Sagar bhusal");
        MappedData.put("Type1","Awesome1");
        MappedData.put("Type2","Awesome2");
        MappedData.put("Type3","Awesome3");
        MappedData.put("Type4","Awesome4");
```

-Then pass the data and path into the Writer method
```java
yaml.Writer(MappedData,Path);
```
- For reading the data from the file create a empty hashmap
```java
  HashMap<String,String> ReadData = new HashMap<>();
```
- Then call
```java
ReadData = yaml.Reader(Path);
```
