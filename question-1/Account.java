//part A
public Account(String requestedName){
  username = requestedName;

  for(int i = 1; !isAvailable(username); i++){
    username = requestedName + i;
  }
}
//part B
public String getShortenedName(){
  
}
