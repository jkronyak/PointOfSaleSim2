import React from "react";
import  LoginForm   from "./LoginForm";
import {Box, Typography} from "@mui/material";

function LoginPage(props) {
        return (
            <Box>
                <Typography variant="h4">Welcome to PointOfSaleSim2!</Typography>

                <img id="login-logo" src="img/logo.jpg" alt="Company Logo"/>
                <Typography variant="h4">Enter your login.</Typography>
                <LoginForm></LoginForm>
            </Box>
        )
}

export default LoginPage;