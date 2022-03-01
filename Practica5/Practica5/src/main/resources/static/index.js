const texto_re = /^[a-zA-Z ]*$/;
const novacio_re = /^(?!\s*$).+/;
const num_re = /^[0-9]*$/;
const correo_re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
let validateForm = () => {
    let firstName = $("#firstName");
    let resultadoName = texto_re.test(firstName);
    if (firstName == "" || !resultadoName) {
      alert("Este campo está vacío o incluye símbolos o números.");
      return false;
    }
    
    let lastName = $("#lastName");
    let resultadoApellido = texto_re.test(lastName);
    if (lastName == "" || !resultadoApellido) {
      alert("Este campo está vacío o incluye símbolos o números.");
      return false;
    }

    let email = $("#email");
    let resultadoEmail = correo_re.test(email);
    if (email == "" || !resultadoEmail) {
      alert("Correo no válido.");
      return false;
    }

    let address = $("#address");
    if (!novacio_re.test(address)){
      alert("Campo obligatorio.");
      return false;
    }

    let country = $("#country");
    if (country == "Escoge"){
      alert("Escoja un país de la lista.");
      return false;      
    }

    let state = $("#state");
    if (!novacio_re.test(state)){
      alert("Campo obligatorio.");
      return false;
    }

    let zip = $("#zip");
    if (!num_re.test(zip)){
      alert("Campo obligatorio.");
      return false;      
    }

    let tarifa = $("#tarifa");
    if (country == "Escoge"){
      alert("Escoja una tarifa de la lista.");
      return false;      
    }
  }