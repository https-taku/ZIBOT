const apiClient = (() => {
    const API_BASE_URL = "http://localhost:8080"; // Update with the correct backend base URL

    /**
     * Sends a request to the backend to search for vehicle information by number plate.
     * @param {string} numberPlate - The vehicle's number plate.
     * @returns {Promise<Object>} - The response data from the backend.
     */
    async function searchByNumberPlate(numberPlate) {
        try {
            const response = await fetch(`${API_BASE_URL}/car/search/${encodeURIComponent(numberPlate)}`, {
                method: "GET",
                headers: {
                    "Content-Type": "application/json",
                },
            });

            if (!response.ok) {
                throw new Error(`Error: ${response.status} ${response.statusText}`);
            }

            return await response.json();
        } catch (error) {
            console.error("Error in searchByNumberPlate:", error);
            throw error;
        }
    }

    /**
     * Greet the user and display available options.
     */
    function greetUser() {
        console.log("Hello! How can I assist you today?");
        console.log("1. Search by Number Plate");
        console.log("2. Exit");
    }

    // Expose public methods
    return {
        searchByNumberPlate,
        greetUser,
    };
})();
