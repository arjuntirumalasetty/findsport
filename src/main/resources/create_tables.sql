CREATE TABLE findsport.stadium_details (
    stadium_id VARCHAR(10),
    stadium_name VARCHAR(20),
    stadium_longitude FLOAT(10 , 6 ),
    stadium_latitide FLOAT(10 , 6 ),
    stadium_phoneno VARCHAR(10),
    stadium_adress VARCHAR(40)
);

CREATE TABLE findsport.stadium_sport (
    stadium_id VARCHAR(10),
    sport_id VARCHAR(10),
    sport_name VARCHAR(20),
    court_id VARCHAR(10)
);

CREATE TABLE findsport.court_availability (
    stadium_id VARCHAR(10),
    court_id VARCHAR(10),
    booked_date DATE,
    booked_from TIME,
    booked_till TIME
);