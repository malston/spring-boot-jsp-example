<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<body>
	<div>
		<div>
			<h1>Another page</h1>
			<h2>${message}</h2>
			
			Click on this <strong><a href="/?message=${message}">link</a></strong> to visit previous page.
		</div>
	</div>
</body>
</html>