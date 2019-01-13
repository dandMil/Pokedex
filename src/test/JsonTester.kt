package test

import org.junit.Test
import java.io.File

@Test
fun readFileAsTextUsingInputStream(fileName: String)
        = File(fileName).inputStream().readBytes().toString(Charsets.UTF_8)