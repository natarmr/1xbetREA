package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes5.dex */
public final class nxe0 implements zxe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateCalendarBottomSheetParams f24280a;

    public nxe0(DateCalendarBottomSheetParams dateCalendarBottomSheetParams) {
        this.f24280a = dateCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxe0) && this.f24280a.equals(((nxe0) obj).f24280a);
    }

    public final int hashCode() {
        return this.f24280a.hashCode();
    }

    public final String toString() {
        return "OpenPassportDateIssueCalendar(params=" + this.f24280a + Separators.RPAREN;
    }
}
