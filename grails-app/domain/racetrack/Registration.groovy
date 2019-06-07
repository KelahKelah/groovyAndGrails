package racetrack


class Registration {
    String name
    Date dateOfBirth
    String gender
    String address
    String city
    String state
    String zipcode
    String email

    Date dateCreated
    Date dateUpdated

//    mapping block
    static mapping = {
        autoTimestamp false
        sort "startDate"
    }

//    closures

//    def beforeInsert = {
//        code goes here
//    }

//    def beforeUpdate = {
//        code goes here
//    }

//    def beforeDelete = {
//        code goes here
//    }

//    def onLoad = {
//        code goes here
//    }


    static constraints = {
    }
}
