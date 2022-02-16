#News Application

Attention!
New (and working) version of News application is here:
https://github.com/robertgluszkiewicz/news-v2.0

To be fair, in this repository I only edited the README.md file and added the new version of working application to the new repository.



Required application features:
1. Uses the public API https://newsapi.org
2. Downloads articles from the business category for Poland  .
3. Saves the downloaded articles to the text file in the format "title: description: author".

My comments:
1. I used Spring and Gradle to build the application.
2. I created an HTTP client to connect to a public API.
3. The application connects, but get wrong response from service probably without any article element. Then the openNewsNewsDto.getArticle() method returns null, so calling another .getTitle() method on null gives a NullPointerException.

To do:
1. Find the reason of the received wrong response.
2. Deserialize received JSON wit articles to POJO.
3. Provide String values from POJO to the writeToFile() method.