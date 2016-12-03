
 /*
++----------------------------------------------------------------------------------------++
||  This is the Adapter class, which is actually the wrapper on the new interface         ||
||  and impersonate it as old interface. Our Main application need not any code change    ||
||  if the external API changes to its substitute exposing different interfaces. Adapter  ||
||  class is essentially a Mask.                                                          ||
++----------------------------------------------------------------------------------------++
 */


class Adapter implements HomeEntities{
    HotelEntities hotelEntity;

    Adapter(HotelEntities hotelEntity){
        this.hotelEntity = hotelEntity;
    }

    public void execute(HomeApplianceAction action){
        hotelEntity.execute(action);
    }

    public void printEntityStatus(){
        hotelEntity.printEntityStatus();
    }

    public String getClassName(){
        return hotelEntity.getClassName();
    }
}
