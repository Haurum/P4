java -classpath "%~dp0\out\production\Grammar\;%~dp0\antlr-4.5.2-complete.jar" Main %1
javac -classpath "%~dp0\robocode\libs\robocode.jar" %1.java
move "%~dp0\$1.class" "%~dp0\robocode/robots"
del "%~dp0\$1.java"
echo $null >> "%~dp0\robocode\battles\$1.battle"
echo "#Battle Properties
robocode.battleField.width=800
robocode.battleField.height=600
robocode.battle.numRounds=10
robocode.battle.gunCoolingRate=0.1
robocode.battle.rules.inactivityTime=450
robocode.battle.hideEnemyNames=true
robocode.battle.selectedRobots=%1*,sample.Crazy" >> "%~dp0\robocode\battles\%1.battle"
.%~dp0\robocode\robocode.bat -battle %1.battle
set /p id="Enter ID: "