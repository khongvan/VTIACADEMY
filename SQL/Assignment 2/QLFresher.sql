---- Tao database Fresher
DROP DATABASE IF EXISTS Fresher;
CREATE DATABASE Fresher;
USE Fresher;

-- Tao bang Trainee
DROP TABLE IF EXISTS Trainee;
CREATE TABLE Trainee(
	TraineeID		VARCHAR(10),
    Full_Name		VARCHAR(50),
    Brith_Date		DATE,
    Gender			ENUM ('Male','Female','Unknown'),
    ET_IQ			TINYINT UNSIGNED,
    ET_Gmath		TINYINT UNSIGNED,
    ET_English		TINYINT UNSIGNED,
    Training_Class	VARCHAR(10),
    Evaluation_Notes NVARCHAR(MAX)
    );