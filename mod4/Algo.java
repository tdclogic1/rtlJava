public class Algo {
    public static void main(String[] args) {

    String str = "a black cat sat on a table";

int counter = 0;

for (int i = 0; i < str.length() - 1; i++)

{

if (str.substring(i, i + 1).equals("a") &&

    !str.substring(i + 1, i + 2).equals("b"))

{

counter++;

}

}

System.out.println(counter);
}
}