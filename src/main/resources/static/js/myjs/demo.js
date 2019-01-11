function queryUser() {
    $.ajax({
        url: "/regist.html",
        global: false,
        type: "GET",
        dataType: "html",
        async: true,
        success: function(msg) {
            $(".layui-body").html(msg);
        }
    });
}