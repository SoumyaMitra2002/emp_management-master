
    //sticky navbar
    $(window).on("scroll", function () {
      var scroll = $(window).scrollTop();
      if (scroll < 100) {
        $(".sticky-header").removeClass("sticky");
      } else {
        $(".sticky-header").addClass("sticky");
      }
    });


    // background image
  function dataBackgroundImage() {
    $("[data-bgimg]").each(function () {
      var bgImgUrl = $(this).data("bgimg");
      $(this).css({
        "background-image": "url(" + bgImgUrl + ")", // concatenation
      });
    });
  }

  $(window).on("load", function () {
    dataBackgroundImage();
  });

  //for carousel slider of the slider section
  $(".slider_area").owlCarousel({
    animateOut: "fadeOut",
    autoplay: true,
    loop: true,
    nav: false,
    autoplayTimeout: 6000,
    items: 1,
    dots: true,
  });