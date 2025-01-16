<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Application Form</title>
</head>
<body>
    <h2>Student Application Form</h2>
    <form action="submitApplication" method="post">
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" required><br><br>

        <label for="programId">Program ID:</label>
        <input type="text" id="programId" name="programId" required><br><br>

        <label for="skills">Skills:</label>
        <textarea id="skills" name="skills" required></textarea><br><br>

        <label for="interests">Interests:</label>
        <textarea id="interests" name="interests" required></textarea><br><br>

        <input type="submit" value="Submit Application">
    </form>
</body>
</html>
