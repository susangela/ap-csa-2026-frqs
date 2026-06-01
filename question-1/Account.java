//part A
public Account(String requestedName){
  username = requestedName;

  for(int i = 1; !isAvailable(username); i++){
    username = requestedName + i;
  }
}
//part B
public String getShortenedName(){
  int index = name.indexOf("-");
  while(index! = -1){
    if(index > 0){
      name = name.substring(0, index - 1) + name.substring(index + 1);
    } else {
      name = name.substring(1);
    }
    index = name.indexOf("-");
  }
  return name;
}
