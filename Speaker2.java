class Speaker2
{
static int minVol=0;
static int currentVolume=20;
public static void main(String a[])
{
String brandName;
double price;
brandName="Bose";
price=2000.00;
System.out.println(brandName);
System.out.println(price);
decreaseVolume();
decreaseVolume();

}
public static void decreaseVolume()
{
if(isConnected())
{
if(currentVolume > minVol)
{
currentVolume=currentVolume-1;
System.out.println("currentvolume is:"+currentVolume);

}
}

}
public static boolean isConnected()
{
return true;

}
}



