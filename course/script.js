document.addEventListener("DOMContentLoaded", () => {
    const jsonDisplay = document.getElementById("jsonDisplay");
    const prevBtn = document.getElementById("prevBtn");
    const nextBtn = document.getElementById("nextBtn");

    // List of your JSON file URLs
    const jsonFiles = [
        '../assets/json/9-0content.json',
        '../assets/json/9-0code.json',
        // Add more URLs as needed
    ];

    let currentIndex = 0;


    const displayJSON = async (index) => {
        try {
            const response = await fetch(jsonFiles[index]);
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            const data = await response.json();
    
            // Start with an empty string
            let displayContent = '';
    
            // Check if the title exists and append it
            if (data.title) {
                displayContent += `<h2>${data.title}</h2>`;
            }
                    // Append description if it exists
            if (data.description) {
                displayContent += `<p>${data.description}</p>`;
                jsonDisplay.style.display = "block";
            } else {
                jsonDisplay.style.display = "none";
            }
    
            // Format the codeSample if it exists
            if (data.codeSample) {
                // Escaping HTML special characters
                let formattedCodeSample = data.codeSample
                    .replace(/&/g, "&amp;")
                    .replace(/</g, "&lt;")
                    .replace(/>/g, "&gt;")
                    .replace(/\n/g, "<br>")
                    .replace(/ /g, "&nbsp;");
    
                displayContent += `<div style="white-space: pre-wrap;"><code>${formattedCodeSample}</code></div>`;
            }
    
            // Set the formatted content to display in the webpage
            jsonDisplay.innerHTML = displayContent;
        } catch (error) {
            console.error("Failed to fetch JSON: ", error);
            jsonDisplay.innerHTML = "Failed to load data";
        }
    };
    

    prevBtn.addEventListener("click", () => {
        if (currentIndex > 0) {
            currentIndex--;
            displayJSON(currentIndex);
        }
    });

    nextBtn.addEventListener("click", () => {
        if (currentIndex < jsonFiles.length - 1) {
            currentIndex++;
            displayJSON(currentIndex);
        }
    });

    // Initially load the first JSON file
    displayJSON(currentIndex);
});




// // List of URLs pointing to your JSON files
// const jsonFiles = [
//     '../assets/json/9-0content.json',
//     '../assets/json/9-0code.json',
//     // Add more as needed
// ];

// let currentIndex = 0;

// function displayNextJson() {
//     // Fetch the current JSON file
//     fetch(jsonFiles[currentIndex])
//         .then(response => response.json())
//         .then(data => {
//             // Display the JSON content
//             document.getElementById('jsonContent').textContent = JSON.stringify(data, null, 2);
            
//             // Move to the next file in the list, looping back to the start if necessary
//             currentIndex = (currentIndex + 1) % jsonFiles.length;
//         })
//         .catch(error => {
//             console.error('Error fetching JSON file:', error);
//             document.getElementById('jsonContent').textContent = 'Error loading JSON file.';
//         });
// }

// // Initial display
// displayNextJson();

// // Set up the button to load the next JSON file on click
// document.getElementById('nextButton').addEventListener('click', displayNextJson);
