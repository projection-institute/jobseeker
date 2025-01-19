<%@include file="header.jsp"%>


<!-- Category Start -->
<div class="container-xxl py-5">
	<div class="container">
		<h1 class="text-center mb-5 wow fadeInUp" data-wow-delay="0.1s">Add
			Job</h1>
		<form method="post" action="addJobHandler">
			<!-- 2 column grid layout with text inputs for the first and last names -->
			<div class="row mb-4">
				<div class="col-lg-6">
					<div data-mdb-input-init class="form-outline">
						<input type="text" name="jobName" id="form3Example1"
							class="form-control" /> <label class="form-label"
							for="form3Example1">Job Name</label>
					</div>
				</div>
				<div class="col-lg-6">
					<div data-mdb-input-init class="form-outline">
						<input type="number" name="jobVacancy" id="form3Example2"
							class="form-control" /> <label class="form-label"
							for="form3Example2">Job Vacancy</label>
					</div>
				</div>
				<!-- Email input -->
				<div class="col-lg-6">
					<div data-mdb-input-init class="form-outline mb-4">
						<input type="text" name="jobLocation" id="form3Example3"
							class="form-control" /> <label class="form-label"
							for="form3Example3">Job Location</label>
					</div>
				</div>
				<!-- Email input -->
				<div class="col-lg-6">
					<div data-mdb-input-init class="form-outline mb-4">
						<input type="text" name="jobType" id="form3Example3"
							class="form-control" /> <label class="form-label"
							for="form3Example3">Job Type</label>
					</div>
				</div>

				<div class="col-lg-6">
					<!-- Email input -->
					<div data-mdb-input-init class="form-outline mb-4">
						<input type="text" name="jobPackage" id="form3Example3"
							class="form-control" /> <label class="form-label"
							for="form3Example3">Job Package</label>
					</div>
				</div>
				<!-- Email input -->
				<div class="col-lg-6">
					<div data-mdb-input-init class="form-outline mb-4">
						<input type="date" name="jobCreationDate" id="form3Example3"
							class="form-control" /> <label class="form-label"
							for="form3Example3">Job Creation Date</label>
					</div>
				</div>
				<!-- Email input -->
				<div class="col-lg-6">
					<div data-mdb-input-init class="form-outline mb-4">
						<input type="date" name="jobEndingDate" id="form3Example3"
							class="form-control" /> <label class="form-label"
							for="form3Example3">Job Ending Date</label>
					</div>
				</div>
				<!-- Email input -->
				<div class="col-lg-6">
					<div data-mdb-input-init class="form-outline mb-4">
						<input type="text" name="jobQualification" id="form3Example3"
							class="form-control" /> <label class="form-label"
							for="form3Example3">Job Qualification</label>
					</div>
				</div>

				<div class="col-lg-6">
					<!-- Email input -->
					<div data-mdb-input-init class="form-outline mb-4">
						<textarea name="jobDescription" class="form-control" id="exampleFormControlTextarea1"
							rows="3"></textarea>
						<label class="form-label" for="form3Example3">Job
							Description</label>
					</div>
				</div>

				<!-- Submit button -->
				<button class="btn btn-primary btn-block mb-4">Create Job</button>
			</div>
		</form>
	</div>
</div>
<!-- Category End -->

<%@include file="footer.jsp"%>
