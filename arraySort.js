
var arr2 = [2,3,4,7,8,9];

for (let i = 0; i < arr2.length; i++) {

    for (let j = 0; j < arr2.length; j++) {

        if (arr2[i] < arr2[j]) {

            let temp = arr2[i];

            arr2[i] = arr2[j];

            arr2[j] = temp;

        }

    }



}
console.log(arr2)