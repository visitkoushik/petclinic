package com.koushik.sfgpetclinic.services.map;
 
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.koushik.sfgpetclinic.model.BaseEntity; 

public abstract class AbstructMapService<T extends BaseEntity,ID extends Long> {

    public  Map<Long, T> map = new HashMap<>();

    /**
     * @return
     */
    public Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    /**
     * @param id
     * @return
     */
    public T findById(ID id){
        return  map.get(id);
    }
    
    public T save(T object) {
        
        if(object !=null){
            if(object.getId()==null){
                object.setId(this.getNextID());
            }
            map.put(object.getId(), object);
        }else{
            throw new RuntimeException("Object is null");
        }
        return object;
    }

    public void delete(T t){
       map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

    public void deleteById(ID id){
        map.remove(id);
    }


    private Long getNextID(){
        Long id =10L;
        try{
            id = Collections.max(map.keySet())+1;
        }catch(Exception e){}
        return id;
    }


}
