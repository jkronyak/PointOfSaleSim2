import React from "react";

function LoginForm(props) {
    return (
        <div class="login-form">
            <form>
                <label htmlFor="empId">Employee ID: </label>
                <input id="empId" type="number" min="1"/>

                <label htmlFor="password">Password: </label>
                <input id="password" type="password"/>
                <button type="submit">Login</button>
            </form>

        </div>

    )
}

export default LoginForm;