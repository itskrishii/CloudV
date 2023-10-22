function reverse_every_word(sentence) {
    const words = sentence.split(' ');

    function reverseWord(word) {
        let reversedWord = '';
        for (let i = word.length - 1; i >= 0; i--) {
            reversedWord += word[i];
        }
        return reversedWord;
    }

    const reversedWords = [];
    for (let word of words) {
        reversedWords.push(reverseWord(word));
    }

    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverse_every_word(inputSentence);
console.log(reversedSentence);
