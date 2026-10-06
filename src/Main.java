void main() {
    IO.println("Hello World!");
    String word = IO.readln("Enter any word here:");
    for (int i = 0 ; i<word.length(); i++) {
        IO.println("Iteration "+(i+1)+":"+word.charAt(i));
    }
}

