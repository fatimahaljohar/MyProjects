<?php

$host="localhost:3307";
$user="root";
$password="";
$db="students_bd";

$con= mysqli_connect( $host, $user, $password,$db );

/*if( mysqli_connect_errno()>0)
   echo mysqli_connect_errno( $con0);
   else echo "Successfully connected";*/
   if( $con)
      echo "Successfully connected";
      else echo "error";
?>
