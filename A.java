import java.util.*;
class GFG {
public static void main(string[] args)
{
HashSet<String> set = new HashSet<string>();
set.add("1");
set.add("13");
set.add("27"); set.add("87");
set.add("19");
System.out.println("Hash Set Contains :" + set);
string arr[] = new String[set.size()];
int i=0;
for (String ele:set) { arr[i] = ele;
}
for (String n : arr) system.out.println(n);
}
}



     2)password validation
import java.util.*;
class PasswordChecker
{
public static boolean isValid(String password)
{