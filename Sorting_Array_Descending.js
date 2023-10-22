function Sorting_Array_Descending(arr) {
    const n = arr.length;
    let swapped;
    do {
        swapped = false;
        for (let i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                // Swap arr[i] and arr[i+1]
                const temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }
    } while (swapped);
}

const numbers = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5];
Sorting_Array_Descending(numbers);
console.log(numbers);
