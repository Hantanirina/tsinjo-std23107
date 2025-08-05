CREATE TABLE donor (
                       id SERIAL PRIMARY KEY,
                       full_name VARCHAR(255),
                       email VARCHAR(255)
);

CREATE TABLE payment (
                         id SERIAL PRIMARY KEY,
                         amount NUMERIC,
                         payment_method VARCHAR(100),
                         payment_date TIMESTAMP,
                         status VARCHAR(50)
);

CREATE TABLE donation (
                          id SERIAL PRIMARY KEY,
                          donor_id INTEGER REFERENCES donor(id),
                          payment_id INTEGER REFERENCES payment(id),
                          donation_date TIMESTAMP
);

CREATE TABLE beneficiary (
                             id SERIAL PRIMARY KEY,
                             full_name VARCHAR(255),
                             email VARCHAR(255)
);

CREATE TABLE help (
                      id SERIAL PRIMARY KEY,
                      beneficiary_id INTEGER REFERENCES beneficiary(id),
                      payment_id INTEGER REFERENCES payment(id),
                      description TEXT,
                      help_date TIMESTAMP
);
