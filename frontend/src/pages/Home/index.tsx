import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">DB Delivery</h1>
                    <p className="lead">Cadastre e gerencie os produtos oferecidos pelo seu delivery.</p>
                    <hr />
                    <Link className="btn btn-primary btn-lg" to="/dashboard" >Acessar o Dashboard</Link>
                </div>
            </div>
            <Footer />
        </>
    );
}

export default Home;
