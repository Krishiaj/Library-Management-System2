class Member {
    private String name;
    private String membershipId;
    private String contactInfo;

    public Member(String name, String membershipId, String contactInfo) {
        this.name = name;
        this.membershipId = membershipId;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}
