

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
		

		FolderNodeLinkedList myFolders = new FolderNodeLinkedList();
		myFolders.addInFront(new Folder("hello"));
		myFolders.addInFront(new Folder("lol"));
		myFolders.addInFront(new Folder("schola"));
		myFolders.addInFront(new Folder("jola"));
		myFolders.addInFront(new Folder("pola"));
		myFolders.addInFront(new Folder("tola"));
		myFolders.addInFront(new Folder("bola"));
		myFolders.addInFront(new Folder("wles"));
		myFolders.addInFront(new Folder("pez"));
		myFolders.addInFront(new Folder("sequence"));
		
		FolderNode firstResultFolder = myFolders.getFirstNode();
		FolderNode lastResultFolder = myFolders.getLastNode();
		FolderNode seventhResultFolder = myFolders.getSeventhNode();
		System.out.println(firstResultFolder);
		System.out.println(lastResultFolder);
		System.out.println(seventhResultFolder);

	}
}
