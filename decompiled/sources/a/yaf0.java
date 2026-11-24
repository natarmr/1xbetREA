package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes5.dex */
public final class yaf0 implements lbf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateCalendarBottomSheetParams f42294a;

    public yaf0(DateCalendarBottomSheetParams dateCalendarBottomSheetParams) {
        this.f42294a = dateCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yaf0) && this.f42294a.equals(((yaf0) obj).f42294a);
    }

    public final int hashCode() {
        return this.f42294a.hashCode();
    }

    public final String toString() {
        return "OpenPassportDateExpireCalendar(params=" + this.f42294a + Separators.RPAREN;
    }
}
