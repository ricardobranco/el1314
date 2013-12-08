
            CREATE TABLE theexams (
            student_id   INTEGER,
            document_id   INTEGER,
            inst  TEXT,
            ansi   TEXT,
            type   INTEGER, 
            
            ID INTEGER PRIMARY KEY   AUTOINCREMENT
            );
            
            CREATE TABLE students (
            name  TEXT,
            _id  INTEGER,
            
            ID INTEGER PRIMARY KEY   AUTOINCREMENT
            );
            
            CREATE TABLE documents (
            title  TEXT,
            thesis  TEXT,
            
            ID INTEGER PRIMARY KEY   AUTOINCREMENT
            );
            
            CREATE TABLE aTtype (
            aTtype   TEXT,
            
            ID INTEGER PRIMARY KEY   AUTOINCREMENT
            );
        