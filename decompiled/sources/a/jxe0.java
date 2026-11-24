package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes5.dex */
public final class jxe0 implements zxe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateCalendarBottomSheetParams f17304a;

    public jxe0(DateCalendarBottomSheetParams dateCalendarBottomSheetParams) {
        this.f17304a = dateCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxe0) && this.f17304a.equals(((jxe0) obj).f17304a);
    }

    public final int hashCode() {
        return this.f17304a.hashCode();
    }

    public final String toString() {
        return "OpenBirthdayCalendar(params=" + this.f17304a + Separators.RPAREN;
    }
}
