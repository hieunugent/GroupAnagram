function groupAnagrams(words) {
  // Write your code here.
	const anagram={};
	for(const word of words){
		const sortWord = word.split('').sort().join('');
		if(sortWord in anagram){
			anagram[sortWord].push(word);
		}else{
			
			anagram[sortWord]= [word];
		}
		
	}
	return Object.values(anagram)
}

// Do not edit the line below.
exports.groupAnagrams = groupAnagrams;
