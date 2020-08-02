$(document).ready(function() {
  $("button").click(function(){
    var phoneNumber = $("#phoneNumber").val();
    var PHONENUMBER_REGAX = /^(((090|091)+([0-9]{7}))||((90|91)+([0-9]{7})))+$/;

    if(phone != "") {
      if (PHONENUMBER_REGAX.test(phone).matcher) {
        alert("SDT hợp lệ!!");
      } else {
        alert("SDT không đúng định dạng!");
      }
    } else {
      alert("Chưa điền số điện thoại!");
    }
  });
 });

$(document).ready(function() {
  $("button").click(function(){
    var email = $("#email").val();
    var EMAIL_REGEX = /^[a-zA-Z]+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

    if(email != "") {
        if (EMAIL_REGAX.test(email).matcher) {
            alert("Email hợp lệ!!");
        } else {
            alert("Email không đúng định dạng!");
        }
    } else {
        alert("Chưa điền Email!");
    }
  });
 });

$(document).ready(function() {
  $("button").click(function(){
    var quantity = $("#quantity").val();
    var flag = false;

    if (quantity > 0) {
      flag = true;
    } else {
      alert("Số lượng phải lớn hơn 0!");
      flag = false;
    } 
  });
 });

$(document).ready(function() {
  $("button").click(function(){
    var usedTime = $("#usedTime").val();
    var flag = false;

    if (usedTime > 0) {
      flag = true;
    } else {
      alert("Thời gian sử dụng phải lớn hơn 0!");
      flag = false;
    }
  });
 });

$(document).ready(function() {
  $("button").click(function(){
    var price = $("#price").val();
    var flag = false;

    if (price > 0) {
      flag = true;
    } else {
      alert("Đơn giá phải lớn hơn 0!");
      flag = false;
    } 
  });
 });

$('form').submit(function(e) {  
    var customerID = $("#customerID").val();
    var CUSTOMERID_REGEX = /^*KH[0-9]{5}/;
    if(customerID != "") {
        if (CUSTOMERID_REGEX.test(customerID).matcher) {
            alert("customerID hợp lệ!!");
        } else {
            alert("customerID không đúng định dạng!");
        }
    } else {
        alert("Chưa điền customerID!");
    }
 });

$(document).ready(function() {
  $("button").click(function(){
    var serviceID = $("#serviceID").val();
    var serviceID = /^*DV[0-9]{3}/;

    if(serviceID != "") {
        if (SERVICEID_REGEX.test(serviceID).matcher) {
            alert("serviceID hợp lệ!!");
        } else {
            alert("serviceID không đúng định dạng!");
        }
    } else {
        alert("Chưa điền serviceID!");
    }
  });
 });

