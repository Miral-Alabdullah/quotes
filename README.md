# quotes

## Lab - 08


The application reads a file called `recentquotes.json` that contains random popular book quotes. Each time the application runs, a new random quote will be returned in a specific formatted string consists of the quote itself and the author of that quote. 

```
 “I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love.” 
     -Marilyn Monroe

```

<br>
<hr>
<br>


### Instructions of how to install dependencies and run the app after someone clones the repo => 

- Create a directory. 

- cd to that directoy.

- Clone the reopresitory there. 

- Run this `gradle init --type java-application`. 

- Choose Groovy as DSL. 

- Choose JUnit 4 as a framewrok.

- Set The package name and the project name. 

- Open the project with Intellij. 

- Setup SDK.

- Determine the gradle version. 

- Build the application. 

- Write the code. 

- Run the code either from the Intellij or by Running this command in the terminal `./gradlew run` inside the project directory.

<br>

For Dependencies : 

<br>

```

dependencies {
    // Use JUnit test framework.
    testImplementation 'junit:junit:4.13.2'

    // This dependency is used by the application.
    implementation 'com.google.guava:guava:30.1-jre'

    implementation 'com.google.code.gson:gson:2.8.7' //For Gson
}

```
<br>

- Add this on the top of the class `import com.google.gson.Gson;`


<br>
<hr>
<br>


## Lab - 09

Updated version of lab - 08: rather than using a hardcoded file of JSON data with quotes, this version grabs quotes from an API and displays those to the user.

The used [URL](http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en) in application.

```
He who is fixed to a star does not change his mind.  
     -Leonardo da Vinci

```





> Collaborators: 


>> Ayyoub Aleyyam.

>> Dawood Bashar.

>> Miral Al-Abdullah.
