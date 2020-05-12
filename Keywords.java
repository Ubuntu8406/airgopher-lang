package airgopher;
class Keywords{
  public Object[] dataTypes;
  public Object[] keywords;
  public Object[] mods;
  public Types(){
    dataTypes={"int","string","float","char","bool","map","array"};
    keywords={"print","readLine","let","var","if","elseIf","else","case","when","readonly","void","while","for","loop","fn","break","next","restart","range","class","enum","next","null","package","new","import","namespace"};
    mods={"static","private","public","override"};
  }
}
