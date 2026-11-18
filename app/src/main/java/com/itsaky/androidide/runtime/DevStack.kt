package com.itsaky.androidide.runtime

/**
 * Development toolchains that can be installed on demand in the PRoot Ubuntu runtime.
 */
enum class DevStack(
    val label: String,
    val description: String,
    val installsSummary: String,
) {
    WEB(
        "Web (JavaScript / TypeScript)",
        "Websites and web apps with HTML, CSS, and JS frameworks.",
        "Node.js and npm (already included)",
    ),
    PYTHON(
        "Python",
        "Scripts, automation, data work, and Python backends.",
        "python3, pip, venv, and build tools",
    ),
    ANDROID(
        "Android (Java / Kotlin)",
        "Build Android app projects and install them directly on this phone.",
        "JDK 17, ARM64 Android SDK 36, Build Tools 35, Gradle 8.14.3, and an offline Maven cache",
    ),
    CPP(
        "C / C++",
        "Fast compiled programs, algorithms, and systems code.",
        "gcc, g++, make, cmake, gdb",
    ),
    PHP(
        "PHP",
        "Websites and apps with PHP — classic sites and Laravel projects.",
        "php-cli, common extensions, and Composer",
    ),
}

enum class AgentKind(
    val stableId: String,
    val title: String,
    val subtitle: String,
    val downloadNote: String,
) {
    CLAUDE_CODE(
        "claude-code",
        "Claude Code",
        "Anthropic's coding agent · broad provider support",
        "71.8 MB",
    ),
    DEEPSEEK_HARNESS(
        "deepseek-harness",
        "DeepSeek Harness",
        "Official DeepSeek coding agent · API-key providers",
        "26.5 MB",
    ),
    ANTIGRAVITY(
        "antigravity",
        "Antigravity CLI",
        "Google's official coding agent · Google account",
        "39.9 MB",
    ),
    ;

    companion object {
        fun fromStored(value: String?): AgentKind = entries.firstOrNull {
            it.stableId == value || it.name == value
        } ?: CLAUDE_CODE
    }
}
