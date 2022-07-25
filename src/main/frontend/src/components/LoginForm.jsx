import React from "react";

function LoginForm(props) {
    return (
        <div>
            <form>
                <label htmlFor="empId">Employee ID: </label>
                <input id="empId" type="text"/>

                <label htmlFor="password">Password: </label>
                <input id="password" type="password"/>
            </form>
        </div>
    )
}

export default LoginForm;