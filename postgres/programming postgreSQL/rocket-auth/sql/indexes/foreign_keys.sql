
ALTER TABLE logins
    ADD CONSTRAINT logins_users
  FOREIGN KEY  (user_id) REFERENCES  users(id) ON DELETE CASCADE;


ALTER TABLE logs
  ADD CONSTRAINT logs_users
FOREIGN KEY  (user_id) REFERENCES  users(id) ON DELETE CASCADE;