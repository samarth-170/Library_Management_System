package Project_01_LibraryManagementSystem;
import java.util.*;
class Book{
    Scanner sc = new Scanner(System.in);
    int bookID;
    String name;
    String author;
    double price;
    int booksAvailable;
    Book(int bookId, String name, String author, double price, int booksAvailable){
        this.bookID = bookId;
        this.name = name;
        this.author = author;
        this.price = price;
        this.booksAvailable = booksAvailable;
    }
    void print(){
        System.out.println("Book ID: "+bookID+"\nBook Name: "+name+"\nAuther name: "+author+"\nPrice: "+price+"\nBooks in stock: "+booksAvailable);
    }
}
class Student{
    Scanner sc = new Scanner(System.in);
    int studentID;
    String name;
    String course;
    int fine;
    int booksIssued;
    Student(int studentID, String name, String course, int fine, int booksIssued){
        this.studentID = studentID;
        this.name = name;
        this.course = course;
        this.fine = fine;
        this.booksIssued = booksIssued;
    }
    void print(){
        System.out.println("Student ID: "+studentID+"\nStudent Name: "+name+"\nCourse: "+course+"\nFine: "+fine+"\nNo of books issued: "+booksIssued);
    }
}
class Admin{
    int adminID;
    String name;
    String password;
    Admin(int adminID, String name, String password){
        this.adminID = adminID;
        this.name = name;
        this.password = password;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();
        ArrayList<Student> student = new ArrayList<>();
        ArrayList<Admin> admin = new ArrayList<>();
        book.add(new Book(123, "Harry Potter", "JK Rowling", 12.96, 20));
        student.add(new Student(12345, "Harry Potter", "MCA", 0, 2));
        admin.add(new Admin(12, "Dumbledore", "hogwards"));
        int login;
        int service;
        boolean bStatus = false;
        boolean sStatus = false;
        boolean aStatus = false;
        a:do{
            System.out.print("Choose login type:\n1. Admin\n2. Student\n3. Exit: ");
            login = sc.nextInt();
            b:switch(login){
                case 1:

                    System.out.print("Enter admin ID: ");
                    int aid = sc.nextInt();
                    System.out.print("Enter admin password: ");
                    String pass = sc.next();
                    for(int x=0; x<admin.size(); x++){
                        if(admin.get(x).adminID == aid){
                            aStatus = true;
                            if(admin.get(x).password.equals(pass)){
                                System.out.println("Login Successfully");
                                c:do{
                                    System.out.print("Choose service:\n1. Add Books\n2. Update Stock\n3. Add Student\n4. Check book detail\n5. Check Student detail\n6. Logout: ");
                                    service = sc.nextInt();
                                    d:switch(service){
                                        case 1:
                                            System.out.print("Enter book ID: ");
                                            int id = sc.nextInt();
                                            sc.nextLine();
                                            System.out.print("Enter book name: ");
                                            String name = sc.nextLine();
                                            System.out.print("Enter author name: ");
                                            String author = sc.nextLine();
                                            System.out.print("Enter book price: ");
                                            double price = sc.nextDouble();
                                            System.out.print("Enter book quantity: ");
                                            int quantity = sc.nextInt();
                                            book.add(new Book(id, name, author, price, quantity));
                                            break;
                                        case 2:
                                            System.out.print("Enter book id: ");
                                            int bid = sc.nextInt();
                                            for(int i=0; i<book.size(); i++){
                                                if(book.get(i).bookID == bid){
                                                    System.out.print("Enter number of books you have to add: ");
                                                    int incre = sc.nextInt();
                                                    book.get(i).booksAvailable += incre;
                                                    bStatus = true;
                                                    break;
                                                }
                                                else{
                                                    bStatus = false;
                                                }
                                            }
                                            if(bStatus) System.out.println("Stock added Successfully");
                                            else System.out.println("Book not found");
                                            break;
                                        case 3:
                                            System.out.print("Enter Student ID: ");
                                            int sid = sc.nextInt();
                                            sc.nextLine();
                                            sStatus = true;
                                            for(int i=0; i<student.size(); i++){
                                                if(student.get(i).studentID == sid){
                                                    sStatus = false;
                                                    break;
                                                }
                                                else sStatus = true;
                                            }
                                            if(sStatus){
                                                System.out.print("Enter Student name: ");
                                                String sname = sc.nextLine();
                                                System.out.print("Enter student course: ");
                                                String course = sc.nextLine();
                                                student.add(new Student(sid, sname, course, 0, 0));
                                            }
                                            else System.out.println("Enter a another student ID it is occupied");
                                            break;
                                        case 4:
                                            System.out.print("Enter book ID: ");
                                            int bookid = sc.nextInt();
                                            for(int i=0; i<book.size(); i++){
                                                if(bookid == book.get(i).bookID){
                                                    bStatus = true;
                                                    book.get(i).print();
                                                    break;
                                                }
                                                else {
                                                    bStatus = false;
                                                }
                                            }
                                            if(!bStatus) System.out.println("Book not found");
                                            break;
                                        case 5:
                                            System.out.print("Enter student ID: ");
                                            int stuid = sc.nextInt();
                                            for(int i=0; i<student.size(); i++){
                                                if(student.get(i).studentID == stuid){
                                                    sStatus = true;
                                                    student.get(i).print();
                                                    break;
                                                }
                                                else sStatus = false;
                                            }
                                            if(!sStatus) System.out.println("Student not found");
                                            break;
                                        case 6:
                                            System.out.println("Logging out");
                                            break c;
                                        default:
                                            System.out.println("Enter a valid service");
                                    }
                                }while(service != 6);
                            }
                            else{
                                System.out.println("Incorrect Password");
                            }
                            break;
                        }
                        else{
                            aStatus = false;
                        }
                    }
                    if(!aStatus) System.out.println("Admin not found");

                    break;
                case 2:
                    do{
                        System.out.print("Choose service:\n1. Issue Book\n2. Return Book\n3. Update Student detail\n4. Logout: ");
                        service = sc.nextInt();
                        switch(service){
                            case 1:
                                System.out.print("Enter student ID: ");
                                int studid = sc.nextInt();
                                for(int i=0; i<student.size(); i++){
                                    if(student.get(i).studentID == studid){
                                        sStatus = true;
                                        System.out.print("Enter Book ID: ");
                                        int bookid = sc.nextInt();
                                        bStatus = false;
                                        for(int j=0; j<book.size(); j++){
                                            if(book.get(j).bookID == bookid){
                                                bStatus = true;
                                                if(book.get(j).booksAvailable == 0) System.out.println("Book is out of stock");
                                                else if(student.get(i).booksIssued == 5) System.out.println("Issuing limit reach please return first then we issue more");
                                                else if(student.get(i).fine > 0) System.out.println("Firstly submit the fine");
                                                else{
                                                    book.get(j).booksAvailable--;
                                                    student.get(i).booksIssued++;
                                                    System.out.println("Book Issued Successfully");
                                                }
                                                break;
                                            }
                                            else bStatus = false;
                                        }
                                        if(!bStatus) System.out.println("Book not found");
                                        break;
                                    }
                                    else{
                                        sStatus = false;
                                    }
                                }
                                if(!sStatus) System.out.println("Student not found");
                                break;
                            case 2:
                                System.out.print("Enter student ID: ");
                                int stdid = sc.nextInt();
                                for(int i=0; i<student.size(); i++){
                                    if(student.get(i).studentID == stdid){
                                        sStatus = true;
                                        System.out.print("Enter book ID: ");
                                        int bookid = sc.nextInt();
                                        for(int j=0; j<book.size(); j++){
                                            if(book.get(j).bookID == bookid){
                                                bStatus = true;
                                                book.get(j).booksAvailable++;
                                                student.get(i).booksIssued--;
                                                break;
                                            }
                                            else{
                                                bStatus = false;
                                            }
                                        }
                                        if(!bStatus) System.out.println("Book Not found");
                                        break;
                                    }
                                    else sStatus = false;
                                }
                                if(!sStatus) System.out.println("Student not found");
                                break;
                            case 3:
                                System.out.print("Enter student ID: ");
                                int sid = sc.nextInt();
                                for(int i=0; i<student.size(); i++){
                                    if(student.get(i).studentID == sid){
                                        sStatus = true;
                                        System.out.print("Enter fine amount: ");
                                        int fine = sc.nextInt();
                                        student.get(i).fine = student.get(i).fine - fine;
                                        break;
                                    }
                                    else{
                                        sStatus = false;
                                    }
                                }
                                if(!sStatus) System.out.println("Student not found");
                                break;
                            case 4:
                                System.out.println("Logging out");
                                break;
                            default:
                                System.out.println("Enter a valid service");
                        }
                    }while(service!=4);
                    break;
                case 3:
                    System.out.println("Thanks for visiting");
                    break a;
                default:
                    System.out.println("Enter a valid choice");
            }
        }while(login!=3);
    }
}