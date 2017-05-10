/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var wsUri="ws://"+ document.location.host + document.location.pathname + "echo";
var webSocket= new webSocket(wsUri);

webSocket.onopen=function (evt) {OnOpen(evt)};
webSocket.onmessage=function (evt) {OnMessage(evt)};
webSocket.onerror=function (evt) {OnError(evt)};