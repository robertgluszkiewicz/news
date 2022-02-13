#News Application

Required application features:  
1. Uses the public API https://newsapi.org  
2. Downloads articles from the business category for Poland  
3. Saves the downloaded articles to the text file in the format "title: description: author"


My comments:

1. I used Spring and Gradle to build the application.
2. I created an HTTP client to connect to a public API
3. The application connects, but I have not been able to convert the downloaded JSON to POJO.