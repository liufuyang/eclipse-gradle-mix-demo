plugins {
  id("gradle.test.java-application-conventions")
}

group = "com.example"
version = "0.0.1"

sourceSets {
    main {
        java {
            setSrcDirs(listOf("src"))
        }
        resources {
            setSrcDirs(listOf("src"))
        }
    }
}

application {
    mainClass.set("p1.P1")
}
