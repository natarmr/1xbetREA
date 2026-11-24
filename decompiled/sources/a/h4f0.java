package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes5.dex */
public final class h4f0 implements t4f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateCalendarBottomSheetParams f12431a;

    public h4f0(DateCalendarBottomSheetParams dateCalendarBottomSheetParams) {
        this.f12431a = dateCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h4f0) && this.f12431a.equals(((h4f0) obj).f12431a);
    }

    public final int hashCode() {
        return this.f12431a.hashCode();
    }

    public final String toString() {
        return "OpenPassportDateExpireCalendar(params=" + this.f12431a + Separators.RPAREN;
    }
}
