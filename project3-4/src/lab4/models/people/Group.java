package lab4.models.people;

import java.util.List;
import java.util.Objects;

/**
 * A generic group of persons.
 */
public class Group<M extends Person> {
    private List<M> members;

    public Group(List<M> members) {
        this.members = members;
    }

    public boolean contains(M member) {
        return members.contains(member);
    }

    public List<M> getMembers() {
        return members;
    }

    public void addMember(M member) {
        members.add(member);
    }

    public String description() {
        if (members.isEmpty()) {
            return "Никто";
        } else if (members.size() == 1) {
            return members.get(0).getName();
        } else {
            return "Группа " + members.get(0).getName() + " и др.";
        }
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Group<?> group = (Group<?>) o;
        return Objects.equals(members, group.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members);
    }

    @Override
    public String toString() {
        return description();
    }
}