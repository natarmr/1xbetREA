package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes5.dex */
public final class i4f0 implements t4f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateCalendarBottomSheetParams f14144a;

    public i4f0(DateCalendarBottomSheetParams dateCalendarBottomSheetParams) {
        this.f14144a = dateCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4f0) && this.f14144a.equals(((i4f0) obj).f14144a);
    }

    public final int hashCode() {
        return this.f14144a.hashCode();
    }

    public final String toString() {
        return "OpenPassportDateIssueCalendar(params=" + this.f14144a + Separators.RPAREN;
    }
}
