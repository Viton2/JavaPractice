package Challenges.hackerrank.easy;

public class DrawingBook {

/*
A teacher asks the class to open their books to a page number. A student can either start turning pages from the
front of the book or from the back of the book. They always turn pages one at a time. When they open the book,

page 1 is always on the right side

When they flip page 1, they see pages 2 and 3. Each page except the last page will always be printed on both
sides. The last page may only be printed on the front, given the length of the book. If the book is n pages long.
and a student wants to turn to page p, what is the minimum number of pages to turn? They can start at the
beginning or the end of the book.

Given n and p, find and print the minimum number of pages that must be turned in order to arrive at page p.

Example
n = 5
p = 3

Using the diagram above, if the student wants to get to page 3, they open the book to page 1, flip 1 page, and they
are on the correct page. If they open the book to the last page, page 5, they turn 1 page and are at the correct
page. Return 1.
*/

    public static int pageCount(int n, int p) {
//        int pageFlipsUpwards = 0;
//        int pageFlipsDownwards = 0;
//        int currentPage = 1;
//        boolean conditional = true;
//        if (p != 1 && p != n) {
//            while (conditional) {
//                if (currentPage % 2 != 0) {
//                    if (currentPage != p) {
//                        pageFlipsUpwards++;
//                    } else {
//                        conditional = false;
//                    }
//                } else if (currentPage == p) {
//                    conditional = false;
//                }
//                currentPage++;
//            }
//            conditional = true;
//            currentPage = n;
//            while (conditional) {
//                if (currentPage % 2 == 0) {
//                    if (currentPage != p) {
//                        pageFlipsDownwards++;
//                    } else {
//                        conditional = false;
//                    }
//                } else if (currentPage == p) {
//                    conditional = false;
//                }
//                currentPage--;
//            }
//        }
//        return Math.min(pageFlipsUpwards, pageFlipsDownwards);

        int fromFront = p / 2;
        int fromBack = (n / 2) - (p / 2);
        return Math.min(fromFront, fromBack);
    }

    public static void main(String[] args) {
        System.out.println(pageCount(6, 5));
    }
}
