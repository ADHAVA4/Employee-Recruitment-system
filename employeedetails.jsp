<%-- 
    Document   : employeedetails
    Created on : 13-Oct-2022, 9:23:13 pm
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
             <style>
/*body {
  background-image: url("p1.jpg");
    background-repeat: no-repeat;
  background-attachment: fixed; 
  background-size: 100% 100%;
}
h1   {color: blue;}
p    {color: red;}
table {border-collapse:separate;
            width:400px;
            border-spacing:10px;
  border: 1px solid;
}*/

body {
  background-image: url("p1.jpg");
    background-repeat: no-repeat;
  background-attachment: fixed; 
  background-size: 100% 100%;
  height: 100vh;
  font-family: 'Montserrat', sans-serif;
}

.container {
  position: absolute;
  transform: translate(-50%,-50%);
  top: 50%;
  left: 50%;
}
/*
.button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: blue;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: lightskyblue}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
*/
.for {
  background: rgba(255,255,255,0.3);
  padding: 3em;
  height: 350px;
  border-radius: 20px;
  border-left: 1px solid rgba(255,255,255,0.3);
  border-top: 1px solid rgba(255,255,255,0.3);
  backdrop-filter: blur(10px);
  box-shadow: 20px 20px 40px -6px rgba(0,0,0,0.2);
  text-align: center;
  position: relative;
  transition: all 0.2s ease-in-out;
  
  p {
    font-weight: 500;
    color: #fff;
    opacity: 0.7;
    font-size: 1.4rem;
    margin-top: 0;
    margin-bottom: 60px;
    text-shadow: 2px 2px 4px rgba(0,0,0,0.2);
  }
  
  a {
    text-decoration: none;
    color: #ddd;
    font-size: 12px;
    
    &:hover {
      text-shadow: 2px 2px 6px #00000040;
    }
    
    &:active {
      text-shadow: none;
    }
  }
  
  input {
    background: transparent;
    width: 200px;
    padding: 1em;
    margin-bottom: 2em;
    border: none;
    border-left: 1px solid rgba(255,255,255,0.3);
    border-top: 1px solid rgba(255,255,255,0.3);
    border-radius: 5000px;
    backdrop-filter: blur(5px);
    box-shadow: 4px 4px 60px rgba(0,0,0,0.2);
    color: #fff;
    font-family: Montserrat, sans-serif;
    font-weight: 500;
    transition: all 0.2s ease-in-out;
    text-shadow: 2px 2px 4px rgba(0,0,0,0.2);
    
    &:hover {
      background: rgba(255,255,255,0.1);
      box-shadow: 4px 4px 60px 8px rgba(0,0,0,0.2);
    }
    
    &[type="email"],
    &[type="password"] {
      
      &:focus {
        background: rgba(255,255,255,0.1);
        box-shadow: 4px 4px 60px 8px rgba(0,0,0,0.2);
      }
    }
    
    &[type="button"] {
      margin-top: 10px;
      width: 150px;
      font-size: 1rem;
      
      &:hover {
        cursor: pointer;
      }
      
      &:active {
        background: rgba(255,255,255,0.2);
      }
    }
  }
  
  &:hover {
    margin: 4px;
  }
}

::placeholder {
  font-family: Montserrat, sans-serif;
  font-weight: 400;
  color: #fff;
  text-shadow: 2px 2px 4px rgba(0,0,0,0.4);
}

a,
input:focus,
select:focus,
textarea:focus,
button:focus
{
    outline: none;
}

.button {
  border: none;
  color: black;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}


.button:hover {background-color: lightskyblue}
.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><div class="for">
        <h1>Registered Successfully!</h1>
        <a href="login.jsp"><button class="button">Back To home</button></a>
        </div></body>
</html>
