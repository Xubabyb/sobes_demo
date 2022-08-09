-- liquibase formatted sql

-- changeset groot:1653906710750-1
CREATE TABLE users
(
    id            BIGINT NOT NULL,
    name          VARCHAR(500),
    password      VARCHAR(500),
    date_of_birth DATE,
    role_id       BIGINT,
    CONSTRAINT pk_users PRIMARY KEY (id)
);

-- changeset groot:1653906710750-2
CREATE TABLE roles
(
    id   BIGINT NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_roles PRIMARY KEY (id)
);

-- changeset groot:1653906710750-3
CREATE TABLE email_data
(
    id      BIGINT NOT NULL,
    email   VARCHAR(200) UNIQUE,
    user_id BIGINT,
    CONSTRAINT pk_email_data PRIMARY KEY (id)
);

-- changeset groot:1653906710750-4
CREATE TABLE phone_data
(
    id      BIGINT NOT NULL,
    phone   VARCHAR(13) UNIQUE,
    user_id BIGINT,
    CONSTRAINT pk_phone_data PRIMARY KEY (id)
);

-- changeset groot:1653906710750-5
CREATE TABLE account
(
    user_id BIGINT NOT NULL,
    balance DECIMAL CHECK ( balance >= 0 ),
    CONSTRAINT pk_account PRIMARY KEY (user_id)
);
-- changeset groot:1653906710750-6
ALTER TABLE users
    ADD CONSTRAINT FK_USERS_ON_ROLE FOREIGN KEY (role_id) REFERENCES roles (id);

-- changeset groot:1653906710750-7
ALTER TABLE account
    ADD CONSTRAINT FK_ACCOUNT_ON_USER FOREIGN KEY (user_id) REFERENCES users (id);

-- changeset groot:1653906710750-8
ALTER TABLE email_data
    ADD CONSTRAINT FK_EMAIL_ON_USER FOREIGN KEY (user_id) REFERENCES users (id);

-- changeset groot:1653906710750-9
ALTER TABLE phone_data
    ADD CONSTRAINT FK_PHONE_ON_USER FOREIGN KEY (user_id) REFERENCES users (id);






