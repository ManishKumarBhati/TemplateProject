package com.github.manishkumarbhati.templateproject.services

import com.github.manishkumarbhati.templateproject.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
