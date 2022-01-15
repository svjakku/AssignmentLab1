import java.util.Observable;

class ObservableDogBot extends Observable implements DogBot
{
 private DogBot inner;

 public ObservableDogBot(DogBot dog)
 {
  inner=dog;
 }

 public boolean eat()
 {
  if(inner.eat())
     {
      setChanged();
      notifyObservers("eat");
      return true;
     }
  else
     return false;
 }

 public void rest()
 {
  inner.rest();
  setChanged();
  notifyObservers("rest");
 }

 public void play()
 {
  inner.play();
  setChanged();
  notifyObservers("play");
 }

 public String toString()
 {
  return inner.toString();
 }

 public String getName()
 {
  return inner.getName();
 }

 public String noise()
 {
  return inner.noise();
 }

}

interface DogBot
{
 public boolean eat();

 public void rest();

 public void play();

 public String noise();

 public String getName();

}