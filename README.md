# Sample Mobile Framework

Prerequisites

Mac OS: Ensure your Mac OS is up to date to avoid compatibility issues.
Java Development Kit (JDK): Install JDK to compile and run the Java-based test scripts.


1. Setting up Eclipse IDE & JAVA
Install Eclipse IDE: Download and install Eclipse IDE for Java Developers from Eclipse Downloads.
Configure Java in Eclipse: Make sure that the JDK is configured properly in Eclipse to use the installed JDK.


2. Install TestNG in Eclipse
Eclipse Marketplace: Go to Eclipse Marketplace under the Help menu.
Search and Install: Search for "TestNG" and install the plugin following the on-screen instructions.


3. Emulator Setup
Minisim on Mac: Use Minisim for simulating Android devices. Download and install it from Minisim GitHub Repository.


4. Appium Installation
Install Appium: Download and install Appium from Appium.io.
Appium Driver: Ensure the Appium driver for Android is installed.
Appium Inspector: Install Appium Inspector to inspect UI elements.
Appium Doctor: Install Appium Doctor to diagnose and fix common installation issues.
Mac Security Settings: Adjust your Mac's security settings to allow apps downloaded from identified developers.


5. Configure and Run Tests
Clone the Repository: Clone the GitHub repository using:
bash
Copy code
git clone https://github.com/zaidshk/Sample_Wallet_Test_POM/tree/main
Install Dependencies: Navigate to the project directory and install any required dependencies.


6. Identify App Package and Activity
Get App Package & Activity Name:
Connect your Android device or start your emulator.
Open terminal and run:
javascript
Copy code
adb devices
adb shell dumpsys window | grep -E 'mCurrentFocus'
This will display the current activity in focus, which is needed for the Appium configuration.


7. Execute Tests Using testng.xml
Configure testng.xml: Ensure your testng.xml file is set up correctly with the desired test suites and classes.
Run from Eclipse: Right-click on testng.xml > Run As > TestNG Suite.