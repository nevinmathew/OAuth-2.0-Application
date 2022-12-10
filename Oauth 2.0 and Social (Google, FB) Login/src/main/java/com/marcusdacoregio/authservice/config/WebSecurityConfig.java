package com.marcusdacoregio.authservice.config;

import com.marcusdacoregio.authservice.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
        http
            .formLogin()
            .permitAll()
            .and()
        	.authorizeRequests()
            .antMatchers("/oauth/**").permitAll()
            .antMatchers("/oauth2/authorization/**").permitAll()
            .anyRequest().authenticated()
        	.and()
    		.oauth2Login()
    		.and()
        	.csrf().disable();
    }
    
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // @formatter:offs
//        http
//                .authorizeRequests()
//                .antMatchers("/oauth/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .csrf().disable();
//        // @formatter:on
//    }
//    
//	@Override
//	public void configure(HttpSecurity httpSecurity) throws Exception{
//		
//		httpSecurity
//		.antMatcher("/**").authorizeRequests()
//		.antMatchers("/").permitAll()
//		.anyRequest().authenticated()
//		.and()
//		.formLogin().permitAll()
//		.and()
//		.oauth2Login();
//	}

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder());
    }
    
    @Override
    public void configure(WebSecurity webSecurity) throws Exception {
        webSecurity
                .ignoring()
                .antMatchers("/resources/**"
                        , "/templates/**"
//                        , "/login"
                        , "/logout"
                        , "/ui/**"
                        , "/401.html"
                        , "/404.html"
                        , "/500.html"
                        , "/oauth2/authorization/**");
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
