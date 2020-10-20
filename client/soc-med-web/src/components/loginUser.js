import React, { Component } from "react";

export default class LoginUser extends Component {
  state = {
    password: "",
    email: "",
  };
  savePassword = (e) => {
    this.setState({ password: e.target.value });
  };
  saveEmail = (e) => {
    this.setState({ email: e.target.value });
  };

  addUser = (event) => {
    event.preventDefault();
    axios.post("http://localhost:8080/api/v1/user/addUser", this.state, {
      headers: {
        "Content-Type": "application/json",
        "Access-Control-Allow-Origin": "*",
      },
    });
  };

  userLogin = () => {};

  render() {
    return (
      <div>
        <Form>
          <Form.Field>
            <label>Email</label>
            <input placeholder="Email" onChange={this.saveEmail} />
          </Form.Field>
          <Form.Field>
            <label>Password</label>
            <input placeholder="Password" onChange={this.savePassword} />
          </Form.Field>
          <Button type="submit" onClick={this.userLogin}>
            Submit
          </Button>
        </Form>
      </div>
    );
  }
}
