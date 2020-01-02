package cz.reactive.stock.serverreactive

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServerReactiveApplication

fun main(args: Array<String>) {
    runApplication<ServerReactiveApplication>(*args)
}
