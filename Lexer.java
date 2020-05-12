package airgopher;
import java.io.*;
import java.util.*;
import airgopher.*;
class Lexer{
  public static StringBuilder res;
  static Utils utils;
  static Keywords kws;
  public Lexer(){
    res=new StringBuilder();
    utils=new Utils();
    types=new Types();
  }
  public void writeRes(){
    Formatter file=new Formatter("lexer-out.txt");
    file.format("%s",res.toString());
    file.close();
  }
  public void lexString(String line){
    StringTokenizer tknzr=new StringTokenizer(line);
    while(tknzr.hasMoreTokens()){
      Object token=tknzr.nextToken();
      String cutrentType="undefined";
      if(utils.inArray(types.dataTypes,token)){
        currentType="dataType";
      }else if(utils.inArray(kws.keywords,token)){
        currentType="keyword";
      }else if(utils.inArray(kws.mods,token)){
        currentType="modifer";
      }
      res.append(token+":"+currentType+"\n");
    }
    //return res.toString();
  }
}
