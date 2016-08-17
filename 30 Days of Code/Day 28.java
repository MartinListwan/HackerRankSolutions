Scanner in = new Scanner(System.in);
int N = in .nextInt();
List < String > list = new ArrayList < String > ();
for (int a0 = 0; a0 < N; a0++) {
 String firstName = in .next();
 String emailID = in .next();
 if (emailID.indexOf("@gmail.com") != -1) {
  list.add(firstName);
 }
}
Collections.sort(list);
for (String name: list) {
 System.out.println(name);
}