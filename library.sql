DROP TABLE books;
DROP TABLE authors;
DROP TABLE borrowers;

CREATE TABLE authors (
  author_id int NOT NULL AUTO_INCREMENT,
  name varchar(80) DEFAULT NULL,
  PRIMARY KEY (author_id)
);

CREATE TABLE borrowers (
  borrower_id int NOT NULL AUTO_INCREMENT,
  name varchar(80) DEFAULT NULL,
  PRIMARY KEY (borrower_id)
);

CREATE TABLE books (
  id int NOT NULL AUTO_INCREMENT,
  title varchar(80) DEFAULT NULL,
  author_id int NOT NULL,
  borrower_id int DEFAULT NULL,
  publisher varchar(45) DEFAULT NULL,
  pages int DEFAULT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (author_id) REFERENCES authors (author_id),
  FOREIGN KEY (borrower_id) REFERENCES borrowers (borrower_id)
);

INSERT INTO authors (name)
VALUES
('JRR Tolkien'),
('Jane Austen'),
('William Shakespeare'),
('Charles Dickens');

INSERT INTO borrowers (name)
VALUES
('John'),
('Sarah'),
('Emily'),
('David');

INSERT INTO books (title, author_id, publisher, pages)
VALUES
('The Lord of the Rings', '1', 'Allen & Unwin', 500),
('Hamlet', '3', 'Penguin Classics', 400);

INSERT INTO books (title, author_id, borrower_id, publisher, pages)
VALUES
('The Hobbit', '1', '1', 'Allen & Unwin', 500),
('Pride and Prejudice', '2', '2', 'Penguin Classics', 300),
('A Tale of Two Cities', '4', '3', 'Penguin Classics', 350),
('Great Expectations', '4', '4', 'Penguin Classics', 500),
('Romeo and Juliet', '3', NULL, 'Penguin Classics', 300);

-- List all books
SELECT * FROM books;

-- List all authors
SELECT * FROM authors;

-- List all borrowers
SELECT * FROM borrowers;

-- List all books with their authors
SELECT books.title, authors.name
FROM books
INNER JOIN authors ON books.author_id = authors.author_id;

-- List all books borrowed by a specific borrower
SELECT books.title, borrowers.name
FROM books
INNER JOIN borrowers ON books.borrower_id = borrowers.borrower_id
WHERE borrowers.name = 'John';

-- List all books not borrowed by any borrower
SELECT *
FROM books
WHERE borrower_id IS NULL;

-- List all authors and their book count
SELECT authors.name, COUNT(books.id) AS book_count
FROM authors
LEFT JOIN books ON authors.author_id = books.author_id
GROUP BY authors.name;

-- List all publishers and their book count
SELECT publisher, COUNT(id) AS book_count
FROM books
GROUP BY publisher;

-- List all publishers and their average book length
SELECT publisher, AVG(pages) AS avg_book_length
FROM books
GROUP BY publisher;

-- List all authors who have written more than one book
SELECT authors.name, COUNT(books.id) AS book_count
FROM authors
LEFT JOIN books ON authors.author_id = books.author_id
GROUP BY authors.name HAVING COUNT(books.id) > 1; 
