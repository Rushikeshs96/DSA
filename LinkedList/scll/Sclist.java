public class Sclist {

    Node head;

    public Sclist() {
        this.head = null;
    }

    public void createList(int data)
    {
        Node record=new Node(data);

        if(head==null)
        {
            head=record;
            record.next=head;
        }
        else{
            Node move=head;
            while(move.next!=head)
            {
                move=move.next;
            }
            move.next=record;
            record.next=head;
        }
    }

    public void display()
    {
        Node move=head;
        while(move.next!=head)
        {
            System.out.print(" "+move.data);
            move=move.next;
        }
        System.out.print(" "+move.data);
    }


    public void addAtpos(int pos, int data) {
		Node record = new Node(data);
		Node move = head;
		if (pos == 1) {
			for (move = head; move.next != head; move = move.next)
				;

			move.next = record;
			record.next = head;
			head = record;
		} else {
			for (int i = 1; i < pos - 1; i++) {
				move = move.next;
			}
			record.next = move.next;
			move.next = record;
		}
		System.out.println("");
	}

	public void modify(int data, int newdata) {
		Node move = head;
		boolean flag = false;
		if (head.next == head) {
			head.data = newdata;
			return;
		}
		while (move.next != head) {
			if (move.data == data) {
				move.data = newdata;
				flag = true;
			}

			move = move.next;
		}
		move.data = newdata;
		if (flag == true) {
			System.out.println("DATA MODIFIED SUCCESFULLY");
		} else {
			System.out.println("NO MATCHING DATA FOUND");
		}

	}

	public Node deleteNode(int data) {
		Node del = null;
		if (head == null) {
			System.out.println("empty ll");
			return null;
		}
		if (head.data == data) {
			del = head;
			Node move = head;
			for (move = head; move.next != head; move = move.next)
				;
			move.next = del.next;
			head = head.next;
			return del;
		}
		Node move = head;
		while (move.next != head) {
			if (move.next.data == data) {
				del = move.next;
				move.next = del.next;
				return del;
			}
			move = move.next;
		}
		return null;

	}
	
	public void split()
	{
		Sclist odd=new Sclist();
		Sclist even=new Sclist();
		
		Node move=head;
		while(move.next!=head)
		{
			if(move.data%2==0)
			{
				even.createList(move.data);
			}
			else
			{
				odd.createList(move.data);
			}
			move=move.next;
		}
		even.display();
        System.out.println();
		odd.display();
	}

    
}
