

$(document).ready(function () {
    $('.nBtn, .table  .eBtn').on('click',function (event) {
        event.preventDefault();
        var text = $(this).text();
        if(text == 'Edit'){
            $('.myform #exampleModal').modal();
        }else {
            $('myform #tweet-name').val('');
            $('.myform #exampleModal').modal();
        }

    });
});