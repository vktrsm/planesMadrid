package com.linkeddata.vktrsm.planesmadrid.daos;

import com.linkeddata.vktrsm.planesmadrid.dtos.PlaceDTO;

import java.util.ArrayList;

/**
 * Created by viktor on 15/12/14.
 *
 * This class is designed to abstract access to model data
 */

public class LibrariesDAO implements PlaceDAO{


  @Override
  public ArrayList<PlaceDTO> getListByName(String name) {
    ArrayList<PlaceDTO> result = new ArrayList<>();

    //TEST
    PlaceDTO place;
    for(int i=0; i<10; i++){
      place = new PlaceDTO("Library "+name+i, 0.99,0.99);
      result.add(place);
    }

    return result;
  }

}
