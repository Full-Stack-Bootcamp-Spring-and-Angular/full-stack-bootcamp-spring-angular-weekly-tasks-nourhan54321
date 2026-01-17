<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

     <link rel="styleSheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"}


 </head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow-lg border-0 rounded-4">
                <div class="card-body p-4">
                    <h3 class="text-center mb-4 fw-bold">User Info</h3>

                    <form action="result" method="post">
                        <!--First Name -->
                        <div class="mb-3">
                            <label class="form-label">First Name</label>
                            <div class="input-group">
                <span class="input-group-text bg-primary text-white">
                  <i class="bi bi-person"></i>
                </span>
                                <input type="text" class="form-control" placeholder="Enter your first name" name ="Fname">
                            </div>
                        </div>

                        <!--Last Name -->
                        <div class="mb-3">
                            <label class="form-label">Last Name</label>
                            <div class="input-group">
                <span class="input-group-text bg-primary text-white">
                  <i class="bi bi-person"></i>
                </span>
                                <input type="text" class="form-control" placeholder="Enter your last  name" name ="Lname">
                            </div>
                        </div>
                        <!--City -->
                        <div class="mb-3">
                            <label class="form-label">City</label>
                            <div class="input-group">
                <span class="input-group-text bg-primary text-white">
                  <i class="bi bi-person"></i>
                </span>
                                <input type="text" class="form-control" placeholder="Enter your City" name ="City">
                            </div>
                        </div>

                        <!-- Email -->
                        <div class="mb-3">
                            <label class="form-label">Email Address</label>
                            <div class="input-group">
                <span class="input-group-text bg-primary text-white">
                  <i class="bi bi-envelope"></i>
                </span>
                                <input type="email" class="form-control" placeholder="Enter your email" name ="Email">
                            </div>
                        </div>
<%------Date--%>
                        <div class="mb-3">
                            <label class="form-label">Date</label>
                            <div class="input-group">
                <span class="input-group-text bg-primary text-white">
                  <i class="bi bi-envelope"></i>
                </span>
                                <input type="date" class="form-control" placeholder="Enter your Birth Date" name ="date">
                            </div>
                        </div>





                        <!-- Button -->
                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary btn-lg rounded-3">
                                Submit
                            </button>
                        </div>
                    </form>

                </div>
            </div>

        </div>
    </div>
</div>

<!-- Bootstrap JS -->

</body>
</html>

