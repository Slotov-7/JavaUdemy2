package set.exercicios.entities;

import java.util.HashSet;
import java.util.Objects;

public class User implements Comparable<User> {
    private final int id;

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(User o) {
        return getId() - o.getId();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
