/**
 * Created by ts0002 on 2019/8/27.
 */
var person = {

    submitInfo : function() {
        $.ajax({
            url:"/fillin/save",
            type:"POST",
            data:JSON.stringify(serializeObject($('#person_info_form'))),
            contentType:"application/json",  //缺失会出现URL编码，无法转成json对象
            success:function(respo){
                alert(respo.result);
                $('#person_info_form')[0].reset();
            }
        });
    }
}

function serializeObject(form) {
    var o = {};
    $.each(form.serializeArray(), function(index) {
        if (o[this['name']]) {
            o[this['name']] = o[this['name']] + "," + this['value'];
        } else {
            o[this['name']] = this['value'];
        }
    });
    return o;
};