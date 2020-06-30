package com.company.databases;


import com.company.humans.Client;

import java.util.HashSet;
import java.util.Set;

public class ClientBase {
   public Set<Client> baseOfClient;

   public ClientBase(){
      this.baseOfClient = new HashSet<Client>();
   }

   public Client getClient(Integer i){
      Client[] array = new Client[baseOfClient.size()];
      baseOfClient.toArray(array);
      return array[i];
   }

   public String getBrand1(Integer i){
      Client[] array = new Client[baseOfClient.size()];
      baseOfClient.toArray(array);
      return array[i].getFirstBrand();
   }

   public String getBrand2(Integer i){
      Client[] array = new Client[baseOfClient.size()];
      baseOfClient.toArray(array);
      return array[i].getSecondBrand();
   }

   public Double getClientCash(Integer i){
      Client[] array = new Client[baseOfClient.size()];
      baseOfClient.toArray(array);
      return array[i].getClientCash();
   }

   public void setClientCash(Double clientCash, Integer i){
      Client[] array = new Client[baseOfClient.size()];
      baseOfClient.toArray(array);
      array[i].setClientCash(clientCash);
   }

}
