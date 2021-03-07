import java.lang.*;
import java.io.*;
import java.util.*;

//----------------Logic Building Assignment : 61
// 1.Write a program which accept matrix from user and return addition of diagonal
// elements.
// Input :3 2 5 9
// 4 3 2 2
// 8 4 1 5
// 3 9 7 5
// Output : 12 
// }

/* class Demo {
    int AdditionDiagonal(int Row, int Column, int Arr[][]) {

        int iSum = 0;
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                if ((i == j)) {
                    iSum = iSum + Arr[i][j];
                }
            }
        }
        return iSum;
    }

}

class Javamatrix {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Eneter NUMBER OF row");
        int Row = sobj.nextInt();
        System.out.println("Eneter NUMBER OF cloumn");
        int Column = sobj.nextInt();
        int Arr[][] = new int[Row][Column];
        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        Demo dobj = new Demo();
        iRet = dobj.AdditionDiagonal(Row, Column, Arr);
        System.out.println("ADDITION OG DIAGONAL IS"+iRet);
    }
}

 */

// 2. Write a program which accept matrix and one number from user and return
// frequency of that number.
// Input :
// Number : 9
// 3 2 5 9
// 4 3 2 2
// 8 4 1 9
// 3 9 7 5
// Output : 9 

/* class Demo {
    int Frequence(int Row, int Column, int Arr[][], int iNo) {


        if((Row<0)||(Column<0)||(iNo<0))
        {
            System.out.println("ERROR:WRONG INPUT");
            return 0;
        }

        int iSum = 0;

        for (int i = 0; i < Arr.length; i++) {
           
            for (int j = 0; j < Arr[i].length; j++) {
            
                if ((Arr[i][j]==iNo)) {
                    iSum++;
                }
            }
        }
        return iSum;
    }

}

class Javamatrix {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Eneter NUMBER OF row");
        int Row = sobj.nextInt();
        System.out.println("Eneter NUMBER OF cloumn");
        int Column = sobj.nextInt();
        System.out.println("Eneter NUMBER TO MATCH");
        int iNo = sobj.nextInt();

        int Arr[][] = new int[Row][Column];
        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        Demo dobj = new Demo();
        iRet = dobj.Frequence(Row, Column, Arr, iNo);
        System.out.println("FREQUENCE OF THAT NUMBER IS:\t" + iRet);
    }
}
 */

//3. Write a program which accept matrix and return largest number from both the
//diagonals
// Input :3 2 5 9
// 4 3 2 2
// 8 4 1 9
// 3 9 7 5
// Output : 9

/* class Demo {
    int MAX(int Row, int Column, int Arr[][]) {

        if ((Row < 0) || (Column < 0)) {
            System.out.println("ERROR:WRONG INPUT");
            return 0;
        }

        int iSum = 0;
        int iMax = 0;
        int iMax1 = 0;

        for (int i = 0; i < Arr.length; i++) {

            for (int j = 0; j < Arr[i].length; j++) {

                if (i + j == (Row - 1)) {

                    System.out.println();

                    if (iMax < Arr[i][j]) {
                        iMax = Arr[i][j];
                    }
                    System.out.println(Arr[i][j]);
                }

                if (i == j) {

                    System.out.println();

                    if (iMax1 < Arr[i][j]) {
                        iMax1 = Arr[i][j];
                    }
                    System.out.println(Arr[i][j]);
                }

            }
        }
        if (iMax > iMax1) {
            return iMax;
        } else {
            return iMax1;
        }
    }

}

class Javamatrix {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Eneter NUMBER OF row");
        int Row = sobj.nextInt();
        System.out.println("Eneter NUMBER OF cloumn");
        int Column = sobj.nextInt();

        int Arr[][] = new int[Row][Column];
        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        Demo dobj = new Demo();
        iRet = dobj.MAX(Row, Column, Arr);
        System.out.println("MAX NUMBER OF BOTH DIAGONAL IS NUMBER IS:\t" + iRet);
    }
}
 */

// 4. Write a program which accept matrix and display addition of elements From each
// column.
// Input :3 2 5 9
// 4 3 2 2
// 8 4 1 9
// 3 9 7 5
// Output : 18 18 15 25 

/* class Demo {
    int AdditionCoulmn(int Row, int Column, int Arr[][]) {

        if ((Row < 0) || (Column < 0)) {
            System.out.println("ERROR:WRONG INPUT");
            return 0;
        }

        int iSum = 0;
        int Size = 0;
        int Size1 = 0;
        int iNum = 0;

        for (int i = 0; i < Arr.length; i++) {

            for (int j = 0; j < Arr[i].length; j++) {
                if ((j == Size) && (i == Size1)) {
                    System.out.println(Arr[i][j]);
                    iSum = iSum + (Arr[i][j]);
                    Size1++;
                    
                }
               
            }

        }

        iNum = iNum + iSum;
        return iNum;
    }

}

class Javamatrix {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Eneter NUMBER OF row");
        int Row = sobj.nextInt();
        System.out.println("Eneter NUMBER OF cloumn");
        int Column = sobj.nextInt();

        int Arr[][] = new int[Row][Column];
        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        Demo dobj = new Demo();
        iRet = dobj.AdditionCoulmn(Row, Column, Arr);
        System.out.println("ASSITION OF COLUMN IS:\t" + iRet);
    }
}
 */

//////////Logic Building Assignment : 65 

// 1. Write a java program which accept number of rows and number of
// columns from user and display below pattern.
// Input : iRow = 4 iCol = 4
// Output : * * * #
//  * * # *
//  * # * *
//  # * * *

/* class Demo {
    void Pattern(int Row, int Column) {
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROE:WRONG INPUT");
            return;
        }
        int Arr[][] = new int[Row][Column];

        for (int i = 0; i < Arr.length; i++) {
            System.out.println();
            for (int j = 0; j < Arr[i].length; j++) {
                if ((i + j) == (Row - 1)) {
                    System.out.print("*\t");

                } else {
                    System.out.print("#\t");
                }
            }
        }
    }
}

class StringJava {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int Row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF CILUMN");
        int Column = sobj.nextInt();
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROE:WRONG INPUT");
            return;
        }
        Demo dobj = new Demo();
        dobj.Pattern(Row, Column);

    }
}
 */

// 2. Write a java program which accept number of rows and number of
// columns from user and display below pattern.
// Input : iRow = 4 iCol = 4
// Output : * * * #
//  * * # @
//  * # @ @
//  # @ @ @ 

/* class Demo {
    void Pattern(int Row, int Column) {
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROE:WRONG INPUT");
            return;
        }
        int Arr[][] = new int[Row][Column];

        for (int i = 0; i < Arr.length; i++) {
            System.out.println();
            for (int j = 0; j < Arr[i].length; j++) {
                if ((i + j) == (Row - 1)) {
                    System.out.print("*\t");

                } else if ((i + j >= Row)) {
                    System.out.print("@\t");

                } else {
                    System.out.print("#\t");
                }
            }
        }
    }
}

class StringJava {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int Row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF CILUMN");
        int Column = sobj.nextInt();
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROE:WRONG INPUT");
            return;
        }
        Demo dobj = new Demo();
        dobj.Pattern(Row, Column);

    }
}
 */

// 3. Write a java program which accept number of rows and number of
// columns from user and display below pattern.
// Input : iRow = 6 iCol = 6
// Output : * * * * * *
//  * * *
//  * * *
//  * * *
//  * * *
//  * * * * * * 

/* class Demo {
    void Pattern(int Row, int Column) {
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROE:WRONG INPUT");
            return;
        }
        int Arr[][] = new int[Row][Column];

        for (int i = 0; i < Arr.length; i++) {
            System.out.println();
            for (int j = 0; j < Arr[i].length; j++) {
                if ((i + j) == (Row - 1)) {
                    System.out.print("*\t");

                } else if (((i == 0) && (j < Row) || (j == Row - 1) && (i <= Row)) || (i == Row - 1) && (j < Row)
                        || (j == 0) && (i < Row)) {
                    System.out.print("*\t");

                } else {
                    System.out.print("\t");
                }
            }
        }
    }
}

class StringJava {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int Row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF CILUMN");
        int Column = sobj.nextInt();
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROE:WRONG INPUT");
            return;
        }
        Demo dobj = new Demo();
        dobj.Pattern(Row, Column);

    }
}
 */

// 4. Write a java program which accept number of rows and number of
// columns from user and display below pattern.
// Input : iRow = 6 iCol = 6
// Output : * * * * * *
//  * # # # * *
//  * # # * $ *
//  * # * $ $ *
//  * * $ $ $ *
//  * * * * * * 

/* class Demo {
    void Pattern(int Row, int Column) {
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROE:WRONG INPUT");
            return;
        }
        int Arr[][] = new int[Row][Column];

        for (int i = 0; i < Arr.length; i++) {
            System.out.println();
            for (int j = 0; j < Arr[i].length; j++) {
                if ((i + j) == (Row - 1)) {
                    System.out.print("*\t");

                } else if (((i == 0) && (j < Row) || (j == Row - 1) && (i <= Row)) || (i == Row - 1) && (j < Row)
                        || (j == 0) && (i < Row)) {
                    System.out.print("*\t");

                } else if(i+j<Row){
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print("#\t");
                }
            }
        }
    }
}

class StringJava {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int Row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF CILUMN");
        int Column = sobj.nextInt();
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROE:WRONG INPUT");
            return;
        }
        Demo dobj = new Demo();
        dobj.Pattern(Row, Column);

    }
}
 */

// 5. Write a java program which accept number of rows and number of
// columns from user and display below pattern.
// Input : iRow = 4 iCol = 4
// Output : 
// 1 2 3 4 5
// 1 2     5
// 1   3   5  
// 1     4 5
// 1 2 3 4 5

/* class Demo {
    void Pattern(int Row, int Column) {
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROE:WRONG INPUT");
            return;
        }
        int Arr[][] = new int[Row][Column];

        for (int i = 1; i < Arr.length; i++) {
            System.out.println();
            for (int j = 1; j < Arr[i].length; j++) {
                if ((i == j)) {

                    System.out.print(j + "\t");

                } else if ((i == 1) && (i < Row) || (i < Row) && (j == 1) || (i < Row) && (j == Row - 1)
                        || (i == Row - 1) && (j < Row)) {
                    System.out.print(j + "\t");
                } else {
                    System.out.print("\t");
                }
            }
        }
    }
}

class StringJava {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int Row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF CILUMN");
        int Column = sobj.nextInt();
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROE:WRONG INPUT");
            return;
        }
        Demo dobj = new Demo();
        dobj.Pattern(Row, Column);

    }
}
 */

// 5. Write Java program which accept number of rows and number of columns
// from user and display below pattern.
// Input : iRow = 3 iCol = 4
// Output : 1 2 3 4
//  5 6 7 8
//  9 10 11 12 

/* class Demo {
    void Pattern(int row, int column) {

        if ((row <= 0) && (column <= 0)) {
            return;
        }
        int ch1 = 1;
        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= column; j++) {
                System.out.print("\t" + ch1);
                ch1++;
            }

        }
    }
}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF column");
        int column = sobj.nextInt();
        int Arr[][] = new int[row][column];
        Demo dobj = new Demo();
        dobj.Pattern(row, column);
    }
}
 */

// 4. Write Java program which accept number of rows and number of columns
// from user and display below pattern.
// Input : iRow = 4 iCol = 5
// Output : 4 4 4 4 4
//  3 3 3 3 3
//  2 2 2 2 2
//  1 1 1 1 1 

/* class Demo {
    void Pattern(int row, int column) {

        if ((row <= 0) && (column <= 0)) {
            return;
        }
        int ch1 = 4;
        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= column; j++) {
                System.out.print("\t" + ch1);

            }
            ch1--;
        }
    }
}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF column");
        int column = sobj.nextInt();
        int Arr[][] = new int[row][column];
        Demo dobj = new Demo();
        dobj.Pattern(row, column);
    }
} */

//Logic Building Assignment : 58 

// 1. Write Java program which accept number of rows and number of
// columns from user and display below pattern.
// Input : iRow = 4 iCol = 3
// Output : * * *
//  * * *
//  * * *
//  * * * 

/* class Demo {
    void Pattern(int row, int column) {

        if ((row <= 0) && (column <= 0)) {
            return;
        }

        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= column; j++) {
                System.out.print("\t*");

            }

        }
    }
}
 
class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF column");
        int column = sobj.nextInt();
        int Arr[][] = new int[row][column];
        Demo dobj = new Demo();
        dobj.Pattern(row, column);
    }
}
*/

// 2. Write Java program which accept number of rows and number of
// columns from user and display below pattern.
// Input : iRow = 4 iCol = 3
// Output : 1 2 3
//  1 2 3
//  1 2 3
//  1 2 3 

/* class Demo {
    void Pattern(int row, int column) {

        if ((row <= 0) && (column <= 0)) {
            return;
        }
        int ch = 1;
        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= column; j++) {
                System.out.print("\t" + ch);
                ch++;
            }
            ch = 1;

        }
    }
}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF column");
        int column = sobj.nextInt();
        int Arr[][] = new int[row][column];
        Demo dobj = new Demo();
        dobj.Pattern(row, column);
    }
}
 */

// 3. Write Java program which accept number of rows and number of
// columns from user and display below pattern.
// Input : iRow = 3 iCol = 5
// Output : 5 4 3 2 1
//  5 4 3 2 1
//  5 4 3 2 1 

/* class Demo {
    void Pattern(int row, int column) {

        if ((row <= 0) && (column <= 0)) {
            return;
        }
        int ch = 5;
        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= column; j++) {
                System.out.print("\t" + ch);
                ch--;
            }
            ch = 5;

        }
    }
}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF column");
        int column = sobj.nextInt();
        int Arr[][] = new int[row][column];
        Demo dobj = new Demo();
        dobj.Pattern(row, column);
    }
}
 */

// 4. Write Java program which accept number of rows and number of
// columns from user and display below pattern.
// Input : iRow = 3 iCol = 4
// Output : * # * #
//  * # * #
//  * # * # 

/* class Demo {
    void Pattern(int row, int column) {

        if ((row <= 0) && (column <= 0)) {
            return;
        }

        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= column; j++) {
                if (j % 2 == 0) {
                    System.out.print("\t#\t");
                } else {
                    System.out.print("*");
                }
            }

        }
    }
}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF column");
        int column = sobj.nextInt();
        int Arr[][] = new int[row][column];
        Demo dobj = new Demo();
        dobj.Pattern(row, column);
    }
} */

// 5. Write Java program which accept number of rows and number of
// columns from user and display below pattern.
// Input : iRow = 3 iCol = 4
//  2 2 2 2
//  3 3 3 3
//  4 4 4 4 

/* class Demo {
    void Pattern(int row, int column) {

        if ((row <= 0) && (column <= 0)) {
            return;
        }
        int ch = 1;
        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= column; j++) {
                System.out.print("\t" + ch);
            }
            ch++;

        }
    }
}

class Assipart2 {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW");
        int row = sobj.nextInt();
        System.out.println("ENTER NUMBER OF column");
        int column = sobj.nextInt();
        int Arr[][] = new int[row][column];
        Demo dobj = new Demo();
        dobj.Pattern(row, column);
    }
} */

////Logic Building Assignment : 69 
// 5. Write Java program which accept array from user and display below
// pattern.
// Input : 8 9 7 6 4 2 4
// Output :
//  * * * * * * * *
//  * * * * * *
//  * * * *
//  * *
//  * * * * 

/* class Demo {
    void Pattern(int Arr[]) {
        Scanner sobj = new Scanner(System.in);

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] % 2 == 0) {
                for (int k = 0; k < Arr[i]; k++) {
                    System.out.print("*" + "\t");
                }
                System.out.println();
            }

        }

    }
}

class Javamatrix {
    public static void main(String Args[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        int Arr[] = new int[7];
        System.out.println("ELEMENT OF ARRAY");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
        }
        Demo dobj = new Demo();
        dobj.Pattern(Arr);
    }
}
 */





import java.lang.*;
import java.io.*;
import java.util.*;

// 4. Write a program which accept matrix and display addition of elements From each
// column.
// Input :3 2 5 9
// 4 3 2 2
// 8 4 1 9
// 3 9 7 5
// Output : 18 18 15 25 
/* 

 class Demo {
    void AdditionCoulmn(int Row, int Column, int Arr[][]) {

        if ((Row < 0) || (Column < 0)) {
            System.out.println("ERROR:WRONG INPUT");
            return;
        }

        int iSum = 0;

        int Size1 = 0;
        int iNum = 0;
        int Size = 0;
        

            for (int j = 0; j < Arr.length; j++) {

                for (int i = 0; i < Arr.length; i++) {

                  
                        System.out.println(Arr[i][j]);
                        iSum = iSum + (Arr[i][j]);

                 
              

                }
                System.out.println("Addition of Column "+(j+1)+" elements is: "+iSum);
                iSum = 0;
            }
            
        }

    }


class Assipart2
 {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Eneter NUMBER OF row");
        int Row = sobj.nextInt();
        System.out.println("Eneter NUMBER OF cloumn");
        int Column = sobj.nextInt();
        int Arr[][] = new int[Row][Column];
        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println();
        Demo dobj = new Demo();
        dobj.AdditionCoulmn(Row, Column, Arr);

    }
}


 */

// 5. Write a program which accept matrix and swap the contents of consecutive rows.Input:
// 3 2 5 9 
// 4 3 2 2 
// 8 4 1 9
// 3 9 7 5 
//  Output:
// 4 3 2 2
// 3 2 5 9
// 3 9 7 5 
// 8 4 1 9

/* class Demo {
   void swap(int Row, int Column, int Arr[][]) {

       if ((Row < 0) || (Column < 0)) {
           System.out.println("ERROR:WRONG INPUT");
           return;
       }

       int Size = Arr.length;
       int Size1 = 0;
       int i = 0, j = 0;

       for (i = 0; i < Arr.length; i++) {
           System.out.println();
           for (j = 0; j < (Arr[i].length); j++) {

               if ((i < (Size - 1)) && (i % 2 == 0)) {

                   Size1 = Arr[i][j];
                   Arr[i][j] = Arr[i + 1][j];
                   Arr[i + 1][j] = Size1;
               }
               System.out.print(Arr[i][j] + "\t");

           }
         
       }

   }
}

class Assipart2 {
   public static void main(String Args[]) {
       int iRet = 0;
       Scanner sobj = new Scanner(System.in);
       System.out.print("Eneter NUMBER OF row:\t");
       int Row = sobj.nextInt();
       System.out.print("Eneter NUMBER OF cloumn:\t");
       int Column = sobj.nextInt();
       int Arr[][] = new int[Row][Column];
       System.out.println("ENTER ELEMENT");
       for (int i = 0; i < Arr.length; i++) {
           System.out.println("Row with index : " + i);
           for (int j = 0; j < Arr[i].length; j++) {
               System.out.println("Enter the element :" + i + " , " + j);
               Arr[i][j] = sobj.nextInt();
           }
       }
       System.out.println();
       Demo dobj = new Demo();
       dobj.swap(Row, Column, Arr);

   }
} 
*/

//....................Logic Building Assignment : 62 

// 1.Write a program which accept matrix from user and display transpose of the
// matrix.
// The transpose of a given matrix is formed by interchanging the rows and
// columns of a matrix. 
// Input :
// 3 2 5 9
// 4 3 2 2
// 8 4 1 5
// 3 9 7 5
// Output : 
// 3 4 8 3
// 2 3 4 9
// 5 2 1 7
// 9 2 5 5

/* class Demo {
   void transpose(int Row, int Column, int Arr[][]) {

       if ((Row < 0) || (Column < 0)) {
           System.out.println("ERROR:WRONG INPUT");
           return;
       }

       int Size = Arr.length;
       int Size1 = 0;
       int i = 0, j = 0;

       for (i = 0; i < Arr.length; i++) {

           for (j = i; j < (Arr[i].length); j++) {

               Size1 = Arr[j][i];
               Arr[j][i] = Arr[i][j];
               Arr[i][j] = Size1;

           }

       }

       for (i = 0; i < Arr.length; i++) {
           System.out.println();
           for (j = 0; j < (Arr[i].length); j++) {
               System.out.print(Arr[i][j] + "\t");
           }

       }

   }
}

class Assipart2 {
   public static void main(String Args[]) {
       int iRet = 0;
       Scanner sobj = new Scanner(System.in);
       System.out.print("Eneter NUMBER OF row:\t");
       int Row = sobj.nextInt();
       System.out.print("Eneter NUMBER OF cloumn:");
       int Column = sobj.nextInt();
       int Arr[][] = new int[Row][Column];
       System.out.println("ENTER ELEMENT");
       for (int i = 0; i < Arr.length; i++) {
           System.out.println("Row with index : " + i);
           for (int j = 0; j < Arr[i].length; j++) {
               System.out.println("Enter the element :" + i + " , " + j);
               Arr[i][j] = sobj.nextInt();
           }
       }
       System.out.println();
       Demo dobj = new Demo();
       dobj.transpose(Row, Column, Arr);

   }
}  */

//2. Write a program which accept matrix and reverse the contents of each row.Input:
// 3 2 5 9
// 4 3 2 2
// 8 4 1 9
// 3 9 7 5
// Output : 
// 9 5 2 3
// 2 2 3 4
// 9 1 4 8
// 5 7 9 3

/* class Demo {
    void reverse(int Row, int Column, int Arr[][]) {

        if ((Row < 0) || (Column < 0)) {
            System.out.println("ERROR:WRONG INPUT");
            return;
        }

        int Size = Arr.length;
        int Size1 = 0;
        int i = 0, j = 0;

        for (i =0; i <Arr.length; i++) {
            System.out.println();
            for (j =(Arr[i].length)-1; j >=0 ; j--) {
                System.out.print(Arr[i][j] + "\t");
            }

        }

       
    }
}

class Assipart2 {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.print("Eneter NUMBER OF row:\t");
        int Row = sobj.nextInt();
        System.out.print("Eneter NUMBER OF cloumn:");
        int Column = sobj.nextInt();
        int Arr[][] = new int[Row][Column];
        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println();
        Demo dobj = new Demo();
        dobj.reverse(Row, Column, Arr);

    }
} */

// 3. Write a program which accept matrix and reverse the contents of each
// column. 
// Input :
// 3 2 5 9
// 4 3 2 2
// 8 4 1 9
// 3 9 7 5
// Output :
// 3 9 7 5
// 8 4 1 9
// 4 3 2 2
// 3 2 5 9

/* class Demo {
    void reverse(int Row, int Column, int Arr[][]) {

        if ((Row < 0) || (Column < 0)) {
            System.out.println("ERROR:WRONG INPUT");
            return;
        }

        int Size = Arr.length;
        System.out.print( Arr.length);
        int Size1 = 0;
        int i = 0, j = 0;
        int k = (Size - 1);

        // for (i = 0; i < Arr.length/2; i++) {
        //     System.out.println();
        //     for (j = 0; j < Arr.length; j++) {
        //         Size1 = Arr[i][j];
        //         Arr[i][j] = Arr[k][j];
        //         Arr[k][j] = Size1;
        //         // System.out.print(Arr[i][j] + "\t");
        //     }
        //     k--;
        // }
        // for (i = 0; i < Arr.length; i++) {
        //     for (j = 0; j < Arr[i].length; j++) {
        //         System.out.print(Arr[i][j] + "\t");
        //     }
        //     System.out.println();
        // }
/////////////////////or/////////////////
        // for (i =(Arr.length-1); i>=0; i--) {
        //         System.out.println();
        //         for (j = 0; j < Arr[i].length; j++) {
                
        //             System.out.print(Arr[i][j] + "\t");
        //         }
        //     }
    }
}

class Assipart2 {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.print("Eneter NUMBER OF row:\t");
        int Row = sobj.nextInt();
        System.out.print("Eneter NUMBER OF cloumn:");
        int Column = sobj.nextInt();
        int Arr[][] = new int[Row][Column];
        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println();
        Demo dobj = new Demo();
        dobj.reverse(Row, Column, Arr);

    }
} 
 */

// 4. Write a program which accept matrix and check whether the matrix is
// identity matrix or not. 

// Identity matrix is a square matrix with 1’s along the diagonal from upper left to
// lower right and 0’s in all other positions.
// If it satisfies the structure as explained before then the matrix is called as
// identity matrix. 

//Input : 
// 1 0 0 0
// 0 1 0 0
// 0 0 1 0
// 0 0 0 1
//Output : True 

/* class Demo {
    boolean identitymatrix(int Row, int Column, int Arr[][]) {

        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROR:WRONG INPUT");
            return false;
        }

        int Size = Arr.length;
        System.out.print(Arr.length);
        int Size1 = 0;
        int i = 0, j = 0;
        int k = 0;
        boolean flag = false;

        for (i = 0; i < Arr.length; i++) {
            System.out.println();
            for (j = 0; j < Arr.length; j++) {

                if ((i == j) && (Arr[i][j] == 1)) {

                    k++;

                } else if ((i != j) && (Arr[i][j] == 0)) {
                    k++;

                } else {
                    break;
                }
            }
        }

        if (k == Size * Size) {

            return true;
        } else {

            return false;
        }

    }
}

class Assipart2 {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.print("Eneter NUMBER OF row:\t");
        int Row = sobj.nextInt();
        System.out.print("Eneter NUMBER OF cloumn:");
        int Column = sobj.nextInt();
        int Arr[][] = new int[Row][Column];
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROR:WRONG INPUT");
            return;
        }

        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println();
        Demo dobj = new Demo();
        boolean Bret = dobj.identitymatrix(Row, Column, Arr);
        if (Bret == true) {
            System.out.println("Matrix is identical");

        } else {

            System.out.println("Matrix is not identical");
        }

    }
}
 */

// 5. /Write a program which accept matrix and check whether the matrix is
// Sparse matrix or not.
// Sparse matrix is a matrix with the majority of its elements equal to zero. 

// 1 0 3 0
// 0 6 0 0
// 0 0 1 0
// 9 0 0 9
// Output : True

/* class Demo {
    boolean Sparsematrix(int Row, int Column, int Arr[][]) {

        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROR:WRONG INPUT");
            return false;
        }

        int Size = Arr.length;

        int Size1 = 0;
        int i = 0, j = 0;
        int k = 0, l = 0;
        boolean flag = false;

        for (i = 0; i < Arr.length; i++) {
            System.out.println();
            for (j = 0; j < Arr.length; j++) {

                if ((Arr[i][j] == 0)) {
                    k++;
                } else {
                    l++;
                }
            }
        }

        if (k > l) {

            return true;
        } else {

            return false;
        }

    }
}

class Assipart2 {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.print("Eneter NUMBER OF row:\t");
        int Row = sobj.nextInt();
        System.out.print("Eneter NUMBER OF cloumn:");
        int Column = sobj.nextInt();
        int Arr[][] = new int[Row][Column];
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROR:WRONG INPUT");
            return;
        }

        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println();
        Demo dobj = new Demo();
        boolean Bret = dobj.Sparsematrix(Row, Column, Arr);
        if (Bret == true) {
            System.out.println("Matrix is Sparse");

        } else {

            System.out.println("Matrix is not Sparse");
        }

    }
}
 */

