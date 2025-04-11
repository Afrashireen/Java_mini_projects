class Training {
    String courseName;
    int seats;

    Training(String courseName, int seats) {
        this.courseName = courseName;
        this.seats = seats;
    }

    boolean bookSeat(int count) {
        if (seats >= count) {
            seats -= count;
            return true;
        }
        return false;
    }

    String getDetails() {
        return courseName + ": Seats left - " + seats;
    }
}

class TrainingBookingSystem {
    public static void main(String[] args) {
        Training java = new Training("Java Basics", 5);
        java.bookSeat(2);
        System.out.println(java.getDetails());
    }
}
