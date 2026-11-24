package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes5.dex */
public final class mxe0 implements zxe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateCalendarBottomSheetParams f22551a;

    public mxe0(DateCalendarBottomSheetParams dateCalendarBottomSheetParams) {
        this.f22551a = dateCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxe0) && this.f22551a.equals(((mxe0) obj).f22551a);
    }

    public final int hashCode() {
        return this.f22551a.hashCode();
    }

    public final String toString() {
        return "OpenPassportDateExpireCalendar(params=" + this.f22551a + Separators.RPAREN;
    }
}
