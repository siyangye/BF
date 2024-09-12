CREATE TABLE Customer (
    CustomerID INT AUTO_INCREMENT PRIMARY KEY,
    CustomerName VARCHAR(100),
    CustomerEmail VARCHAR(100),
    MembershipStatus VARCHAR(50),
    DiscountApplied DECIMAL(5,2)
);

CREATE TABLE Book (
    BookID VARCHAR(20) PRIMARY KEY,
    BookTitle VARCHAR(255),
    Author VARCHAR(100),
    Genre VARCHAR(50),
    Price DECIMAL(10,2)
);

CREATE TABLE Sale (
    SaleID VARCHAR(20) PRIMARY KEY,
    CustomerID INT,
    BookID VARCHAR(20),
    SaleDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID),
    FOREIGN KEY (BookID) REFERENCES Book(BookID)
);

INSERT INTO Customer (CustomerName, CustomerEmail, MembershipStatus, DiscountApplied)
VALUES 
    ('Alice Smith', 'alice@example.com', 'Active', 10.00),
    ('Bob Johnson', 'bob@example.com', 'Inactive', 0.00),
    ('Charlie Brown', 'charlie@example.com', 'Active', 15.00);

INSERT INTO Book (BookID, BookTitle, Author, Genre, Price)
VALUES 
    ('B001', 'The Great Gatsby', 'F. Scott Fitzgerald', 'Fiction', 12.99),
    ('B002', '1984', 'George Orwell', 'Dystopian', 15.50),
    ('B003', 'To Kill a Mockingbird', 'Harper Lee', 'Fiction', 10.75);

INSERT INTO Sale (SaleID, CustomerID, BookID, SaleDate)
VALUES 
    ('S001', 1, 'B001', '2024-09-01'),
    ('S002', 2, 'B002', '2024-09-02'),
    ('S003', 3, 'B003', '2024-09-03');
