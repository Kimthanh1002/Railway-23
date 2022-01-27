function changeProductList(element) {
  let tabs = document.getElementsByClassName("tab-items");
  for (i = 0; i < tabs.length; i++) {
    tabs[i].style.background = "white";
  }

  element.style.background = "#ee4d2d";
}
function getGroup() {
  $.ajax({
    url: "https://61ed2690f3011500174d22ec.mockapi.io/group",
    type: "GET",
    success: function (result) {
      var table =
        "<table ><tr ><th><input type='checkbox'></th><th>STT</th><th>Group Name</th><th>Member</th><th>Creator</th><th>Create Date</th></tr>";
      result.forEach((element) => {
        var rows =
          "<tr class = 'row' onclick = 'editGroup(this)'><td><input name = 'checkbox' type='checkbox' value ='" +
          element.tt +
          "'></i></td><td>" +
          element.tt +
          "</td><td >" +
          element.groupName +
          "</td><td>" +
          element.member +
          "</td><td>" +
          element.creator +
          "</td><td>" +
          element.createDate +
          "</td></tr>";
        table += rows;
      });
      table += "</table>";
      document.getElementById("get").innerHTML = table;
    },
  });
}
function rowCol() {
  let rowCol = document.getElementsByClassName("row");
  for (i = 0; i < rowCol.length; i += 2) {
    rowCol[i].style.background = "rgb(240, 231, 231)";
  }
}

setTimeout(function rowCol() {
  let rowCol = document.getElementsByClassName("row");
  for (i = 0; i < rowCol.length; i += 2) {
    rowCol[i].style.background = "rgb(240, 231, 231)";
  }
}, 400);

function createGroup() {
  let group_name = document.getElementById("groupName").value;
  member = document.getElementById("member").value;
  creator = document.getElementById("creator").value;
  createDate = document.getElementById("createDate").value;
  let group = {
    groupName: group_name,
    member: member,
    creator: creator,
    createDate: 20211012,
  };
  let j = 0;
  $.ajax({
    url: "https://61ed2690f3011500174d22ec.mockapi.io/group",
    type: "GET",
    success: function (result) {
      result.forEach((element) => {
        if (group_name == element.groupName) {
          return (j = 1);
        }
      });
      if (j == 1) {
        alert("group existed");
      } else {
        $.ajax({
          url: "https://61ed2690f3011500174d22ec.mockapi.io/group",
          type: "POST",
          data: group,
          success: function (result) {
            if (result == undefined || result == null) {
              alert("error");
              return;
            } else {
              alert("create success");
              $("#modal").hide();
              $("#create_group").hide();
            }
          },
        });
      }
    },
  });
}

function deleteGroup() {
  var checkboxValues = [];
  $("input[name=checkbox]:checked").map(function () {
    checkboxValues.push($(this).val());
  });
  if (checkboxValues.length > 1 || checkboxValues.length == 0) {
    alert("chỉ chọn 1 group");
  } else {
    idGroup = checkboxValues[0];
    delConfirm = confirm("bạn muốn xoá group có id là: " + idGroup);
    if (delConfirm == true) {
      $.ajax({
        url:
          "https://61ed2690f3011500174d22ec.mockapi.io/group/" +
          parseInt(idGroup),
        type: "DELETE",
        success: function (result) {
          if (result == undefined || result == null) {
            alert("error");
            return;
          } else {
            alert("delete success");
            $("#modal").hide();
            $("#delete_group").hide();
          }
        },
      });
    } else {
      return;
    }
  }
}

$(document).ready(function () {
  $("#openModal").click(function () {
    $("#modal").show();
    $("#create_group").show();
  });

  $("#close").click(function () {
    $("#modal").hide();
    $("#create_group").hide();
  });

  $("#deleteModal").click(function () {
    $("#modal").show();
    $("#delete_group").show();
  });

  $("#close1").click(function () {
    $("#modal").hide();
    $("#delete_group").hide();
  });

  $("#close2").click(function () {
    $("#modal").hide();
    $("#editModal").hide();
  });

  $("#editIcon").click(function () {
    $("#modal").show();
    $("#editGrNameModal").show();
  });

  $("#close3").click(function () {
    $("#modal").hide();
    $("#editGrNameModal").hide();
  });
});

function editGroup(element) {
  element.setAttribute("id", "choose");
  let k = element.innerText.split("	");
  document.getElementById("stt").innerHTML = "STT: " + k[1];
  document.getElementById("grName").innerHTML = k[2];
  document.getElementById("nameInputed").setAttribute("value", k[2]);
  document.getElementById("mber").innerHTML = "Member: " + k[3];
  document.getElementById("crtor").innerHTML = "Creator: " + k[4];
  document.getElementById("crDate").innerHTML = "Create Date: " + k[5];
  $("#choose").click(function () {
    $("#modal").show();
    $("#editModal").show();
    element.setAttribute("id", "nothing");
  });
}
function editGroupName() {
  let idGroup = document.getElementById("stt").innerHTML.match(/[0-9]+/)[0];
  newName = document.getElementById("nameInputed").value;
  let j = 0;
  $.ajax({
    url: "https://61ed2690f3011500174d22ec.mockapi.io/group",
    type: "GET",
    success: function (result) {
      result.forEach((element) => {
        if (newName == element.groupName) {
          return (j = 1);
        }
      });
      if (j == 1) {
        alert("group existed");
      } else {
        let groupName1 = { groupName: newName };

        upConfirm = confirm("bạn có muốn sửa tên group thành : " + newName);
        if (upConfirm == true) {
          $.ajax({
            url:
              "https://61ed2690f3011500174d22ec.mockapi.io/group/" +
              parseInt(idGroup),
            type: "PUT",
            data: groupName1,
            success: function (result) {
              if (result == undefined || result == null) {
                alert("error");
                return;
              } else {
                alert("update success");
                $("#modal").hide();
                $("#editGrNameModal").hide();
                $("#modal").hide();
                $("#editModal").hide();

              }
            },
          });
        } else {
          return;
        }
      }
    },
  });
}
