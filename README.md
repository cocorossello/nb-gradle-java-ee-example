# nb-gradle-java-ee-example

When imported to netbeans, JSF should be recognized and autocompletion should work in index.xhtml file. Java EE version is hardcoded in current version of gradle java EE plugin, but I think that it should be inferred from the xsi:schemaLocation of the beans.xml file (and just provide a default java EE 7 if it does not exist).

The project works as is and can be deployed in a Tomee by just copying the war file into the webapp
