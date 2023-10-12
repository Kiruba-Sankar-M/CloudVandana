const columns = document.querySelectorAll('.column');
const display = document.querySelector('.display');
const inputValue = document.getElementById('input-value');
const sortValue = document.getElementById('sort-value');

/*****************************************************************************/
columns.forEach(column => {
    column.addEventListener('click', function () {
        const value = column.getAttribute('data-value');
        console.log(value);
        if (value === "AC") {
            clearValues();
        }
        else if (value === "=") {
            calculate();
        }
        else {
            display.innerText += value;
        }
    })
})

inputValue.addEventListener('keyup', function (event) {
    if (event.key === 'Enter') {
        getValue();
    }
})

function clearValues() {
    display.innerText = '';
}

function calculate() {
    if (display.innerText != '') {
        display.innerText = eval(display.innerText);
    }
}
/*************************************************************************** */
function getValue() {
    console.log(inputValue.value);
    const inputString = inputValue.value;
    let stringArr = inputString.split(' ');
    let result = [];
    stringArr.forEach(eachString => {
        if (eachString != '') {
            result.push(eachString.split('').reverse().join(''));
            console.log(result)
        }
    })
    inputValue.value = result.join(' ');
}

function clearValue() {
    inputValue.value = '';
}

/*********************************************************************************** */

sortValue.addEventListener('keydown', function (event) {
    if (event.key == 'Enter') {
        getSortValue();
    }
})

function getSortValue() {
    let inputSortValue = sortValue.value;
    let result = inputSortValue.split(' ').filter(eachElement => eachElement != '').sort((a, b) => b - a).join(' ');
    sortValue.value = result;
}

function clearSortValue() {
    sortValue.value = '';

}

/*************************************************************************************** */