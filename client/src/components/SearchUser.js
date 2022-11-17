import { useState } from 'react';
import {Button} from 'react-bootstrap';
import AsyncSelect from 'react-select/async';

const SearchUser = (props) => {

    const [input, setinput] = useState();
    const [selectedValue, setSelectedValue] = useState("")

    const handleInputChange = (e) => {
        setinput(e);
    }

    const handleSelectChange = (e) => {
        setSelectedValue(e);
        props.handleUsername(e);
    }
  
    const fetchUsers = (inputValue) => {       
        if (inputValue.length > 0 && inputValue.length < 8) {
        return fetch('http://localhost:8080/users/' + inputValue)
            .then (response => response.json())
            .then (result => { const res = result.map((user) => {
                return {value:user.title, label: user.title}});
                return res;
            });
        }
        else return [];

    }

    return( 
        <form onSubmit={(e) =>props.handleSubmit(e)} className='d-flex align-items-center justify-content-center'>
            <label className="form-label mr-2">Username:</label>
            <div className='w-50'>
                <AsyncSelect
                        cacheOptions
                        defaultOptions
                        value={selectedValue}
                        loadOptions={fetchUsers}
                        onInputChange={handleInputChange}
                        onChange={handleSelectChange}
                />
            </div>
            <Button className="m-3" variant="primary" type="submit" >
                        Submit
            </Button> 
        </form>
    )
}

export default SearchUser;

