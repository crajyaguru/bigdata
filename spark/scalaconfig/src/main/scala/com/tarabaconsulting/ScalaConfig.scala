package com.tarabaconsulting

import com.typesafe.config.ConfigFactory

object ScalaConfig {
  def main (args:Array[String]) {
    val appConf = ConfigFactory.load()
    val env = appConf.getString("env")
    println ("urls and ports for both environments are defined in the application.properties")
    println ("dev.url and dev.port "+appConf.getString("dev.url")+":"+appConf.getString("dev.port"))
    println ("prod.url and prod.port "+appConf.getString("prod.url")+":"+appConf.getString("prod.port"))
    
    println (s"let's create another config at path = $env using this line: val envSpecificConf = appConf.getConfig(env)")
    
    val envSpecificConf = appConf.getConfig(env)
    println (s"now we have a conf that has all the properties with prefix $env so no need to access properties using a prefix as in dev.url and prod.url. Just access them without the prefix as in url and port")
    println ("\ngetString(\"url\") and getString(\"port\") without any prefix will automatically retrieve values for "+env)
    println (s"url and port in $env "+envSpecificConf.getString("url")+":"+envSpecificConf.getString("port") )
  }
  
}
