
// Initizlize a new Markdown converter
var converter = new showdown.Converter();
// Function to handle the form submission and API call
async function handleAPICall(event) {
    event.preventDefault();
    const userInput = document.getElementById('userInput').value;
    const additionalsettings = "";
    //const langSelect = document.getElementById('language').value;

    // Define the API endpoint and request headers
    const endpoint = 'https://nsnh9diooe.execute-api.us-east-1.amazonaws.com/Prod/ai/query/rag';
    const headers = {
        'Content-Type': 'application/json',
    };

    // Construct the POST data
    const postData = {
        system: "researchassistant",
        user: "student",
        lang: additionalsettings,
        request: userInput
    };

    try {
        // Make the API call using Fetch API
        const response = await fetch(endpoint, {
            method: 'POST',
            headers: headers,
            body: JSON.stringify(postData)
        });

     // Check if response is ok
     if (!response.ok) {
        throw new Error(`HTTP error! Status: ${response.status}`);
    }

    const responseData = await response.json();

    // Check if responseData and responseData.content exist
    if (responseData) {
        document.getElementById('result').innerHTML = `<pre>${responseData}</pre>`;
    } else {
        document.getElementById('result').textContent = 'No content available in the response.';
    }
    } catch (error) {
    console.error('There was a problem with the API call:', error);
    document.getElementById('result').textContent = 'Error occurred while calling the API.';
    }
    };
