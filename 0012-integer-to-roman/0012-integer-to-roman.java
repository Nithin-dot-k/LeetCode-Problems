class Solution {
    int []arr=new int[13];
    String []rom=new String[13];
    public void add(){
        arr[0]=1;
        arr[1]=4;
        arr[2]=5;
        arr[3]=9;
        arr[4]=10;
        arr[5]=40;
        arr[6]=50;
        arr[7]=90;
        arr[8]=100;
        arr[9]=400;
        arr[10]=500;
        arr[11]=900;
        arr[12]=1000;
        rom[0]="I";
        rom[1]="IV";
        rom[2]="V";
        rom[3]="IX";
        rom[4]="X";
        rom[5]="XL";
        rom[6]="L";
        rom[7]="XC";
        rom[8]="C";
        rom[9]="CD";
        rom[10]="D";
        rom[11]="CM";
        rom[12]="M";
    }
    public String intToRoman(int num) {
        StringBuilder sb=new StringBuilder();
        add();
        while(num>0){
            for(int i=12;i>=0;i--){
                if(num>=arr[i]){
                    sb.append(rom[i]);
                    num-=arr[i];
                    break;
                }
            }
        }
        return sb.toString();
    }
}