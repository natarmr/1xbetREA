package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes5.dex */
public final class zaf0 implements lbf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateCalendarBottomSheetParams f44065a;

    public zaf0(DateCalendarBottomSheetParams dateCalendarBottomSheetParams) {
        this.f44065a = dateCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zaf0) && this.f44065a.equals(((zaf0) obj).f44065a);
    }

    public final int hashCode() {
        return this.f44065a.hashCode();
    }

    public final String toString() {
        return "OpenPassportDateIssueCalendar(params=" + this.f44065a + Separators.RPAREN;
    }
}
