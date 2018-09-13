// LANGUAGE_VERSION: 1.3

suspend fun dummy() {}

val c: suspend () -> Unit = {
    dummy()
    dummy()
}

// 1 LOCALVARIABLE this LThisAndResultInLvtKt\$c\$1; L0 L18 0
// 1 LOCALVARIABLE result Ljava/lang/Object; L0 L18 1