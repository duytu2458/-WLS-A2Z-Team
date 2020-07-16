function checkPhoneNumber(){
    var PHONENUMBER_REGAX = /^(((090|091)+([0-9]{7}))||((90|91)+([0-9]{7})))+$/;

    var phone = document.getElementById("phoneNumber").value();
    if(phone != "") {
        if (phone.test(PHONENUMBER_REGAX).matcher) {
            alert("SDT hợp lệ!!");
        } else {
            alert("SDT không đúng định dạng!");
        }
    } else {
        alert("Chưa điền số điện thoại!");
    }
}

function checkEmail(){
	var EMAIL_REGEX = /^[a-zA-Z]+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	var email = document.getElementById("email").value();

	if(email != "") {
       	if (email.test(EMAIL_REGEX).matcher) {
            alert("Email hợp lệ!!");
        } else {
            alert("Email không đúng định dạng!");
        }
    } else {
        alert("Chưa điền Email!");
    }
}

function checkQuantity(){
	var quantity = document.getElementById("quantity").value();

	var flag = false;

	if (quantity > 0) {
		flag = true;
	} else {
		alert("Số lượng phải lớn hơn 0!");
		flag = false;
	} 
}

function checkUsedTime(){
	var usedTime = document.getElementById("usedTime").value();
	var flag = false;

	if (usedTime > 0) {
		flag = true;
	} else {
		alert("Thời gian sử dụng phải lớn hơn 0!");
		flag = false;
	}
}

function checkPrice(){
	var price = document.getElementById("price").value();
	var flag = false;

	if (price > 0) {
		flag = true;
	} else {
		alert("Đơn giá phải lớn hơn 0!");
		flag = false;
	} 
}

function checkCustomerID(){
	var CUSTOMERID_REGEX = /^*KH[0-9]{5}/;
	var customerID = document.getElementById("customerID").value();

	if(customerID != "") {
       	if (customerID.test(CUSTOMERID_REGEX).matcher) {
            alert("customerID hợp lệ!!");
        } else {
            alert("customerID không đúng định dạng!");
        }
    } else {
        alert("Chưa điền customerID!");
    }
}

function checkServiceID(){
	var SERVICEID_REGEX = /^*DV[0-9]{3}/;

	var serviceID = document.getElementById("serviceID").value();

	if(serviceID != "") {
       	if (serviceID.test(SERVICEID_REGEX).matcher) {
            alert("serviceID hợp lệ!!");
        } else {
            alert("serviceID không đúng định dạng!");
        }
    } else {
        alert("Chưa điền serviceID!");
    }
}