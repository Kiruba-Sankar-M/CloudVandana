const inputValues = document.querySelectorAll('.input-value');
const optionsContainer = document.querySelector('.options');

console.log(optionsContainer)

let firstName;
let lastName;
let country;
let dob;
let gender;
let email;
let mobileNumber;
let profession;

function submitForm() {

    getSelectedGender();

    inputValues.forEach((eachValue) => {
        if (eachValue.name === "first-name") {
            firstName = eachValue.value;
        }
        else if (eachValue.name === "last-name") {
            lastName = eachValue.value;
        }
        else if (eachValue.name === "country") {
            country = eachValue.value;
        }
        else if (eachValue.name === "dob") {
            dob = eachValue.value;
        }
        else if (eachValue.name === "email") {
            email = eachValue.value;
        }
        else if (eachValue.name === "mobile-number") {
            mobileNumber = eachValue.value;
        }
        else if (eachValue.name === "profession") {
            profession = eachValue.value;
        }
    })
    alert(`First Name : ${firstName} \n Last Name : ${lastName} \n Selected Country : ${country} \n Date Of Birth : ${dob} \n Gender : ${gender} \n Email : ${email} \n Mobile Number: ${mobileNumber} \n Profession : ${profession}`);
    if (isAllValuesFilled()) {
        clearAllValues();
    }

}


function getSelectedGender() {
    const selectedRadioButton = optionsContainer.querySelector('input[type="radio"]:checked');
    console.log(selectedRadioButton);
    if (selectedRadioButton) {
        gender = selectedRadioButton.value;
    } else {
        console.log('No gender selected');
    }
}

function clearAllValues() {
    inputValues.forEach((eachValue) => {
        eachValue.value = '';
    })
}

function isAllValuesFilled() {
    let count = 0;
    while (count < inputValues.length) {
        if (inputValues[count].value == undefined || inputValues[count].value == '') {
            return false
        }
        count += 1;
    }
    return true
}