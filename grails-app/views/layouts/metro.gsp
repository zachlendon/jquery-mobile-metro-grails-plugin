<!doctype html>
<html>
<head>
<title><g:layoutTitle default="Grails" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon"
	href="${resource(dir: 'images', file: 'favicon.ico')}"
	type="image/x-icon" />
<link rel="apple-touch-icon"
	href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
<r:require modules="jquery-mobile-metro" />
<r:layoutResources />
<g:layoutHead />
</head>
<body>
	<div data-role="page" data-cache="never" id="mainpage">
		<g:layoutBody />
	</div>
</body>
</html>