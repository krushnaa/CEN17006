import java.util.Scanner;
class PhoneEntry 
{
  String lastName;
  String firstName;
  String phone;
  PhoneEntry(String lastName, String firstName, String p)
  {
    this.lastName = lastName;
    this.firstName = firstName;
    phone = p;
  } 
}
class PhoneBook 
{
  PhoneEntry[] phoneBook;
  PhoneBook()  
  {
   phoneBook = new PhoneEntry[5];
   phoneBook[0] = new PhoneEntry(
    "r", "k", "8780473927");
   phoneBook[1] = new PhoneEntry(
    "s", "r", "910660198");
  }
PhoneEntry search(String targetLastName, String targetFirstName)
{
  for (int j = 0; j < phoneBook.length; j++)
  {
    if (phoneBook[j].firstName.equals(targetFirstName)||phoneBook[j].lastName.equals(targetLastName))
      return phoneBook[j];
  }
  return null;
}
}
public class PhoneBookTester
{
  public static void main(String[] args)
  {
   Scanner scan = new Scanner(System.in);
   PhoneBook pb = new PhoneBook();
   System.out.println("Enter last name: ");
   String lastNameEntry = scan.nextLine();
   System.out.println("Enter first name: ");
   String firstNameEntry = scan.nextLine();
   PhoneEntry entry = pb.search(lastNameEntry, firstNameEntry);
      if (entry != null)
        System.out.println(entry.lastName +", " + entry.firstName + ": " + entry.phone);
      else
        System.out.println("Name not found");
     System.out.println("Enter last name: ");
     lastNameEntry = scan.nextLine();
       System.out.println("Enter first name: ");
       firstNameEntry = scan.nextLine();
     entry = pb.search(lastNameEntry, firstNameEntry);
  }
}
