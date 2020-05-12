package airgopher;
class Utils{
  public boolean inArray(Object[] arr,Object obj){
    for(Object i:arr){
      if(i.equals(obj)){
        return true;
      }
    }
    return false;
  }
}
