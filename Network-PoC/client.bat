@echo off
set /p _server="enter server address: "
set /p _port="enter port: "


java client.java %_server% %_port% 
pause