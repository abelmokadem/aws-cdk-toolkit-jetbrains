package com.github.abelmokadem.awscdktoolkitjetbrains.services

import com.intellij.openapi.project.Project
import com.github.abelmokadem.awscdktoolkitjetbrains.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
