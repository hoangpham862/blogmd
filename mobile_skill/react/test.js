let a = 1; 

console.log(a);
console.log(a + 1);
console.log(a + "1");
console.log(a * 1);
console.log(a ** "as");
console.log(a * false);
console.log(a * true);
console.log(a * undefined);
console.log(a * null);


const cat1 = {
  name: "Fluffy",
    age: 3,
}
  
const cat2 = { ...cat1, "age": "4" };
console.log(cat2);

const array1 = [1, 2, 3];
const array2 = [...array1, 4, 5, 6];
console.log(array2);
const array3 = [0, ...array1, array1[0] = 10];
console.log(array1);
console.log(array3);