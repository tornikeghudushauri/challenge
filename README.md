# chalange
Hello,
This is the app to retrieve the list of stack overflow users meeting the given criteria.

## Table of Contents
- [Overview](#overview)
- [Technologies](#technologies)
- [Usage](#usage)
- [Configuration](#configuration)

## Overview

This project leverages mock data alongside the Stack Overflow API to enhance the functionality and reliability of the application. Due to the limitations of the Stack Overflow API, which provides only a subset of users at a time, incorporating mock data ensures a more comprehensive dataset for the application to utilize. The decision to utilize mock data facilitates thorough testing of the application's business logic and improves its overall robustness.


## Technologies

Kotlin
Spring Boot
Retrofit
Gradle
Gson.

## Usage

Once you have cloned the project run it and filtered data will appear on the console.


## Configuration

In the ApplicationProps class, there are three configuration options that users may need to customize:

1.baseUrl: This represents the base URL of the Stack Exchange API. Users may need to change this URL if they are using a different API or a different version of the Stack Exchange API.

2.mockDataUrl: This specifies the file path to the JSON file containing mock data for testing purposes. Users may need to update this path to point to the correct location of their mock data file.

3.useMockData: This boolean flag determines whether to use mock data instead of fetching data from the actual Stack Exchange API. Users can set this flag to true if they want to use mock data. Otherwise, they can set it to false to fetch data from the real API.
