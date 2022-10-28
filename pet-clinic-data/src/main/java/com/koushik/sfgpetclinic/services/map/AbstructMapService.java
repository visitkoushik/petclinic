package com.koushik.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstructMapService<T,ID> {

    public  Map<ID, T> map = new HashMap<>();

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
    
    public T save(ID id,T object) {
        map.put(id, object);
        return object;
    }

    public void delete(T t){
       map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

    public void deleteById(ID id){
        map.remove(id);
    }
}
