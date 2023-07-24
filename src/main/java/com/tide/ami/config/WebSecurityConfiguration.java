package com.tide.ami.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
        		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) 
            .and()
            	.httpBasic().disable()
            	.cors().configurationSource(corsConfigurationSource())
            .and()
            	.authorizeRequests()
            	.antMatchers("/api/**").permitAll()
            	.antMatchers("/test/**").permitAll()
            	//.antMatchers("/api/login").authenticated()
            	//.anyRequest().authenticated() 
//            .and()
//            	.formLogin()
//            	.loginPage("/login")
//            	.permitAll()
//            .and()
//            	.logout()
//            	.permitAll()
            .and()
            .csrf().disable();
    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//            .withUser("foo").password("{noop}bar").roles("USER");
//    }
    
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);
        return source;
    }
    
//	@Bean
//	public UserDetailsService userDetailsService() {
//		/* @formatter:off */
//		UserDetails user =
//			 User.withDefaultPasswordEncoder()
//				.username("user")
//				.password("password")
//				.roles("USER")
//				.build();
//		/* @formatter:on */
// 
//		return new InMemoryUserDetailsManager(user); // 메모리에 사용자 정보를 담는다.
//	}
    
}