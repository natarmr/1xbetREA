package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes3.dex */
public final class z57 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateCalendarBottomSheetParams f43802a;

    public z57(DateCalendarBottomSheetParams dateCalendarBottomSheetParams) {
        this.f43802a = dateCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z57) && this.f43802a.equals(((z57) obj).f43802a);
    }

    public final int hashCode() {
        return this.f43802a.hashCode();
    }

    public final String toString() {
        return "ShowDayPickerCalendar(dateCalendarBottomSheetParams=" + this.f43802a + Separators.RPAREN;
    }
}
