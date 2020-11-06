class BreakStatement {
public static void main(String[] args){ 
System.out.println("main started");
for(int i=0; i<5; i++){
if(i==3){
System.out.println("breaking the loop .. at 3");
break;
}
System.out.println(i);

}
}
}