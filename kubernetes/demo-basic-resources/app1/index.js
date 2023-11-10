const express = require('express');
const axios = require('axios');
const app = express();
const cors = require("cors")
const PORT = process.env.PORT || 3000;
const SERVICE_B_URL = process.env.SERVICE_B_URL || 'http://service-b:3001';

app.use(cors({
    origin: "*"
}))

app.get('/', async (req, res) => {
    try {
        const response = await axios.get(SERVICE_B_URL);
        res.status(200).send('Response from Service B: ' + response.data);
    } catch (error) {
        res.status(500).send('Error contacting Service B');
    }
});

app.listen(PORT, () => {
    console.log(`Service A listening on port ${PORT}`);
});
