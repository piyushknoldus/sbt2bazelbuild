load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_test")

scala_library(
    name = "common",
    srcs = glob(["src/main/scala/util/*.scala"]),
    visibility = ["//users:__pkg__"],
    deps = [],
)

scala_test(
    name = "test-common",
    srcs = ["src/test/scala/util/UtilsSpec.scala"],
    deps = [":common"],
)
