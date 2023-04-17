package site.pomodoroapp.pomodoroApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PomodoroAppApplication

fun main(args: Array<String>) {
	runApplication<PomodoroAppApplication>(*args)
}
