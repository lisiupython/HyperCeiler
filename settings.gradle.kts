@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://api.xposed.info")
        maven("https://mirrors.tuna.tsinghua.edu.cn/maven/")
        // 如果仍想保留阿里云镜像，务必放最后
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/public")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://api.xposed.info")
        maven("https://mirrors.tuna.tsinghua.edu.cn/maven/")
        // 同样，阿里云镜像放最后
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/public")
    }
}

rootProject.name = "HyperCeiler"
include(":app", ":hidden-api", ":app:processor")
