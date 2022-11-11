package SortFriend;

public class Friend implements Comparable<Friend>{

        private int id;
        private String name;
        private String phone;
        private String email;
        private transient String country;

        public Friend() {
        }

        public Friend(String name, String phone, String email) {
            generateId();
            setName(name);
            setPhone(phone);
            setEmail(email);
        }

        public int getId() {
            return id;
        }

        public String getCountry() {
            return country;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            if (phone == null)
                phone = "";
            this.phone = phone;

            // Determine country based on beginning of phone's country code
            if (phone.length() >= 3 && phone.substring(0, 3).equals("+45"))
                country = "DK";
            else if (phone.length() >= 3 && phone.substring(0, 3).equals("+46"))
                country = "SE";
            else if (phone.length() >= 2 && phone.substring(0, 2).equals("+1"))
                country = "USA";
            else
                country = "[Unknown]";
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        private void generateId() {
            id = (int) (Math.random() * 8999 + 1000);
        }

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public int compareTo(Friend o) {
        return  id - o.id; //Id sorted
    }

}

