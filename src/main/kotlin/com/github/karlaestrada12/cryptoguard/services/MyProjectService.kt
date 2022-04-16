package com.github.karlaestrada12.cryptoguard.services

import com.intellij.openapi.project.Project
import com.github.karlaestrada12.cryptoguard.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
