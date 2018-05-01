(function(el, str) {
  var a = document.createElement('a');
  a.href = 'https://www.profyu.com/';
  a.innerHTML = "<div class='logo'></div>";
  el.appendChild(a);

  var iconLink = document.createElement('link');
  iconLink.rel = 'shortcut icon';
  iconLink.type='image/png';
  iconLink.href='assets/logo.png';
  document.getElementsByTagName('head')[0].appendChild(iconLink);

})(document.body);
