//package classwork23.user;
//
//public class User {
//
//    // fields
//    private String email;
//    private String password;
//
//    public User(String email, String password) {
//        setEmail(email);
//        setPassword(password);
//
//    }
//
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        if (validateEmail(email)) {
//            this.email = email;
//        } else {
//            System.out.println("Wrong email");
//        }
//
//    }     /*     1) @ exists and only one
//        2) dot after @
//        3) after last dot minimum 2 symbols (.ru, .de, .com)
//        4) alphabetic, digits, _ , - , . , @*/
//
////    private boolean validateEmail(String email) {
////
////        // bad options - return false
////        int indexAt = email.indexOf('@');
////        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) {
////            return false;
////        }
////
////        if (email.indexOf('.', indexAt) == -1{
////            return false;
////        }
////
////        if(email.indexOf('.') >= email() -2 {
////            return false;
////        }
////        // good options - return true
////
////        private String setPassword (String password){
////            return email;
////        }
//    }
//}