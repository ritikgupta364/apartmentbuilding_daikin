Features
Room Management:

Each room has a unique ID, current temperature, and heating/cooling status.

Rooms can be apartments (with an owner's name) or common rooms (e.g., Gym, Library, Laundry).

Building Management:

A building can have multiple apartments and common rooms.

The building has a requested temperature, which determines whether heating or cooling is enabled in each room.

Dynamic Updates:

The system recalculates heating/cooling status when the requested temperature changes.

Room temperatures can be updated over time (optional feature).

Prerequisites
Java Development Kit (JDK): Version 17 or higher.

Gradle: For building and running the project.

Docker (optional): For containerizing the application.


Getting Started
1. Clone the Repository
bash
Copy
git clone https://github.com/your-username/apartment-building.git
cd apartment-building
2. Build the Project
To build the project using Gradle:

bash
Copy
./gradlew build
3. Run the Application
To run the application:

bash
Copy
./gradlew run
4. Run with Docker (Optional)
Build the Docker image:

bash
Copy
docker build -t apartment-building .
Run the Docker container:

bash
Copy
docker run apartment-building
Project Structure
Copy
apartment-building/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── Room.java
│   │   │           ├── Apartment.java
│   │   │           ├── CommonRoom.java
│   │   │           ├── Building.java
│   │   │           └── Main.java
│   │   └── resources/
│   └── test/
│       └── java/
├── build.gradle
├── Dockerfile
└── README.md
Usage
Initial Setup:

The building is initialized with 2 apartments (101 and 102), a Gym, and a Library.

The default requested temperature is 25.0°C.

Change Requested Temperature:

The application allows you to input a new requested temperature.

Heating or cooling is enabled in each room based on the new temperature.

Add Rooms:

You can dynamically add new apartments or common rooms to the building.

Assumptions
Room Temperature:

Initial room temperatures are randomly generated between 10°C and 40°C.

Heating/Cooling Logic:

Heating is enabled if the room temperature is below the requested temperature.

Cooling is enabled if the room temperature is above the requested temperature.

If the room temperature is within ±1°C of the requested temperature, neither heating nor cooling is enabled.


