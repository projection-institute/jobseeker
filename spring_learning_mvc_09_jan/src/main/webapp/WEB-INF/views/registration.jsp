<%@include file="header.jsp"%>


<!-- Category Start -->
<div class="container-xxl py-5">
	<div class="container">
		<h1 class="text-center mb-5 wow fadeInUp" data-wow-delay="0.1s">Create an Account</h1>
		<div class="row">
		<div class="col-lg-3"></div>
		<div class="col-lg-6">
			<form method="post" action="auth/register">
				<!-- 2 column grid layout with text inputs for the first and last names -->
				<div class="row mb-4">
					<div class="col">
						<div data-mdb-input-init class="form-outline">
							<input type="text" name="name" id="form3Example1" class="form-control" /> <label
								class="form-label" for="form3Example1">First name</label>
						</div>
					</div>
					<div class="col">
						<div data-mdb-input-init class="form-outline">
							<input type="text" name="phone" id="form3Example2" class="form-control" /> <label
								class="form-label" for="form3Example2">Mobile Number</label>
						</div>
					</div>
				</div>

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

				<!-- Checkbox -->
				<div class="form-check d-flex justify-content-center mb-4">
					<input class="form-check-input me-2" type="checkbox" value=""
						id="form2Example33" checked /> <label class="form-check-label"
						for="form2Example33"> Subscribe to our newsletter </label>
				</div>

				<!-- Submit button -->
				<button 
					class="btn btn-primary btn-block mb-4">Sign up</button>

				<!-- Register buttons -->
				<div class="text-center">
				<a href="<%=request.getContextPath()%>">Already have an account?</a>
					<p>or sign in with:</p>
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
