package ru.surfstudio.android.build.exceptions

import org.gradle.api.GradleException

class ReleaseNotesForConfigurationException(
        componentName: String
) : GradleException(
        "Component $componentName changed its configuration, but its file release notes file was not changed"
)