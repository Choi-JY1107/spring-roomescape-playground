package roomescape.domain;

import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

public class Time {
    private final Long id;
    @DateTimeFormat(pattern = "HH:MM")
    private final LocalTime time;

    public Time(final Long id, final LocalTime time) {
        this.id = id;
        this.time = time;
    }

    public Time(final LocalTime time) {
        this(null, time);
    }

    public static Time toEntity(final Long id, final Time time) {
        return new Time(id, time.time);
    }

    public Long getId() {
        return id;
    }

    public LocalTime getTime() {
        return time;
    }
}
