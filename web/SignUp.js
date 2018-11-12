function validatePass(){
				var x = document.getElementById("pwdt").value;
				var y = document.getElementById("cpwdt").value;
				if(x != y){
					window.alert("password does not match");
					document.getElementById("cpwdt").style.background = "red";
					document.getElementById("pwdt").style.background = "red";
				}
				else{

					document.getElementById("cpwdt").style.background= "white";
					document.getElementById("pwdt").style.background = "white";
				}
			}