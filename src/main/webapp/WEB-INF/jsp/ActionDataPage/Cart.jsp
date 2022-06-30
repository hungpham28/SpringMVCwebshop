
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800" rel="stylesheet">
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<style type="text/css">
.container{
	max-width: 980px!important;
	overflow: unset!important;
}
.content:not(:last-child) {
    margin-bottom: 0!important;
}
.content h2:not(:first-child) {
    margin-top: 0!important;
}
</style>
</head>
<body>

  <%@ include file="MasterPage/Header.jsp"%>
  <link href="/WebShop/style/assets/css/notify.css" rel="stylesheet" />
  <link href="/WebShop/style/assets/css/stylePageCart.css" rel="stylesheet" />
      
  <header id="site-header">
    <div class="container">
      <h1>Shopping cart <span>[</span> <em><a href="" target="_blank">CodePen Challange</a></em> <span class="last-span is-open">]</span></h1>
    </div>
  </header>

  <div class="container">
    <section id="cart"> 
     <c:forEach var="cart" items="${itemCartList}">
     <c:set var="product"  value="${cart.product}"></c:set>
     <c:set var="shop" value="${product.shop}"/>
     
      <article class="product">
        <header>
          <a href="GioHang?cartID=${cart.id}&actionCart=remove" class="remove">
            <img src="${product.url}" alt="">

            <h3>Remove product</h3>
          </a>
        </header>

        <div class="content">

          <h1>${shop.nameShop}</h1>
		${product.product}
          <div title="You have selected this product to be shipped in the color yellow." style="top: 0" class="color yellow"></div>
          <div style="top: 43px" class="type small">${cart.feature}</div>
        </div>

        <footer class="content">
          <a href="GioHang?cartID=${cart.id}&actionCart=minus&quantity=cart.getQuantity()"><span class="qt-minus">-</span></a>
          <span class="qt">${cart.quantity}</span>
          <a href="GioHang?cartID=${cart.id}&actionCart=plus&quantity=${cart.quantity}"><span class="qt-plus">+</span></a>

          <h2 class="full-price">
          	${FormNumber.formMoney(product.salePrice*cart.quantity)}đ
          </h2>

          <h2 class="price">
          	${FormNumber.formMoney(product.salePrice)}đ
          </h2>
        </footer>
      </article>
</c:forEach>
    </section>

  </div>
<c:set var="tax" value />

  <div id="notify" class="close">
  <div id="success-box" class="close">
  <span></span>
    <div class="dot"></div>
    <div class="dot two"></div>
    <div class="face">
      <div class="eye"></div>
      <div class="eye right"></div>
      <div class="mouth happy"></div>
    </div>
    <div class="shadow scale"></div>
    <div class="message"><h1 class="alert">Success!</h1><p>Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi!</p></div>
    <form method="post"><input name="totalMoney" style="display: none" value="<%=0+0+20000%>"> <button class="button-box"><h1 class="green">Xác Nhận</h1></button></form> 
  </div>
  <div id="error-box" class="close">
    <div class="dot"></div>
    <div class="dot two"></div>
    <div class="face2">
      <div class="eye"></div>
      <div class="eye right"></div>
      <div class="mouth sad"></div>
    </div>
    <div class="shadow move"></div>
    <div class="message"><h1 class="alert">Not Enough Money!</h1><p>Vui lòng nạp thêm tiền!</div>
    <button class="button-box"><a href="Payment"><h1 class="red" style="background-color: #FFFF">Nạp Tiền</h1></a> </button>
  </div>
</div>
<script type="text/javascript">
let btn_eror= document.querySelector('.btn-eror');
let btn_success= document.querySelector('.btn-success');
if(btn_eror)
	document.querySelector('.btn-eror').addEventListener('click',()=>{ 
		document.getElementById('notify').classList.remove('close');
		document.getElementById('error-box').classList.remove('close');
	});
if(btn_success)
	document.querySelector('.btn-success').addEventListener('click',()=>{
		document.getElementById('notify').classList.remove('close');
		document.getElementById('success-box').classList.remove('close');
	});

</script>
</body>
</html>