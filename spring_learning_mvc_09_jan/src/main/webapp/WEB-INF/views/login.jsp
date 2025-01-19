<%@page import="com.beans.User"%>
<%@include file="header.jsp"%>
<%
	User user = (User)session.getAttribute("user_info");
	if (user != null){
		response.sendRedirect(request.getContextPath() + "/home");
	}
%>

<!-- Category Start -->
<div class="container-xxl py-5">
	<div class="container">
		<h1 class="text-center mb-5 wow fadeInUp" data-wow-delay="0.1s">Login</h1>
		<div class="row">
		<div class="col-lg-3"></div>
		<div class="col-lg-6">
			<form method="post" action="auth/login">
			
				<!-- Email input -->
				<div data-mdb-input-init class="form-outline mb-4">
					<input type="email" name="email" id="form3Example3" class="form-control" /> <label
						class="form-label" for="form3Example3">Email address</label>
				</div>

				<!-- Password input -->
				<div data-mdb-input-init class="form-outline mb-4">
					<input type="password" name="password" id="form3Example4" class="form-control" />
					<label class="form-label" for="form3Example4">Password</label>
				</div>

				<!-- Submit button -->
				<button 
					class="btn btn-primary btn-block mb-4">Login</button>
				
				<!-- Register buttons -->
				<div class="text-center">
				<a href="registration">Create an account?</a>
					<p>or sign up with:</p>
					<button data-mdb-ripple-init type="button"
						class="btn btn-secondary btn-floating mx-1">
						<i class="fab fa-facebook-f"></i>
					</button>

					<button data-mdb-ripple-init type="button"
						class="btn btn-secondary btn-floating mx-1">
						<i class="fab fa-google"></i>
					</button>

					<button data-mdb-ripple-init type="button"
						class="btn btn-secondary btn-floating mx-1">
						<i class="fab fa-twitter"></i>
					</button>

					<button data-mdb-ripple-init type="button"
						class="btn btn-secondary btn-floating mx-1">
						<i class="fab fa-github"></i>
					</button>
				</div>
			</form>
			</div>
			<div class="col-lg-3"></div>
		</div>
		
		
	</div>
</div>
<!-- Category End -->

<%@include file="footer.jsp"%>
