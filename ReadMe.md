###sbt to bazel build 

The sample example to provide a multi-project sbt project build conversion to Bazel build

####Before conversion sbt multi module example structure
`
sbt-multi-module-example/

    common/
        src/
        test/
    users/
        src/
        test/
    project/
        build.properties
        plugins.sbt
    build.sbt
    .gitignore
    .scalafmt.conf
    ReadMe.md
`