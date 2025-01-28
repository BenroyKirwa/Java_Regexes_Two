# Java_Regexes_Two
## Below is a sample log file containing entries in the following format: 
```
[2025-01-06 14:32:10] INFO  User: JohnDoe, Ac on: Login successful 
[2025-01-06 14:33:22] ERROR User: JaneDoe, Ac on: Invalid password 
[2025-01-07 14:34:15] INFO  User: JohnDoe, Ac on: Viewed profile 
[2025-01-07 14:35:15] INFO  User: MaryDoe, Ac on: Viewed profile 
[2025-01-07 14:35:18] INFO  User: JohnDoe, Ac on: Viewed profile 
[2025-01-07 14:35:42] ERROR User: JohnDoe, Ac on: Unauthorized access a empt 
[2025-01-07 14:36:00] INFO  User: JaneDoe, Ac on: Logout successful 
[2025-01-07 14:37:00] INFO  User: JohnDoe, Ac on: Logout successful 
[2025-01-08 14:38:00] ERROR  User: JohnDoe, Ac on: Invalid password 
```
## Created a program that does the following: 
### Extract Specific Logs:
```
- Extract all ERROR logs for 6th and 8th January 2025. 
- Use lookaheads to find logs where the Ac on contains the word password. 
```
### Identify Repeated Actions: 
```
- Use backreferences to iden fy logs where a user performed the same ac on consecu vely. 
```
### Group and Summarize Logs: 
```
- Use named capturing groups to extract: 
  1. The mestamp. 
  2. Log level (INFO or ERROR). 
  3. Username. 
  4. Ac on descrip on. 
- Display the extracted informa on in a readable format.
```
