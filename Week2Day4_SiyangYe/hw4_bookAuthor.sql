SELECT b.Title, COUNT(ba.AuthorID) AS NumberOfAuthors
FROM Book b
JOIN BooksAuthors ba ON b.BookID = ba.BookID
GROUP BY b.BookID, b.Title
HAVING COUNT(ba.AuthorID) > 1;
