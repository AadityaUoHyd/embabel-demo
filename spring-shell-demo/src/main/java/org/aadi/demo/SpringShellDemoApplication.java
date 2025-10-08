package org.aadi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.CommandScan;
import org.springframework.shell.command.annotation.EnableCommand;

@SpringBootApplication
@CommandScan
@EnableCommand
public class SpringShellDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringShellDemoApplication.class, args);
    }

}
