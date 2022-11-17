import './App.css';
import {useState} from 'react'
import DisplayCards from './components/DisplayCards'
import SearchUser from './components/SearchUser';


const App = () => {

  const [username, setUsername] = useState('');
  const [userData, setUserData] = useState([]);
  const [dataExist, setDataExist] = useState(false);
  const handleUsername = (e) => {
    setUsername(e.value);
  }
  const fetchUsers = async () => {
    try {
      fetch('http://localhost:8080/users/' + username)
        .then (response => response.json())
        .then (result => setUserData(result));
    }
    catch(error){
      console.log(error);
    }
  }

  const handleSubmit = (e) => {
    e.preventDefault();
    fetchUsers();
    setDataExist(true);
  }

  return (
    <div className="App mt-5">
      <h1>GitHub Search App</h1>
      <p>This is an app to locate users in the GitHub. Please enter the username below to start</p>
      <SearchUser handleSubmit={handleSubmit} handleUsername={handleUsername} />
      {dataExist && <DisplayCards userData = {userData} />}
    </div>
  );
}

export default App;
