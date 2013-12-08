
            CREATE TABLE theexams (
            student_id   INTEGER,
            document_id   INTEGER,
            inst_id   INTEGER, 
            date   TEXT,
            type_id   INTEGER, 
            
            id INTEGER PRIMARY KEY
            );
            
            CREATE TABLE students (
            name  TEXT,
            _id  INTEGER,
            
            id INTEGER PRIMARY KEY
            );
            
            CREATE TABLE documents (
            title  TEXT,
            thesis  TEXT,
            
            id INTEGER PRIMARY KEY
            );
            
            CREATE TABLE aTtypes (
            aTtype   TEXT,
            
            id INTEGER PRIMARY KEY
            );
        
            CREATE TABLE insts (
                inst TEXT,
                id INTEGER PRIMARY KEY
            );
    
