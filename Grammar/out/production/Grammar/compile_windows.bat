if %errorlevel% neq 0 exit /b %errorlevel%
SET filename=RamFire
java -classpath "%~dp0out\production\Grammar\;%~dp0antlr-4.5.2-complete.jar" Main %filename%
javac -classpath "%~dp0robocode\libs\robocode.jar" %filename%.java
move "%~dp0%filename%.class" "%~dp0robocode\robots"
del "%~dp0%filename%.java"
copy NUL "%~dp0robocode\battles\%filename%.battle"
echo #Battle Properties>> "%~dp0robocode\battles\%filename%.battle"
echo robocode.battleField.width=800>> "%~dp0robocode\battles\%filename%.battle"
echo robocode.battleField.height=600>> "%~dp0robocode\battles\%filename%.battle"
echo robocode.battle.numRounds=10>> "%~dp0robocode\battles\%filename%.battle"
echo robocode.battle.gunCoolingRate=0.1>> "%~dp0robocode\battles\%filename%.battle"
echo robocode.battle.rules.inactivityTime=450>> "%~dp0robocode\battles\%filename%.battle"
echo robocode.battle.hideEnemyNames=true>> "%~dp0robocode\battles\%filename%.battle"
echo robocode.battle.selectedRobots=%1*,sample.Crazy>> "%~dp0robocode\battles\%filename%.battle"
cd robocode
.\robocode.bat -battle %filename%.battle