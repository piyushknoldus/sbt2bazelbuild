load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_test")

scala_library(
    name = "users",
    srcs = ["src/main/scala/io/knoldus/UserInfo.scala"],
    visibility = ["//:__pkg__"],
    deps = [
        "//3rdparty/jvm/joda_time",
        "//common",
    ],
)

scala_test(
    name = "test-main",
    srcs = ["src/test/scala/io/knoldus/UserInfoSpec.scala"],
    deps = [":users"],
)