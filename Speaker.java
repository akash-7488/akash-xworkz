class Speaker
{
static int maxVol=40;
static boolean isConnected=true;
static int currentVolume=10;
public static void main(String a[])
{
String brandName;
double price;
brandName="Bose";
price=2000.00;
increaseVolume();
increaseVolume();
System.out.println(brandName);
System.out.println(price);
}
public static void increaseVolume()
{
if(isConnected)
{
if(currentVolume < maxVol)
{
currentVolume=currentVolume+1;
System.out.println("currentvolume is:"+currentVolume);

}
}

}


}