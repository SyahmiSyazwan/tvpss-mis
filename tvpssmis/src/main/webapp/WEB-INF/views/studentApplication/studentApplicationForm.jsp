<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Application Form</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Content Page</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" rel="stylesheet">
    <!-- Sidebar -->
    <style><%@include file="/WEB-INF/views/css/sidebarsxnavbar.css"%></style>
    <style><%@include file="/WEB-INF/views/css/sidebars.css"%></style>
    <!-- Icon Scout -->
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.8/css/line.css">
    <style>
        .content-container {
            max-width: 1200px;
            margin: 20px auto;
            padding: 20px;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
        }

        h1 {
            margin-bottom: 20px;
            font-size: 24px;
        }

        form {
            display: grid;
            grid-template-columns: repeat(2, 1fr);
            gap: 20px;
        }

        label {
            font-weight: bold;
        }

        input, textarea, select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        textarea {
            resize: none;
        }

        .upload-container {
            grid-column: span 2;
            text-align: center;
            border: 2px dashed #ccc;
            border-radius: 8px;
            padding: 20px;
        }

        .upload-container:hover {
            border-color: #4a148c;
        }

        .upload-container i {
            font-size: 50px;
            color: #ccc;
        }

        .form-actions {
            grid-column: span 2;
            display: flex;
            justify-content: space-between;
            margin-top: 20px;
        }

        .form-actions button {
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .form-actions .cancel-button {
            background-color: #f44336;
            color: white;
        }

        .form-actions .submit-button {
            background-color: #4a148c;
            color: white;
        }

        footer {
            margin-top: 30px;
            text-align: center;
            color: #555;
        }

        footer a {
            color: #4a148c;
            text-decoration: none;
            margin: 0 5px;
        }
    </style>
</head>
<<<<<<< HEAD
<body>
    <h2>Student Application Form</h2>
    <form action="${pageContext.request.contextPath}/application/submitApplication" method="post">
=======

<body> 
    <div class="d-flex" style="min-height: 100vh;">
    <!-- Sidebar Include -->
      <%@ include file="/WEB-INF/views/fragments/sidebar.jsp" %>    
    <div class="container">      
        <header>
            <nav class="navbar">
                <div class="nav-section nav-left">
                    <button class="nav-button menu-button">
                        <i class="uil uil-bars"></i>
                    </button>
                    <a href="#" class="nav-logo">
                        <img src="img/Group 1.png" alt="logo" class="logo-image">
                        <h2 class="logo-text"></h2>
                    </a>
                </div>

                <div class="nav-section nav-center">
                    <form action="#" class="search-form">
                        <input type="search" placeholder="Search" required class="search-input">
                        <button class="nav-button search-button">
                            <i class="uil uil-search"></i>
                        </button>
                    </form>
                </div>

                <div class="nav-section nav-right">
                    <button class="nav-button upload-button">
                        <i class="uil uil-cloud-upload"></i>
                    </button>
                    <img src="img/profile.png" alt="logo" class="user-image">
                </div>
            </nav>
        </header>
    <div class ="content-container">
    <h1>Student Application Form</h1>
    <form action="submitApplication" method="post">
>>>>>>> refs/remotes/upstreamkev/main
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
</div>
</body>
</html>
