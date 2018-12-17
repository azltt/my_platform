function test_post(formid,url) {
    var testform=document.getElementById(formid);
    testform.action=url;
    testform.submit();
}