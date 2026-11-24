package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes5.dex */
public final class vaf0 implements lbf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateCalendarBottomSheetParams f37084a;

    public vaf0(DateCalendarBottomSheetParams dateCalendarBottomSheetParams) {
        this.f37084a = dateCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vaf0) && this.f37084a.equals(((vaf0) obj).f37084a);
    }

    public final int hashCode() {
        return this.f37084a.hashCode();
    }

    public final String toString() {
        return "OpenBirthdayCalendar(params=" + this.f37084a + Separators.RPAREN;
    }
}
