CREATE TABLE IF NOT EXISTS email_logs (
                                          id SERIAL PRIMARY KEY,
                                          recipient VARCHAR(255) NOT NULL,
    subject VARCHAR(255) NOT NULL,
    body TEXT,
    status VARCHAR(50),
    sent_at TIMESTAMP
    );
