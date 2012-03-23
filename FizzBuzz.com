class FizzBuzz{
  
}

// for the numbers 1 through 20,
for (i=1; i<=20; i++) { 
  if(i%15 ===0){
    console.log("FizzBuzz");
  }
  
  // if the number is divisible by 3, write "Fizz"
  else if ( i % 3 === 0 ) { 
    console.log("Fizz");
  }else if (i % 5 === 0 )
  
  // if the number is divisible by 5, write "Buzz"
  {
    console.log("Buzz");
  }
  
  // otherwise, write just the number
  else {
    console.log(i);
  }
}