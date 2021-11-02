package com.github.xiongjl.intellijplatformpluginsdktomodel.services

import com.intellij.openapi.project.Project
import com.github.xiongjl.intellijplatformpluginsdktomodel.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
