# gitHubSearch
This is a Web App created using React for FrontEnd and Java SpringBoot for BackEnd

Steps for setting up:
1) clone the repository
2) open the server folder within the downloaded folder with Java IDE, eg Intellij
3) In Intellij File Explorer panel, go to \src\main\java\com\example\GitHubSearch right-click on GitHubSearchApplication.java
4) select 'Run GitHubSearchAp….main()’
4) open the client folder within the downloaded folder with Visual Studio Code
5) in the VSC terminal, type 'npm i'
6) then type 'npm start' and wait for the page to load on the browser

You may now type a name on the input box to search for users in GitHub.

Important Note:

Please allow 1 min interval for each search attempt as only 10 request is allowed per min. This is the limit set for the API.
You may refer to https://docs.github.com/en/rest/search#rate-limit for more details.

If you encounter any error, simply wait for a minute before attempting the search again.
