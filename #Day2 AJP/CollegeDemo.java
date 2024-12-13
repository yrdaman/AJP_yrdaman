//College class implementation

public class CollegeDemo{

public static void main(String args[]){
College cllge1=new College();
cllge1.Collegecode="T3210";
cllge1.Collegename="AVANTHI";
cllge1.address="Gunthapally";
cllge1.phoneno=9999966666l;
cllge1.Collegedetails();
cllge1.Transportationdetails();

Feestructure cllge1fee=new Feestructure();
cllge1fee.jntufee=2500;
cllge1fee.collegefee=35000;
cllge1fee.libfee=1000;
cllge1fee.crtfee=4000;
cllge1fee.festfee=10000;

cllge1fee.Feestruct();
}
}