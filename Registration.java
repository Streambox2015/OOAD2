/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Time;

/**
 *
 * @author t00134621
 */
public class Registration {
    
    private long time;
    
    public Registration(){
        
        this(0);
       
            
    }
    
    
    public Registration(long time){
        
        this.time = time;
       
            
    }
    
    
    
    public long getTime(){
        
        return System.currentTimeMillis();
    }
    
    
    public String toString(){
        
        return "\nThe time of creation is "+ getTime();
    }
    
}
