import java.util.Scanner;
public class AddressBook
{
    public final String firstName;
    public final String lastName;
    public final String address;
    public final String city;
    public final String state;
    public final String zip;
    public final String phoneNumber;
    public final String eMail;


    public AddressBook(String firstName, String lastName, String address, String city,
                       String state, String zip, String phoneNumber, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String state;
    private final String zip;
    private final String phoneNumber;
    private final String eMail;


    public AddressBook() 
     {    //String firstName, String lastName, String address, String city,

        Scanner sc = new Scanner(System.in);//String state, String zip, String phoneNumber, String eMail) 
       {
        System.out.println("Enter your Firstname :- ");
        this.firstName = sc.next();

        System.out.println("Enter your Lastname :- ");
        this.lastName = sc.next();

        System.out.println("Enter your Address :- ");
        this.address = sc.next();

        System.out.println("Enter your City :- ");
        this.city = sc.next();

        System.out.println("Enter your State :- ");
        this.state = sc.next();

        System.out.println("Enter your ZIP :- ");
        this.zip = sc.next();

        System.out.println("Enter your PhoneNumber :- ");
        this.phoneNumber = sc.next();

        System.out.println("Enter your Email :- ");
        this.eMail = sc.next();
    }

    public String strString()
     {
        return "\nfirstName:- " + firstName + "\nlastName:- " + lastName + "\naddress:- " + address+ "\ncity:- " + city
                + "\nstate:- " + state+"\nzip:- " + zip+"\nphoneNumber:- " + phoneNumber+"\neMail:- " + eMail;
        return "\nfirstName:- " + firstName + "\nlastName:- " + lastName + "\naddress:- " + address + "\ncity:- " + city
                + "\nstate:- " + state + "\nzip:- " + zip + "\nphoneNumber:- " + phoneNumber + "\neMail:- " + eMail;
     }

    public static void main(String[] args)
    {
        AddressBook object = new AddressBook("Mayuri ", "N ", "Ring Road", " Kolhapur ", "Maharashtra ",
                "416010 ", "9595272743 ", "mayu@gmail.com");
        System.out.println(object.strString());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries you want to add :- ");
        int changeEntry = sc.nextInt();
        String list[] = new String[changeEntry];
        for (int i=0; i<changeEntry; i++) 
        {
            System.out.println("Enter the contact detail:- " + (i+1));
            AddressBook book = new AddressBook();
            String contactDetail = book.strString();
            list[i]=contactDetail;
        }
        for (int j=0; j<changeEntry; j++) 
        {
            System.out.println(list[j]);
        }
    }
}