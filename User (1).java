public abstract class User {
    private String name;
    private String id;
    private String phoneNum;

    public User(String name, String id, String phoneNum) {
        this.name = name;
        this.id = id;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
    
    public abstract void displayProfile();
}
