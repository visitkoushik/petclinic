package com.koushik.sfgpetclinic.services.map;

 

import java.util.Set;

import org.springframework.stereotype.Service;

import com.koushik.sfgpetclinic.model.Visit; 
import com.koushik.sfgpetclinic.services.VisitService;


@Service
public class VisitServiceMap extends AbstructMapService<Visit,Long> 
implements VisitService{

     
    @Override
    public Visit findById(Long id) {
        return this.findById(id);
    }


    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId()==null 
        || visit.getPet().getOwner().getId()==null){
            throw new RuntimeException("Ivalid Visit Object");
        }
        return super.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getId() == null ){
            throw new RuntimeException("Ivalid Visit Object");
        }
        super.delete(visit);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    

 
  @Override
  public Set<Visit> findAll() {
      return super.findAll();
  }
    
}
