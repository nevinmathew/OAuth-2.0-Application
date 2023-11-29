# OAuth-2.0-Application

## Overview
This is a spring boot application with MongoDB database which demonstrates email and password based login connecting to authorize using the OAuth 2.0 authentication standard as well as add social login to your spring boot application using the new OAuth2 functionalities provided in Spring Security.

## Table of Contents

- [Languages and Tools](#languages-and-tools)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Configuration](#configuration)
- [License](#license)

## Languages and Tools
<h3 align="left">Languages and Tools:</h3>
<table>
    <tbody>
        <tr valign="top">
            <td> <p align="left"> <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/java/java-icon.svg" title="Java" alt="java" width="40" height="40"/> </a> </td>
            <td> <a href="https://spring.io/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" title="Spring Boot" alt="spring" width="40" height="40"/> </a> </td>
            <td> <p align="left"> <a href="https://www.mongodb.com/" target="_blank" rel="noreferrer"> <img src="https://s3-symbol-logo.tradingview.com/mongodb--big.svg" title="MongoDB" alt="MongoDB" width="40" height="40"/> </a> </td>
        </p>
        </tr>
    </tbody>
</table>

## Features

- **OAuth2 Integration:** Secure authentication using OAuth2 with support for Google and Facebook.
- **MongoDB Persistence:** Store user and client details in a MongoDB database.
- **Spring Cloud Support:** Enables service discovery and configuration management with Spring Cloud Config.

## Getting Started

### Prerequisites

Make sure you have the following installed:

- Java 8
- Maven
- MongoDB
- (Optional) Spring Cloud Config Server

### Configuration

Update the application configuration in `application.yml` and `bootstrap.yml` with your specific settings, including MongoDB details and OAuth2 client credentials.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
