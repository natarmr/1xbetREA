package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes5.dex */
public final class e4f0 implements t4f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateCalendarBottomSheetParams f7179a;

    public e4f0(DateCalendarBottomSheetParams dateCalendarBottomSheetParams) {
        this.f7179a = dateCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4f0) && this.f7179a.equals(((e4f0) obj).f7179a);
    }

    public final int hashCode() {
        return this.f7179a.hashCode();
    }

    public final String toString() {
        return "OpenBirthdayCalendar(params=" + this.f7179a + Separators.RPAREN;
    }
}
