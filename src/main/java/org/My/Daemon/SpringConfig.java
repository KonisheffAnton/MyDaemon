package org.My.Daemon;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.My.Daemon")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
