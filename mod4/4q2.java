public class 4q2 {
    public static void main(String[] args) {

/* missing loop header */
for (int j = 0; j < 3; j++)
//for (int j = 1; j < 3; j++)
//for (int j = 1; j <= 3; j++)
    {
    for (int k = 0; k < 4; k++)
    
    {
    
    System.out.print(k);
    
    }
    
    System.out.println();
    
    }
}

Q3
public class 4q3 {
    public static void main(String[] args) {

int count = 0;

for (int x = 1; x <= 3; x++)

{

/* for (int y = 0; y <= 2; y++)

B
for (int y = 0; y < 3; y++)

C
for (int y = 2; y >= 0; y--)

D
for (int y = 3; y > 0; y--)

E -  cORRECT
for (int y = 0; y < x; y++)
 */

{

count++;

}

}

System.out.println(count);
}


public String wordPlay(String word)

{

String str = "";

for (int k = 0; k < word.length(); k++)

{

if (k % 3 == 0)

{

str = word.substring(k, k + 1) + str;

}

}

return str;

}

//12345
public static String changeStr(String str)

{

String result = "";

for (int i = str.length() - 1; i >= str.length() / 2; i -= 2)

{

result += str.substring(i, i + 1);

}

return result;

}

What val


}
