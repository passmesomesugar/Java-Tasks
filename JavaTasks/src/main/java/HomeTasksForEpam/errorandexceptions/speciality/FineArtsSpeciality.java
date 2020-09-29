package errorandexceptions.speciality;

import errorandexceptions.subjects.Subjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FineArtsSpeciality extends Speciality {
    public static final String SPECIALITY = "fine_artist";
    private List<Subjects> fine_course = Arrays.asList(
            Subjects.CPLUSPLUS, Subjects.KUNG_FU, Subjects.GENERAL_MATH
    );

    public FineArtsSpeciality() {
        super(SPECIALITY);
    }

    @Override
    public List<Subjects> getCourse() {
        return fine_course;
    }
}
