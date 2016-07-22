/**
 * @author Chris Kimberley
 */
print "Tell me something: "
Scanner entry = new Scanner(new Scanner(System.in).nextLine())
int count = 1
while (entry.hasNext()) {
    String word = entry.next()
    printf "%5s%3d:  %-10s\n", "word", count, word
    count++
}