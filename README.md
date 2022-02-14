#News Application

Required application features:  
1. Uses the public API https://newsapi.org  
2. Downloads articles from the business category for Poland  .
3. Saves the downloaded articles to the text file in the format "title: description: author".

My comments:
1. I used Spring and Gradle to build the application.
2. I created an HTTP client to connect to a public API.
3. The application connects, but get wrong response from service probably without any article element. Then the openNewsNewsDto.getArticle() method returns null, so calling another .getTitle() method on null gives a NullPointerException.

To do:
1. Find the cause of the wrong answer.
2. Deserialize JSON to POJO.
3. Provide String values to the writeToFile() method.