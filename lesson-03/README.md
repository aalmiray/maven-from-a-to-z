# Lesson 03

## Compiler plugin

The Compiler Plugin is used to compile the sources of your project. Since 3.0, the default compiler is ``javax.tools.JavaCompiler`` (if you are using java 1.6) and is used to compile Java sources. If you want to force the plugin using ``javac``, you must configure the plugin option ``forceJavacCompilerUse``.

Default source setting is 1.8 and the default target setting is 1.8, independently of the JDK you run Maven with.

**Note:** Maven 3.0 will issue _warnings_ if you do not specify the version of a plugin.