### sbt to bazel build 

The sample example to provide a multi-project sbt project build conversion to Bazel build

#### Before conversion sbt multi module example structure
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

### Run project
`bazel run //:sbt2bazel`

### TO build 
`bazel build //...`

### Test
`bazel test //...`

#### Test individual modules
Common Module
`bazel test //common:test-common`

User Module
`bazel test //users:test-main`

#### To check dependency graph
`bazel query --noimplicit_deps "deps(//:sbt2bazel)" --output graph`

#### To check coverage
`bazel coverage \
 --extra_toolchains="@io_bazel_rules_scala//scala:code_coverage_toolchain" \
 --combined_report=lcov \
 --coverage_report_generator="@bazel_tools//tools/test/CoverageOutputGenerator/java/com/google/devtools/coverageoutputgenerator:Main" \
 //...
`

#### To view report -
`lcov --list PAHT_TO_GENERATED_COVERAGE.DAT`


#### After conversion bazel multi module example structure
We will be working on a project with this structure:
├── BUILD
├── WORKSPACE
|── 3rdparty
├── users
│   ├── BUILD
│   └── src
│       ├── main
│       │ └── scala
│       │ └── io.knoldus
│       │     └── userInfo.scala
│       └── test
│           └── scala
│               └── io.knoldus
│                   └── userInfoSpec.scala
├── dependencies.yaml
└── common
    ├── BUILD
    └── src
        ├── main
        │   └── scala
        │       └── util
        │           └── Utils.scala
        └── test
            └── scala
                └── util
                    └── UtilsSpec.scala