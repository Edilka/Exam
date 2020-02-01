package com.company;
​
public interface Paper {
    void shurshit ();
    package com.company;
​
import java.util.ArrayList;
​
public class Karmn  {
   private ArrayList<Paper> arrayListB;
  private   ArrayList<Sound> arrayListZ;
​
    public Karmn(ArrayList<Paper> arrayListB, ArrayList<Sound> arrayListZ) {
        this.arrayListB = arrayListB;
        this.arrayListZ = arrayListZ;
    }
​
    public ArrayList<Paper> getArrayListB() {
        return arrayListB;
    }
​
    public void setArrayListB(ArrayList<Paper> arrayListB) {
        this.arrayListB = arrayListB;
    }
​
    public ArrayList<Sound> getArrayListZ() {
        return arrayListZ;
    }
​
    public void setArrayListZ(ArrayList<Soundpackage com.company;
​
package com.company;
​
public class Main {
​
    public static void main(String[] args) {
	// write your code here
​
    }
}
package com.company;
​
public class Phone implements Sound  {
    private  String model;
    @Override
    public void coll() {
        System.out.println("brrrrr");
    }
​
    public String getModel() {
        return model;
    }
​
    public void setModel(String model) {
        this.model = model;
    }
}
package com.company;
​
public interface Sound {
    void coll();
}
package com.company;
​
public class Sheet implements Paper {
private String name;
    @Override
    public void shurshit() {
        System.out.println("hhshshshs");
    }
​
    public String getName() {
        return name;
    }
​
    public void setName(String name) {
        this.name = name;
    }
}
