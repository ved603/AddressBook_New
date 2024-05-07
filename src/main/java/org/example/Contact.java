package org.example;



public class Contact{
        String firstname;
        String lastname;
        String address;
        String city;
        String state;
        String zip;
        String phoneno;
        String email;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Contact(String fname, String lastname, String address, String city, String state, String zip, String phoneno, String email){
            if(fname != null) {
                this.firstname = fname;
            }
            if(lastname != null)
            {
                this.lastname = lastname;
            }
            if(address != null)
            {
                this.address = address;
            }
            if(city != null)
            {
                this.city = city;
            }
            if(state != null)
            {
                this.state = state;
            }
            if(zip != null)
            {
                this.zip = zip;
            }
            if(phoneno != null){
                this.phoneno = phoneno;
            }
            if(email != null){
                this.email = email;
            }

        }



        @Override
        public String toString(){
            System.out.println("\n_________________________________________________\n");
            System.out.println("The Contact first name is : " +firstname);
            System.out.println("The Contact last name  is : " +lastname);
            System.out.println("The Contact address is  : " +address);
            System.out.println("The Contact city is : " +city);
            System.out.println("The Contact state is : "+state);
            System.out.println("The Contact zip is : " +zip);
            System.out.println("The Contact Phone no is : " +phoneno);
            System.out.println("The Contact email is : " +email);
            System.out.println("\n_________________________________________________\n");
            return "";
        }
    }
