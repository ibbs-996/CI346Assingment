'use strict';

// tag::vars[]
const React = require('react');
const ReactDOM = require('react-dom')
const client = require('./client');
// end::vars[]

// tag::app[]
class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {employees: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/employees'}).then(response => {
            this.setState({employees: response.entity._embedded.employees});
        });
    }
    
    render() {
        return (
            <EmployeeList employees={this.state.employees}/>
        )
    }
}
// end::app[]

// tag::employee-list[]
class EmployeeList extends React.Component{
    render() {
        var employees = this.props.employees.map(employee =>
            <Employee key={employee._links.self.href} employee={employee}/>
        );
        return (
            <table>
                <tbody>
                    <tr>
                    	<th>Employee ID</th>
                        <th>Name</th>
                        <th>Shift</th>
                    </tr>
                    {employees}
                </tbody>
            </table>
        )
    }
}
// end::employee-list[]

// tag::employee[]
class Employee extends React.Component{

    constructor(props) {
        super(props);
        this.state = {shifts:[]};
    }
    
    componentDidMount() {
        client({method: 'GET', path: this.props.employee._links.shifts.href}).then(response => {
            this.setState({shifts: response.entity._embedded.shifts});
        });
    }

    render() {
        const shifts = this.state.shifts.map(shift =>
            <div key={shift.id}>{shift.shifts}</div>
        );

        return (
            <tr>
                <td>{this.props.employee.employeeID}</td>
                <td>{this.props.employee.name}</td>
                <td>{shifts}</td>
            </tr>
        )
    }
}
// end::employee[]

// tag::render[]
ReactDOM.render(
    <App />,
    document.getElementById('react')
)
// end::render[]