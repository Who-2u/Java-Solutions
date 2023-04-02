class SerialMultiplier{
    public int result=0;
    SerialMultiplier(int first){
         result=first;
    }
    SerialMultiplier(int first,int second){
        result=first*second;
    }
    SerialMultiplier(int first,int second,int third){
        result=first*second*third;
    }
    SerialMultiplier(int first,int second,int third,int fourth){
        result=first*second*third*fourth;
    }
    SerialMultiplier(int first,int second,int third,int fourth,int fifth){
        result=first*second*third*fourth*fifth;
    }
    
    
    public String toString() {
    return result+"";
}


}
public class SerialMulti{
    public static void main(String args[]){
        SerialMultiplier s = new SerialMultiplier(1,2,3);
        System.out.print(s);
    }
}
