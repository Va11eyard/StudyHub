# StudyHub

The project is a software for teaching English, which is implemented in an IDE terminal. 

Each of the design patterns is distributed according to its own packages. There are 6 of them in total:

- **Singleton**: To ensure that there is only one instance of the app running.

- **Strategy**: To allow students to choose different learning strategies, such as conversation learning or grammar learning.
  
- **Decorator**: To add additional functionality to exercises, such as timing them.
  
- **Adapter**: To allow the app to use existing English learning tools.

- **Observer**: To notify students when new exercises are available.
  
- **Factory**: To create different types of exercises without having to write a separate class for each type.

**Usage**
-----------
To use the app, simply run the Main class. The app will start up and display a list of available exercises. You can then choose an exercise to complete.

### Adapter
The `EnglishLearningAppAdapter` class adapts the `EducationalApp` class to the `EnglishLearningTool` interface. This allows the app to use existing English learning tools that implement the `EnglishLearningTool` interface.

### Decorator
The `TimeDecorator` class decorates other exercises to add timing functionality. This allows you to track how long it takes you to complete an exercise.

### Factory
The `ConcreteExerciseFamilyFactory` class creates different types of exercise factories, such as question factories and vocabulary test factories. This allows you to create different types of exercises without having to write a separate class for each type.

### Observer
The `LearningPlatform` class implements the observer pattern to notify students when new exercises are available.

### Singleton
The `EducationalApp` class is implemented as a singleton to ensure that there is only one instance of the app running.

### Strategy
The `ConversationLearningStrategy` and `GrammarLearningStrategy` classes implement the strategy pattern to allow students to choose different learning strategies.

--------------------------------------------------------------------------------------------------------------------------------------------

**License**

This project is licensed under the MIT License.

**Diagram**

![Diagram](https://github.com/Va11eyard/StudyHub/assets/116872985/a4845e45-fdb7-407e-9fcf-b53bc96d6e47)
