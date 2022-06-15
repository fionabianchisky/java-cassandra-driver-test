# Java Driver Test

## Overview

Simple test code to show how to build Java with the Cassandra driver.


## Quickstart

On a Mac install the build tools using the following

```
brew install maven
```

This will also get the openjdk-18 package aswell.

On Linux using the package manager to install `maven` and the appropriate
`openjdk-jdk` version.  Use version 11 or above. 

__NOTE:__ The pom file is configured to build Java version 11 code.

To compile the code run this

```
mvn compile
```

To assembly all the dependencies into one jar file

```
mvn assembly:assembly -DdescriptorId=jar-with-dependencies
```

Run the code

```
java -jar target/driver-test-0.0.1-jar-with-dependencies.jar
```


## References

### Cassandra

* DataStax Cassandra [java driver 4.14 docs](https://docs.datastax.com/en/developer/java-driver/4.14/manual/core/)


### Maven

* Creating [single executable jar with dependencies](https://stackoverflow.com/questions/1729054/including-dependencies-in-a-jar-with-maven)


