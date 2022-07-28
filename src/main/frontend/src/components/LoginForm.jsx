import React from "react";
import {Box, Button, TextField} from "@mui/material";

function LoginForm(props) {
    return (
        <Box component="form"
            sx={{display: 'flex',
                flexDirection: 'column',
                alignItems: 'center',
                margin: 'auto',
                marginTop: 2,
                gap: 2,
                width: "20%",
            }}>
            <TextField id="empId" variant="outlined" label="Employee ID" type="number" inputProps={{ min: 1, pattern: '[0-9]*'}} fullWidth required/>
            <TextField id="password" variant="outlined" label={"Password"} fullWidth required/>

            <Button type="submit" variant="contained" sx={{m: 0.5, fontSize: 'larger'}}>Login</Button>
        </Box>

    )
}

export default LoginForm;