$(function () {
  //fadeOut results in the element being removed which could cause visual issues.
  //using fadeTo does not change the layout therefore making it a better choice.
  // $(".red-box").fadeTo(1000, 0.2);
  // $(".green-box").fadeTo(1000, 0.5);
  // $(".blue-box").fadeTo(1000, 0.8);
  // $(".blue-box").fadeToggle();
  // $(".blue-box").fadeToggle();
  // $(".blue-box").hide(1000);
  // $(".blue-box").show(1000);
  // $(".blue-box").slideToggle(2000);
  // $("p").hide();
  // $("p").slideDown(1000);
  //////////////////////////
  //Move box left and right
  //////////////////////////
  // $(".blue-box").animate(
  //   {
  //     "margin-left": "+=200px",
  //   },
  //   1000,
  //   "linear"
  // );
  // $(".blue-box").animate(
  //   {
  //     "margin-left": "-=200px",
  //   },
  //   1000,
  //   "linear"
  // );
  ////////////////////////
  //first custom animations
  //////////////////////////
  // $(".blue-box").animate(
  //   {
  //     marginLeft: "200px",
  //     opacity: "0",
  //     height: "50px",
  //     width: "50px",
  //     marginTop: "25px",
  //   },
  //   1000
  // );
  // $("p").animate(
  //   {
  //     fontSize: "20px",
  //   },
  //   1000
  // );
  //////////////////////////
  //Delay's and chaining
  //////////////////////////
  // $(".red-box").fadeTo(1000, 0.2);
  // $(".green-box").delay(1000).fadeTo(1000, 0.5);
  // $(".blue-box").delay(2000).fadeTo(1000, 0.8).fadeOut().delay(500).fadeIn();
  //////////////////////////
  //Timing animations & callback functions
  //////////////////////////
  // $(".red-box").fadeTo(1000, 0, function () {
  //   $(".green-box").fadeTo(1000, 0, function () {
  //     $(".blue-box").fadeTo(1000, 0);
  //   });
  // });
  // $(".blue-box")
  //   .delay(1000)
  //   .animate(
  //     {
  //       marginLeft: "200px",
  //       opacity: "0",
  //     },
  //     1000,
  //     function () {
  //       $(".green-box").animate(
  //         {
  //           marginLeft: "200px",
  //           opacity: "0",
  //         },
  //         1000,
  //         function () {
  //           $(".red-box").animate(
  //             {
  //               marginLeft: "200px",
  //               opacity: "0",
  //             },
  //             1000
  //           );
  //         }
  //       );
  //     }
  //   );
  //////////////////////////
  //Signup lightbox
  //////////////////////////
  //$(".lightbox").fadeIn(1000);
  //////////////////////////
  //Element selection
  //////////////////////////
  //$("li:odd").css("background-color", "rgba(180, 180, 30, 0.8)");
  //$("li:even").css("background-color", "rgba(180, 180, 30, 0.8)");
  //$("input:selected").css("background-color", "rgba(180, 180, 30, 0.8)");
  //////////////////////////
  //Methods of traversal
  //////////////////////////
  //$("#list").find("li").css("background-color", "rgba(180, 180, 30, 0.8)");
  //$("#list").children("li").css("background-color", "rgba(180, 180, 30, 0.8)");
  //$("#list").parents().css("background-color", "rgba(180, 180, 30, 0.8)");
  //$("#list").siblings(":header").css("background-color", "rgba(180, 180, 30, 0.8)");
  //////////////////////////
  //Methods of Filtering
  //////////////////////////
  //$("#list").find("li").filter(":even").css("background-color", "rgba(180, 180, 30, 0.8)");
  // $("li")
  //   .filter(function (index) {
  //     return index % 3 === 0;
  //   })
  //   .css("background-color", "rgba(180, 180, 30, 0.8)");
  //$("li").first().css("background-color", "rgba(180, 180, 30, 0.8)");
  //$("li").last().css("background-color", "rgba(180, 180, 30, 0.8)");
  //$("li").eq(5).css("background-color", "rgba(180, 180, 30, 0.8)");
  // $("li")
  //   .not(function (index) {
  //     return index % 3 === 2;
  //   })
  //   .css("background-color", "rgba(180, 180, 30, 0.8)");
  //////////////////////////
  //Adding new elements to the DOM
  //////////////////////////
  //$("ul ul:first").append("<li> I'm gonna be the last sub item </li>");
  //$("<li> I'm gonna be the last item </li>").appendTo($("ul ul:first"));
  //$("ul ul").prepend("<li> I'm gonna be the first sub item </li>");
  //$("<h4> Jack Grant </h4>").prependTo("#content");
  //$(".red-box").after("<div class='red-box'> Another red </div>");
  //$(".blue-box").before("<div class='blue-box'> Blue friend</div>");
  // $(".blue-box").before(function () {
  //   return "<div class='blue-box'> Blue 2 </div>";
  // });
  //$(".blue-box").before($(".red-box"));
  //////////////////////////
  //Replacing elements on the DOM
  //////////////////////////
  //$("li").replaceWith("<li>Replaced.</li>");
  // $("li").replaceWith(function () {
  //   return "<li>Replaced with function</li>";
  // });
  // var firstListItem = $("li:first");
  // $("p:first").replaceWith(firstListItem);
  //$(".red-box").replaceWith($("<div class='green-box'> was red</div>"));
  //$(".blue-box").replaceWith($("<div class='green-box'> was blue</div>"));
  // $("<div class='green-box'>More green</div>").replaceAll(
  //   ".red-box, .blue-box"
  // );
  //////////////////////////
  //Removing elements on the DOM
  //////////////////////////
  //$("li").remove();
  //$("form").children().not("input:text, textarea, br").remove();
  // var detachedListItem = $("li").detach();
  // $("#content").append(detachedListItem);
  // $("p:first").empty();
  // $(".red-box, .blue-box, .green-box").empty();
  //////////////////////////
  //Manipulating elements and content
  //////////////////////////
  // var specialLink = $("#special-link");
  // console.log(specialLink.attr("href"));
  // specialLink.attr("href", "http://google.com");
  // var checkbox = $("input:checkbox");
  // console.log(checkbox.prop("checked"));
  // console.log(checkbox.attr("checked"));
  // var textInput = $("input:text");
  // textInput.val("Jack Grant");
  // console.log(textInput.val());
  // var rangeInput = $("input[type='range']");
  // console.log(rangeInput.val());
  //////////////////////////
  //Slide show
  //////////////////////////
  // var galleryImage = $(".gallary").find("img").first();
  // var images = [
  //   "images/laptop-mobile_small.jpg",
  //   "images/laptop-on-table_small.jpg",
  //   "images/people-office-group-team_small.jpg",
  // ];
  // var i = 0;
  // setInterval(function () {
  //   i = (i + 1) % images.length;
  //   galleryImage.fadeOut(function () {
  //     $(this).attr("src", images[i]);
  //     $(this).fadeIn();
  //   });
  //   console.log(galleryImage.attr("src"));
  // }, 2000);
  //////////////////////////
  //Changing CSS props
  //////////////////////////
  //$(".gallary").css("display", "none");
  // var redBox = $(".red-box");
  // console.log(redBox.css("width"));
  // redBox.css("background-color", "#AA7700");
  // $("p").css("font-size", "18px");
  // redBox.css("width", "+=20px");
  // var props = $("p").css(["font-size", "line-height", "color"]);
  // console.log(props);
  // console.log(props["font-size"]);
  // redBox.css("user-select", "none");
  //////////////////////////
  //adding or removing CSS classes
  //////////////////////////
  // $(".gallary").css("display", "none");
  // $("a").addClass("fancy-link");
  // $("p:first").addClass("large emphasize");
  // $("li li").addClass(function (index) {
  //   $(this).addClass("item-" + index);
  // });
  // $("div").addClass(function (index, currentClass) {
  //   if (currentClass === "dummy") {
  //     return "red-box";
  //   }
  // });
  // $(".red-box").removeClass("red-box").addClass("blue-box");
  //$(".dummy").removeClass("dummy").addClass("green-box");
  //////////////////////////
  //Changing data of an element
  //////////////////////////
  // var gallery = $(".gallary");
  // var images = [
  //   "images/laptop-mobile_small.jpg",
  //   "images/laptop-on-table_small.jpg",
  //   "images/people-office-group-team_small.jpg",
  // ];
  // gallery.data("availableImages", images);
  // console.log(gallery.data("availableImages"));
  // gallery.data("name", "The awesome gallery");
  // console.log(gallery.data());
  // gallery.removeData("name");
  // console.log(gallery.data("name"));
  // var firstPar = $("p:first");
  // console.log(firstPar.data("mydata"));
  //////////////////////////
  //Retriebing and changing the content of an element
  //////////////////////////
  // var firstPar = $("p:first");
  // console.log(firstPar.text());
  // console.log(firstPar.html());
  //firstPar.html("<strong> Hello </strong> world!");
  //firstPar.append(" This was just appened");
  //firstPar.html(firstPar.html() + "This was just appened");
  //////////////////////////
  //Adding click event handlers
  //////////////////////////
  // $("#btn-click").click(function (event) {
  //   console.log(event);
  //   alert("Button was clicked");
  // });
  // $(".red-box").click(function () {
  //   $(this).fadeTo(500, 0.5);
  // });
  //////////////////////////
  //Adding hover event handlers
  //////////////////////////
  // $("#btn-hover").hover(function () {
  //   alert("Button was hovered");
  // });
  // $(".green-box").hover(function () {
  //   $(this).text("I was hovered");
  // });
  //////////////////////////
  //Adding mouseEnter & mouseLeave event handlers
  //////////////////////////
  // var blueBox = $(".blue-box");
  // blueBox.mouseenter(function () {
  //   $(this).stop().fadeTo(500, 0.7);
  // });
  // blueBox.mouseleave(function () {
  //   $(this).stop().fadeTo(500, 1);
  // });
  //////////////////////////
  //Adding the same handler for multiple events
  //////////////////////////
  // $("html").on("click keydown", function () {
  //   console.log("Mouse was clicked or key was pressed");
  // });
  // var galleryImage = $(".gallary").find("img").first();
  // var images = [
  //   "images/laptop-mobile_small.jpg",
  //   "images/laptop-on-table_small.jpg",
  //   "images/people-office-group-team_small.jpg",
  // ];
  // var i = 0;
  // $(".gallary").on("click", function () {
  //   i = (i + 1) % images.length;
  //   galleryImage.fadeOut(function () {
  //     galleryImage.attr("src", images[i]).fadeIn();
  //   });
  // });
  //////////////////////////
  //Modularizing event handlers
  //////////////////////////
  // $("html").on("click keydown", logEvent);
  // function logEvent() {
  //   console.log("Mouse was clicked or key was pressed");
  // }
  // var galleryImage = $(".gallary").find("img").first();
  // var images = [
  //   "images/laptop-mobile_small.jpg",
  //   "images/laptop-on-table_small.jpg",
  //   "images/people-office-group-team_small.jpg",
  // ];
  // var i = 0;
  // $(".gallary").on("click", switchToNextImage);
  // function switchToNextImage() {
  //   i = (i + 1) % images.length;
  //   galleryImage.fadeOut(function () {
  //     galleryImage.attr("src", images[i]).fadeIn();
  //   });
  // }
  //////////////////////////
  //Delegated events
  //////////////////////////
  // $("p").click(function () {
  //   $(this).slideUp();
  // });
  // $("#content").append("<p>This is a dynamically added paragraph. </p>");
  // $("#content").on("click", "p", function () {
  //   $(this).slideUp();
  // });
  // $("#content").append("<p>This is a dynamically added paragraph. </p>");
  // $("body").on("mouseenter", "li", function () {
  //   $(this).css("color", "red");
  // });
  //////////////////////////
  //Passing additional data to event
  //////////////////////////
  // $("#btn-click").click(
  //   {
  //     user: "peter",
  //     domain: "www.google.com",
  //   },
  //   function (event) {
  //     greetUser(event.data);
  //   }
  // );
  // function greetUser(userData) {
  //   username = userData.user || "Anonymous";
  //   domain = userData.domain || "example.com";
  //   alert("Welcome back " + username + "!" + " from " + domain);
  // }
  //////////////////////////
  //Creating image gallery with lightbox preview
  //////////////////////////
  // var gallleryItems = $(".gallary").find("img");
  // gallleryItems.css("width", "33%").css("opacity", "0.7");
  // gallleryItems.mouseenter(function () {
  //   $(this).stop().fadeTo(500, 1);
  // });
  // gallleryItems.mouseleave(function () {
  //   $(this).stop().fadeTo(500, 0.7);
  // });
  // gallleryItems.click(function () {
  //   var source = $(this).attr("src");
  //   var image = $("<img>").attr("src", source).css("width", "100%");
  //   $(".lightbox").empty().append(image).fadeIn(1000);
  // });
  // $(".lightbox").click(function () {
  //   $(this).stop().fadeOut();
  // });
  //////////////////////////
  //Handling keydown & keyup events
  //////////////////////////
  // var arrowRight = 39;
  // $("html").keydown(function (event) {
  //   var key = event.which;
  //   if (key === arrowRight) {
  //     $(".blue-box").stop().animate(
  //       {
  //         marginLeft: "+=10px",
  //       },
  //       50
  //     );
  //   }
  // });
  //////////////////////////
  //Focus & blur events
  //////////////////////////
  // var inputFields = $("input:text, input:password, textarea");
  // inputFields.focus(function () {
  //   $(this).css("box-shadow", "0 0 4px #666");
  // });
  // inputFields.blur(function () {
  //   $(this).css("box-shadow", "none");
  // });
  // $("#name").blur(function () {
  //   var text = $(this).val();
  //   if (text.length >= 3) {
  //     $(this).css("box-shadow", "0 0 4px green");
  //   } else {
  //     $(this).css("box-shadow", "0 0 4px red");
  //   }
  // });
  //////////////////////////
  //Change events
  //////////////////////////
  // $("#checkbox").change(function () {
  //   var isChecked = $(this).is(":checked");
  //   if (isChecked) {
  //     $(this).add("label[for='cb']").css("box-shadow", "0 0 4px green");
  //   } else {
  //     $(this).add("label[for='cb']").css("box-shadow", "0 0 4px red");
  //   }
  // });
  // $("#cars").change(function () {
  //   var currentSelected = $(this).find(":selected").text();
  //   alert(`A ${currentSelected} car has been selected`);
  // });
  //////////////////////////
  //Handling submit events
  //////////////////////////
  // $("#form").submit(function (event) {
  //   var textarea = $("#message");
  //   if (textarea.val().trim() == "") {
  //     textarea.css("box-shadow", "0 0 4px red");
  //     event.preventDefault();
  //   } else {
  //   }
  // });
  //////////////////////////
  //Complete form validation #1
  //////////////////////////
  // var form = $("#form");
  // enableFastFeedback(form);
  // form.submit(function (event) {
  //   var name = $("#name").val();
  //   var password = $("#password").val();
  //   var message = $("#message").val().trim();
  //   var checked = $("#checkbox").is(":checked");
  //   validateNameField(name, event);
  //   validatePasswordField(password, event);
  //   validateMessageField(message, event);
  //   validateCheckedField(checked, event);
  // });
  //////////////////////////
  //Fetching a server file with Jquery
  //////////////////////////
  // $("#code").load("js/script.js");
  // $("#code").load("js/script.js", function (responce, status) {
  //   if (status == "error") {
  //     alert("Could not find file");
  //   }
  //   console.log(responce);
  // });
  //////////////////////////
  //Flickr API
  //////////////////////////
  // var flickrApiUrl =
  //   "https://www.flickr.com/services/feeds/photos_public.gne?jsoncallback=?";
  // $.getJSON(flickrApiUrl, {
  //   tags: "sun, outside",
  //   tagmode: "any",
  //   format: "json",
  // })
  //   .done(function (data) {
  //     console.log(data);
  //     $.each(data.items, function (index, item) {
  //       console.log(item);
  //       $("<img>").attr("src", item.media.m).appendTo("#flickr");
  //       if (index == 4) {
  //         return false;
  //       }
  //     });
  //   })
  //   .fail(function () {
  //     alert("Ajax call failed");
  //   });
  //////////////////////////
  //Star wars API
  //////////////////////////
  var starWarsApi = "https://swapi.dev/api/starships/";
  var starshipByName = "https://swapi.dev/api/starships/";

  $.getJSON(starWarsApi)
    .done(function (data) {
      $.each(data.results, function (index, starship) {
        var name =
          starship.name.charAt(0).toUpperCase() + starship.name.slice(1);
        var link = $("<a>")
          .attr("id", starship.name)
          .attr("href", "#")
          .append($("<strong>").text(name));
        var par = $("<p>")
          .html("Starship model no. " + (index + 1) + " is ")
          .append(link);

        link.click(function (event) {
          console.log(starship);
          var starshipDiv = $("#starship-details");
          starshipDiv.empty();
          starshipDiv.append("<h2>" + name + "</h2>");
          event.preventDefault();
        });
        par.appendTo("#starships");
      });
    })
    .fail(function () {
      console.log("Request to star wars API failed");
    })
    .always(function () {
      console.log("Star wars is awesome");
    });
});

//////////////////////////
//Complete form validation #2
//////////////////////////
function enableFastFeedback(formElement) {
  var nameInput = formElement.find("#name");
  var passwordInput = formElement.find("#password");
  var messageInput = formElement.find("#message");
  var checkedInput = formElement.find("#checkbox");

  nameInput.blur(function (event) {
    var name = $(this).val();
    validateNameField(name, event);

    if (!isValidName(name)) {
      $(this).css({
        "box-shadow": "0 0 4px red",
        border: "1px solid #600",
      });
    } else {
      $(this).css({
        "box-shadow": "0 0 4px #181",
        border: "1px solid #060",
      });
    }
  });

  passwordInput.blur(function (event) {
    var password = $(this).val();
    validatePasswordField(password, event);

    if (!isValidPassword(password)) {
      $(this).css({
        "box-shadow": "0 0 4px red",
        border: "1px solid #600",
      });
    } else {
      $(this).css({
        "box-shadow": "0 0 4px #181",
        border: "1px solid #060",
      });
    }
  });

  messageInput.blur(function (event) {
    var message = $(this).val();
    validateMessageField(message, event);

    if (!isValidMessageField(message)) {
      $(this).css({
        "box-shadow": "0 0 4px red",
        border: "1px solid #600",
      });
    } else {
      $(this).css({
        "box-shadow": "0 0 4px #181",
        border: "1px solid #060",
      });
    }
  });

  checkedInput.change(function (event) {
    var isChecked = $(this).is(":checked");
    validateCheckedField(isChecked, event);

    if (!isChecked) {
      $(this).add("label[for='cb']").css({
        "box-shadow": "0 0 4px red",
        border: "1px solid #600",
      });
    } else {
      $(this).add("label[for='cb']").css({
        "box-shadow": "0 0 4px #181",
        border: "1px solid #060",
      });
    }
  });
}

function validateNameField(name, event) {
  if (!isValidName(name)) {
    $("#name-feedback").text("Please enter atleast two charecters");
    event.preventDefault();
  } else {
    $("#name-feedback").text("");
  }
}

function isValidName(name) {
  return name.length >= 2;
}

function validatePasswordField(password, event) {
  if (!isValidPassword(password)) {
    $("#password-feedback").text(
      "Please enter atleast six charecters and and some numbers"
    );
    event.preventDefault();
  } else {
    $("#password-feedback").text("");
  }
}

function isValidPassword(password) {
  return password.length >= 6 && /.*[0-9].*/.test(password);
}

function validateMessageField(message, event) {
  if (!isValidMessageField(message)) {
    $("#message-feedback").text("Please enter a message");
    event.preventDefault();
  } else {
    $("#message-feedback").text("");
  }
}

function isValidMessageField(message) {
  return message != "";
}

function validateCheckedField(checked, event) {
  if (!checked) {
    $("#checkbox-feedback").text("Please agree to this");
    event.preventDefault();
  } else {
    $("#checkbox-feedback").text("");
  }
}
