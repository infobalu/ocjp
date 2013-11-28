/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mybank.domain;

/**
 *
 * @author Joaquin
 */
public class Bank {

   private int numberOfCustumers;
   private Custumers[] custumer = new Custumers[10];
   
   

    public Bank() {
    }
    /**
     * 
     * @param f First name
     * @param l Last name
     */
    public void addCustumers(String f,String l)
    {
      int i = numberOfCustumers++;
      custumer[i] = new Custumers(f, l);
    }
    
    public int getNumOfCustumers(){
     return numberOfCustumers;
     
    }
    
    public Custumers getCustumer(int index){
        return this.custumer[index];
    }
           
}

class Custumers {

    private String firstName;
    private String lastName;

    public Custumers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Custumers{" + "firstName=" + firstName + ", lastName=" + lastName + '}';
    }

  
   
}