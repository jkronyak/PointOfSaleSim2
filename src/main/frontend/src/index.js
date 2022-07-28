import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './components/App';
import {
    BrowserRouter,
    Routes,
    Route
} from "react-router-dom";
import {Box, Typography} from "@mui/material";

ReactDOM.createRoot(document.getElementById('root')).render(
  <BrowserRouter>
        <Routes>
            <Route path="/" element={<App/>}>
                {/*<Route path="/testone" element={<LoginPage/>}/>*/}
                {/*<Route path="/testtwo" element={<TestTwo/>}/>*/}
            </Route>
            <Route path="*" element={<Box><Typography>INVALID PAGE YO</Typography></Box>}/>

        </Routes>
  </BrowserRouter>
);
