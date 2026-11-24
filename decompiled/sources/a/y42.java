package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateRangeCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes3.dex */
public final class y42 implements b52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateRangeCalendarBottomSheetParams f41980a;

    public y42(DateRangeCalendarBottomSheetParams dateRangeCalendarBottomSheetParams) {
        this.f41980a = dateRangeCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y42) && this.f41980a.equals(((y42) obj).f41980a);
    }

    public final int hashCode() {
        return this.f41980a.hashCode();
    }

    public final String toString() {
        return "ShowCustomDatePicker(dateRangeCalendarBottomSheetParams=" + this.f41980a + Separators.RPAREN;
    }
}
