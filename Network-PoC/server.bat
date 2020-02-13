@echo off
set /p _port="enter port: "

java server.java %_port%
pause