var http = require('http');

http.createServer(function(req, res) {
    res.writeHead(200,{'Content-Type': 'text/html'});
    res.write('<h1> อยากรู้หรอ</h1>')
    res.write('<p> ไอ้พลชอบหลับ.</p>');
    res.end  ();
}).listen(8080);

console.log('ดูทำไม!!!!!!');
console.log('To quit,press Ctrl+C');
