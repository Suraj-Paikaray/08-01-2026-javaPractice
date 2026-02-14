
Longest Common Prefix

let strs = ["flower", "flow", "flight"];

let minimumLength = 0;

for(let i = 0; i < strs.length; i++){
  if(i === 0){
    minimumLength = strs[i].length
  }else if(minimumLength > strs[i].length){
    minimumLength = strs[i].length
  }
}


console.log({minimumLength})


let finalAnswer = "";

for(let i = 0; i < minimumLength; i++){
  let temp = "";
  for(let j = 0; j < strs.length; j++ ){
    // console.log(j +" "+ i);
    // console.log({temp})
    if(j === 0){
      temp = strs[j][i]
    }else if(temp === strs[j][i]){
      continue;
    }else{
      temp = ""
    }
  }
  
  if(temp === "" && finalAnswer.length === 0){
    finalAnswer = "";
    break;
  }else{
    finalAnswer = finalAnswer + temp;
  }
}

console.log({finalAnswer})

console.log("Length of finalAnswer:", finalAnswer.length)


console.log('O(n^2)')
