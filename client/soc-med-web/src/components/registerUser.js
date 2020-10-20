import React, { Component } from "react";
import { Button, Form, Checkbox } from "semantic-ui-react";
import axios from "axios";

export default class RegisterUser extends Component {
  state = {
    name: "",
    password: "",
    email: "",
    phone: "",
  };

  saveName = (e) => {
    this.setState({ name: e.target.value });
  };
  savePassword = (e) => {
    this.setState({ password: e.target.value });
  };
  saveEmail = (e) => {
    this.setState({ email: e.target.value });
  };
  savePhone = (e) => {
    this.setState({ phone: e.target.value });
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

  render() {
    return (
      <div>
        <Form>
          <Form.Field>
            <label>Name</label>
            <input placeholder="First Name" onChange={this.saveName} />
          </Form.Field>
          <Form.Field>
            <label>Email</label>
            <input placeholder="Email" onChange={this.saveEmail} />
          </Form.Field>
          <Form.Field>
            <label>Phone</label>
            <input placeholder="Phone" onChange={this.savePhone} />
          </Form.Field>
          <Form.Field>
            <label>Password</label>
            <input placeholder="Password" onChange={this.savePassword} />
          </Form.Field>
          <Form.Field>
            <Checkbox label="I agree to the Terms and Conditions" />
          </Form.Field>
          <Button type="submit" onClick={this.addUser}>
            Submit
          </Button>
        </Form>
      </div>
    );
  }
}
