<!DOCTYPE html>
<html lang="en">
<head>
<title>Register Here</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="../resources/static/images/Favicon.png" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../resources/static/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../resources/static/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../resources/static/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../resources/static/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../resources/static/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../resources/static/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../resources/static/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="../resources/static/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="../resources/static/css/loginutil.css">
<link rel="stylesheet" type="text/css" href="../resources/static/css/register.css">
<!--===============================================================================================-->
</head>
<title>Register Here</title>
<body>

	<div class="limiter">
		<div class="container-login100"
			style="background-image: url('../resources/static/images/bg-01.jpg');">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
				<form class="login100-form validate-form" method="post"
					action="create-user">
					<span class="login100-form-title p-b-36"> Register </span> <input
						type="hidden" name="id" value="${user.id}">
					<div class="wrap-input100 validate-input m-b-23"
						data-validate="Username is reauired">
						<input class="input100" type="text" name="firstname" required=""
							value="${user.firstName}"> <span class="label-input100">First
							Name</span> <span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-23"
						data-validate="Username is reauired">
						<input class="input100" type="text" name="username"
							value="${user.lastName}" required=""> <span
							class="label-input100">Last Name</span> <span
							class="focus-input100" data-symbol="&#xf206;"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-23"
						data-validate="Username is reauired">
						<input class="input100" type="text" name="username"
							value="${user.phoneNumber}" required=""> <span
							class="label-input100">Phone</span> <span class="focus-input100"
							data-symbol="&#xf095;"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-23"
						data-validate="Username is reauired">
						<input class="input100" type="text" name="username"
							value="${user.email}" required=""> <span
							class="label-input100">Email</span> <span class="focus-input100"
							data-symbol="&#xf003;"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-23"
						data-validate="Username is reauired">
						<input class="input100" type="text" name="username"
							value="${user.courseName}" required=""> <span
							class="label-input100">Course Name</span> <span class="focus-input100"
							data-symbol="&#xf003;"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-23"
						data-validate="Username is reauired">
						<input class="input100" type="password" name="username" value="${user.password}" required="">
						<span class="label-input100">Password</span> <span
							class="focus-input100" data-symbol="&#xf190;"></span>
					</div>

					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" type="password" name="pass" required="">
						<span class="label-input100">Confirm Password</span> <span
							class="focus-input100" data-symbol="&#xf087;"></span>
					</div>

					<div class="text-right p-t-8 p-b-31">
						<a href="#"> Forgot password? </a>
					</div>

					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Register</button>
						</div>
					</div>

					<div class="txt1 text-center p-t-54 p-b-20">
						<span> Or Sign Up Using </span>
					</div>

					<div class="flex-c-m">
						<a href="#" class="login100-social-item bg1"> <i
							class="fa fa-facebook"></i>
						</a> <a href="#" class="login100-social-item bg2"> <i
							class="fa fa-twitter"></i>
						</a> <a href="#" class="login100-social-item bg3"> <i
							class="fa fa-google"></i>
						</a>
					</div>

					<div class="flex-col-c p-t-95">
						<span class="txt1 p-b-17"> Already have an account? Login
							here. </span> <a href="login.jsp" class="txt2"> Login </a>
					</div>
				</form>
			</div>
		</div>
	</div>


	<div id="dropDownSelect1"></div>

	<!--===============================================================================================-->
	<script src="../vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="../vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="../vendor/bootstrap/js/popper.js"></script>
	<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="../vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="../vendor/daterangepicker/moment.min.js"></script>
	<script src="../vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="../vendor/countdowntime/countdowntime.js"></script>
	<!--===============================================================================================-->
	<script src="../js/main.js"></script>

</body>
</html>