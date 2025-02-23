# LoveAlgorithms

Welcome to **LoveAlgorithms** – a playful Java project that uses coding metaphors to debug emotional code and foster growth into your routine

## Features
- **Rescue from broken**: Identify parts of your emotional code needing refactoring
- **Foster growth**: Add new features like affirmations or self-care routines
- **Maths & Metrics**: Calculate your emotional "version" for progress tracking
- **LDR Magic**: Sync progress with your partner through "code reviews"

## How it works
1. **Greets you with an affirmation** to set a positive tone
2. Asks for a **new feature** to add to your emotional API
3. Prompts you to describe why you feel **"broken"** (using playful error logging)
4. Generates a **personalised action plan** with metrics and next steps

## Setup

### Prerequisites
- Java 11+
- Maven (optional)

### Running the programme

#### Using the command line:
1. Compile:
   javac -d out src/main/java/com/example/love/LoveAlgorithms.java
   text
2. Run:
   java -cp out com.example.love.LoveAlgorithms
   text

#### Using maven:
mvn clean compile exec:java -Dexec.mainClass="com.example.love.LoveAlgorithms"
text

## How to contribute 💌
1. Fork this repository
2. Create new branch: `feature/[your-name]-response`  
   (e.g. `feature/anya-response`)
3. Add your answers to `responses/` directory in format:  
   `YYYY-MM-DD-[name]-response.txt`
4. Submit pull request with your emotional debug results

## Example output
`````
Welcome to LoveAlgorithms!
====================================
Affirmation: 'Our love is the best algorithm — even when variables feel undefined.'
Let’s debug your emotional code and co-author a better version!

[Feature Request] What new feature would you like to add to your emotional API?
Examples: Daily affirmations, mindfulness check-ins, weekly gratitude logs
Your Feature: 

[Debug Log] Why do you feel broken? Please describe your emotional stack trace:
Example: 'NullPointerException in self-confidence module'
Your Reason: 

Deploying your Emotional Upgrade Protocol...

=== Personalised Action Plan ===
1. Feature to Integrate: 
    - Schedule daily implementation for 21 days
2. Error to Refactor: 
    - Allocate 10 mins/day for mindfulness debugging
3. LDR Magic: Sync progress via weekly video call code reviews
4. Your New Version: LoveOS v1.2.00
   ====================================
   Note: Love is a continuous integration project. Keep committing!

    ******       ******
  **********   **********
 ************ ************
***************************
 *************************
  ***********************
   *********************
    *******************
      ***************
        ***********
          *******
            ***
             *
`````

## Future ideas
- Add a GUI with progress charts
- Integrate with Between/Instagram for daily affirmations
- Track emotional "commits" over time

---

**Happy debugging** 🐛💖  
*— Anya*