SELECT p.Name, s.Sport, s.Score as Total Score
FROM players p
RIGHT JOIN scores s
ON p.Player_no = s. Player_no
WHERE p.Name IS NOT NULL;
