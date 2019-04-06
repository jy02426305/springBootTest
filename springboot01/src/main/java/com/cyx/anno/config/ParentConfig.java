package com.cyx.anno.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {JavaConfigA.class,JavaConfigB.class})
public class ParentConfig {

}
