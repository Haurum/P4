import robocode.*;
import static robocode.util.Utils.*;
public class Re extends Robot {
 double _dist = 50;
public void run(){
  
while (true){
 turnGunRight(5);
 
}
}public void onScannedRobot( ScannedRobotEvent e ){
 if(e.getDistance() < 50 && getEnergy() > 50){
 fire(3);
 
}
else{
 fire(1);
 
}
scan();
 
}
public void onHitByBullet( HitByBulletEvent e ){
 turnRight(normalRelativeAngleDegrees(90 - (getHeading() - e.getHeading())));
ahead(_dist);
_dist = _dist * (-1);
scan();
 
}
public void onHitRobot( HitRobotEvent e ){
 double _turnGunAmt = normalRelativeAngleDegrees(e.getBearing() + getHeading() - getGunHeading());
turnGunRight(_turnGunAmt);
fire(3);
 
}
}
