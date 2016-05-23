import robocode.*;
import static robocode.util.Utils.*;
public class RamFire extends Robot {
 double _turnDirection = 1;
public void run(){
  
while (true){
 turnRight(5 * _turnDirection);
 
}
}public void onScannedRobot( ScannedRobotEvent e ){
 if(e.getBearing() >= 0){
 _turnDirection = 1;
 
}
else{
 _turnDirection = -1;
 
}
turnRight(e.getBearing());
ahead(e.getDistance() + 5);
scan();
 
}
public void onHitRobot( HitRobotEvent e ){
 if(e.getBearing() >= 0){
 _turnDirection = 1;
 
}
else{
 _turnDirection = -1;
 
}
turnRight(e.getBearing());
if(e.getEnergy() > 16){
 fire(3);
 
}
else if(e.getEnergy() > 10){
 fire(2);
 
}
else if(e.getEnergy() > 4){
 fire(1);
 
}
else if(e.getEnergy() > 2){
 fire(0.5);
 
}
else if(e.getEnergy() > 0.4){
 fire(0.1);
 
}
ahead(40);
 
}
}
