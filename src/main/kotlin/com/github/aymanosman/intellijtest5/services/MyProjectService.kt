package com.github.aymanosman.intellijtest5.services

import com.intellij.openapi.project.Project
import com.github.aymanosman.intellijtest5.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
