

public class TestFriendLinkedList 
{
	public static void main(String[] args) 
	{		
		FriendLinkedList myContacts = new FriendLinkedList();
		myContacts.addInFront("alice");
		myContacts.addInFront("peter");
		myContacts.addInFront("rumple");
		myContacts.addInFront("hook");
		myContacts.addInFront("hello");
		myContacts.addInFront("moto");
		myContacts.addInFront("hola");
		myContacts.addInFront("como");
		myContacts.addInFront("estas");

		FriendNode firstResult = myContacts.getFirstNode();
		FriendNode lastResult = myContacts.getLastNode();
		FriendNode seventhResult = myContacts.getSeventhNode();
		System.out.println(firstResult);
		System.out.println(lastResult);
		System.out.println(seventhResult);

	}
}
