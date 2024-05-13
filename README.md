<a name="readme-top"></a>
[![maven][maven-shield]][maven-url]
<!--
*** Maven from A to Z @ixchelruiz & @aalmiray
-->

<!-- PROJECT INFO -->
<br />
<div>
<h3 align="center">Maven from A to Z! </h3>

  <p align="left">
    Apache Maven is an ubiquitous build tool in the Java ecosystem, some even claim it’s the defacto standard build tool. Configuring Maven is deceptively simple, after all it’s just a matter of writing XML, isn’t it? Things look differently when the rubber meets the road. One must know the intricacies of the build lifecycle; how plugins, goals (mojos), and phases come together; rules for dependency resolution; configuration inheritance between parent – child POM files; enhancing the build with profiles; and more. Fortunately we’ll cover all these topics in this workshop. We’ll begin from scratch and move to advanced topics thus by the end of the session you should feel quite comfortable working with Maven.
    <br />
    <br />
    <br />
    <a href="https://github.com/github_username/repo_name/issues">Report Bug</a>
    ·
    <a href="https://github.com/github_username/repo_name/issues">Request Feature</a>
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details open>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About the project</a></li>
    <li><a href="#requirements">Requirements</a></li>
    <li><a href="#agenda">Agenda</a></li>
  </ol>
</details>

<!-- ABOUT -->

## About Apache Maven 

This repository contains examples and general information about Apache Maven behaviour!


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- Requirements  -->

## Requirements

- Java 8, 21?
- IDE

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- Agenda  -->

## Agenda

- <details open>
     <summary>POM</summary>
     <ul>
        <li> <a href="lesson-01/pom.xml">Coordinates</a> · <a href="lesson-01/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
        <li> <a href="lesson-01/pom.xml">Model</a> · <a href="lesson-01/README.md#maven-model"><span class="emoji">&#x1F4D6;</span></a> </li>
        <li> <a href="lesson-02/pom.xml">Properties</a> · <a href="lesson-02/README.md#pom-properties"><span class="emoji">&#x1F4D6;</span></a> </li>
        <li><ul> <li> <a href="lesson-03/pom.xml">Compiler plugin </a> · <a href="lesson-03/README.md"><span class="emoji">&#x1F4D6;</span></a> </li> </ul></li>
     </ul>
   </details>
- <details open>
     <summary>Maven Lifecycle</summary>
     <ul>
        <li> <a href="lesson-04/pom.xml">Phases</a> · <a href="lesson-04/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
        <li> <a href="lesson-05/pom.xml">Plugin goals</a> · <a href="lesson-05/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
        <li> <a href="lesson-06/pom.xml">Command arguments</a> · <a href="lesson-06/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
     </ul>
   </details>
- <details open>
     <summary>Plugins I </summary>
     <ul>
        <li> <a href="lesson-04/pom.xml">Phase bindings </a> · <a href="lesson-04/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
        <li> <a href="lesson-05/pom.xml">Executions </a> · <a href="lesson-05/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
     </ul>
   </details>
- <details open>
     <summary>Plugins II </summary>
     <ul>
        <li> <a href="lesson-06/pom.xml">Phase bindings II </a> </li>
        <li> <a href="lesson-07/pom.xml">Phase bindings III </a> </li>
        <li> <a href="lesson-06/pom.xml">Executions </a> </li>
     </ul>
   </details>
- <details open>
    <summary>Multi-module projects </summary>
    <ul> <li> <a href="lesson-09/pom.xml">Reactor configuration </a> · <a href="lesson-09/README.md"><span class="emoji">&#x1F4D6;</span></a> </li> </ul>
  </details> 
- <details open>
    <summary>Inheritance </summary>
    <ul>
      <li> <a href="lesson-08/pom.xml">Parent POM </a> · <a href="lesson-08/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
      <li> <a href="lesson-14/pom.xml">Revisiting plugins </a> · <a href="lesson-14/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
      <li> <a href="lesson-14/pom.xml">The pluginManagement section </a> · <a href="lesson-14/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
      <li> combine.self & combine.children </li>
    </ul>
  </details>
- <details open>
   <summary> Dependency resolution </summary>
   <ul>
     <li> <a href="lesson-16/pom.xml">Scopes </a> · <a href="lesson-16/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
     <li> <a href="lesson-16/pom.xml">Direct vs. transitive </a> · <a href="lesson-16/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
     <li> <a href="lesson-16/pom.xml">The dependencyManagement section </a> · <a href="lesson-16/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
     <li> <a href="lesson-16/README.md">Exclusions (!!) </a> </li>
   </ul>
  </details>
- <details open>
   <summary> Misc </summary>
   <ul>
     <li> <a href="lesson-18/pom.xml">Profiles </a> · <a href="lesson-18/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
     <li> <a href="lesson-16/pom.xml">BOMs: library vs. stack </a> </li>
     <li> <a href="lesson-15/pom.xml">The Maven wrapper </a> · <a href="lesson-15/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
     <li> <a href="lesson-17/pom.xml">The enforcer plugin </a> · <a href="lesson-17/README.md"><span class="emoji">&#x1F4D6;</span></a> </li>
     <li> The flatten plugin </li>
   </ul>
  </details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[maven-shield]: https://img.shields.io/badge/maven-1000?style=?style=plastic&logo=apachemaven&logoColor=red&labelColor=grey&color=lightgrey

[maven-url]: https://maven.apache.org