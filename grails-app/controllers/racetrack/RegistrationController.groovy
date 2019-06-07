package racetrack

class RegistrationController {

    def index() {
        render(view: "index", model: [name  : "Chris", role  : "Role 1", height: "5.8"])
    }

    def scaffold = Race

}
