# Scala Config
An example showing how to read properties file in Scala using [ConfigFactory](https://github.com/typesafehub/config).

## Prerequisites
1. Make sure sbt is installed <http://www.scala-sbt.org/>.
2. Make sure <sbt_install>/bin is in the path.

## To run
1. Check out the code.
2. Note the following line in build.sbt: ```libraryDependencies += "com.typesafe" % "config" % "1.3.1"```. This is what allows us to use [ConfigFactory](https://github.com/typesafehub/config).
3. Note the properties file ```application.properties``` in ```src/main/resources```. 
4. At the prompt change to scalaconfig directory where the build.sbt file is, type ```>sbt run```. This should print url and port for the dev environment because in the properties file ```env=dev```
5. Change this value to ```env=prod``` and use ```>sbt run``` again. This should print prod specific values.
6. Notice in the code we can simply access the properties using ```envSpecificConf.getString("url")``` and ```envSpecificConf.getString("port")``` even though there are no properties url and port defined in the application.properties file.
7. The [ConfigFactory](https://github.com/typesafehub/config) allows us to set the config at dev or prod level.

## Uses
This is really useful in reading environment specific properties without having to specify multiple properties file.
