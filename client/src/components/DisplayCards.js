
import {Card, Col} from 'react-bootstrap';

const DisplayCards = (props) => {

    return (
        <div className='d-flex flex-wrap m-5'>
            {props.userData.map((user) => (
                <Col lg={4} key={user.id}>
                <a href= {user.url} target='_blank' rel="noreferrer"><Card>
                    <Card.Img variant="top" src={user.image} />  
                    <Card.Body>
                        <Card.Title>{user.title}</Card.Title>
                    </Card.Body>
                </Card> </a>
                </Col>
            ))}
        </div>
    )
    
}

export default DisplayCards;