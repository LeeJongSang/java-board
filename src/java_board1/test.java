package java_board1;

/*
숫자 저장할 수 있는 저장 프로그램.

명령어를 입력해주세요: read
[1 2 3 4 5 6 7 8 9 10 ]

명령어를 입력해주세요: add
저장할 값을 입력해주세요 : 12
12이/가 저장되었습니다.

명령어를 입력해주세요: read
[1 2 3 4 5 6 7 8 9 10 12 ]

만약 add, help, read, exit 말고 다른 값을 입력하면
'올바른 명령어를 입력해주세요' 

*/
import java.util.*;

//기능클래스
class Function
{
  //help
  void printHelp()
  {
    System.out.println("add : 데이터 추가");
    System.out.println("read : 데이터 조회");
    System.out.println("update : 데이터 수정");
    System.out.println("delete : 데이터 삭제\n");
  }

  //read
  void printRead(int datas[])
  {
    for (int data : datas)
    {
      System.out.println(data);
    }
  }

  void add()
  {
    Scanner scAdd = new Scanner(System.in);
    System.out.println("추가할 값을 입력하세요 (입력 후 엔터 ) : ");
    int ressult = scAdd.nextInt();

    //배열의 길이를 이용해서 마지막자리에 요소 추가 
    //배열의 길이 
    //배열에 요소 추가 
  }
}


public class test {
  public static void main(String[] args) {
    
    int datas[] = {1,2,3,4,5,6,7,8,9,10};
    Function fc = new Function();
    Scanner sc = new Scanner(System.in);

    while(true)
    {
      String result = "";
      System.out.println("명령어를 입력해주세요: ");
      result = sc.next();

      if(result.equals("help") == true)
      {
        System.out.println("입력한 데이터 help");
        fc.printHelp();
      }
      
      else if(result.equals("read") == true)
      {
        System.out.println("입력한 데이터 read");
        fc.printRead(datas);
      }
      
      else if(result.equals("exit") == true)
      {
        System.out.println("입력한 데이터 exit");
        System.out.println("프로그램을 종료합니다.");
        break;
      }

      else if(result.equals("add") == true)
      {
        System.out.println("입력한 데이터 add");
        fc.add();

      }

      else
      {
        System.out.println("올바른 데이터를 입력해주세요");
      }
    }
  }
}
