/*
An IntelliJ IDEA language support plugin for Nasal.
Copyright (C) 2024  BobDotCom

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/
plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm") version "1.9.21"  // TODO: Update this to 2.0.21
  id("org.jetbrains.intellij.platform") version "2.1.0"
}

group = "com.bobdotcom"
version = "2024.10.21"

repositories {
  mavenCentral()

  intellijPlatform {
    defaultRepositories()
  }
}

dependencies {
  intellijPlatform {
    create("IC", "2024.2")
//    intellijIdeaCommunity("2023.3")

    bundledPlugin("com.intellij.java")

    pluginVerifier()
//    zipSigner()
    instrumentationTools()

//    testFramework(TestFrameworkType.Platform)
  }
}

sourceSets["main"].java.srcDirs("src/main/gen")

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellijPlatform {
  pluginConfiguration {
    ideaVersion {
      sinceBuild = "231"
//      untilBuild = "241.*"
    }
  }

  pluginVerification {
    ides {
      recommended()
    }
  }

  publishing {
    token = System.getenv("PUBLISH_TOKEN")
  }

  signing {
    certificateChainFile = file("certificate/chain.crt")
    privateKeyFile = file("certificate/private.pem")
    password = System.getenv("PRIVATE_KEY_PASSWORD")
  }
}

tasks {
  // Set the JVM compatibility versions
  withType<JavaCompile> {
    sourceCompatibility = "17"
    targetCompatibility = "17"
  }
  withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
  }
}
