package seedu.address.model.schedule;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * A read-only immutable interface for a Schedule in the addressbook.
 * Implementations should guarantee: details are present and not null, field values are validated.
 */
public interface ReadOnlySchedule {

    ObjectProperty<ScheduleName> nameProperty();
    ScheduleName getName();
    ObjectProperty<ScheduleDate> startDateTimeProperty();
    ScheduleDate getStartDateTime();
    ObjectProperty<ScheduleDate> endDateTimeProperty();
    ScheduleDate getEndDateTime();
    String getSheduleDuration();
    SimpleStringProperty scheduleDurationProperty();
    String getScheduleDetails();
    SimpleStringProperty scheduleDetailsProperty();



    /**
     * Returns true if both have the same state. (interfaces cannot override .equals)
     */
    default boolean isSameStateAs(ReadOnlySchedule other) {
        return other == this // short circuit if same object
                || (other != null // this is first to avoid NPE below
                && other.getName().equals(this.getName())
                && other.getStartDateTime().equals(this.getStartDateTime())
                && other.getEndDateTime().equals(this.getEndDateTime())
                && other.getSheduleDuration().equals(this.getSheduleDuration())); // state checks here onwards
    }

    /**
     * Formats the Schedule as text, showing schedule name.
     */
    default String getAsText() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getName())
                .append(" Schedule Name: ")
                .append(getName());
        return builder.toString();
    }

}
