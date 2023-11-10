const express = require('express');
const cors = require("cors")
const app = express();
const PORT = process.env.PORT || 3001;


app.use(cors({
    origin: "*"
}))


app.get('/', (req, res) => {
    res.send('Hello from Service B!');
});

app.listen(PORT, () => {
    console.log(`Service B listening on port ${PORT}`);
});
