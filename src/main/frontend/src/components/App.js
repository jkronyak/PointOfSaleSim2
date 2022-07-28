import './App.css';
import LoginPage from "./LoginPage";
import {Box} from "@mui/material";
import {Outlet} from "react-router-dom";

export default function App() {
    return (
        <Box className="App">
            <LoginPage/>
            {/*<Outlet/>*/}
        </Box>
    );
}


