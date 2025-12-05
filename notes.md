For CI pipeline don't rely on docker. but use JIB

<!-- snippet to place in build/plugins -->
<plugin>
  <groupId>com.google.cloud.tools</groupId>
  <artifactId>jib-maven-plugin</artifactId>
  <version>3.4.0</version> <!-- or newer -->
</plugin>

dockerbuild > local registry | build > push to remote registry
mvn -Dimage=myregistry/hello-java8:1.0 compile com.google.cloud.tools:jib-maven-plugin:build

