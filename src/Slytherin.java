public class Slytherin extends Hogwarts {
 private int cunning;
 private int determination;
 private int ambition;

 public Slytherin(int powerMagic, int transgress, int cunning, int determination, int ambition) {
  super(powerMagic, transgress);
  this.cunning = cunning;
  this.determination = determination;
  this.ambition = ambition;
 }

 public int getCunning() {
  return cunning;
 }

 public void setCunning(int cunning) {
  this.cunning = cunning;
 }

 public int getDetermination() {
  return determination;
 }

 public void setDetermination(int determination) {
  this.determination = determination;
 }

 public int getAmbition() {
  return ambition;
 }

 public void setAmbition(int ambition) {
  this.ambition = ambition;
 }
}
