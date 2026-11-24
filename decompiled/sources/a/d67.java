package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateRangeCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes3.dex */
public final class d67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateRangeCalendarBottomSheetParams f5539a;

    public d67(DateRangeCalendarBottomSheetParams dateRangeCalendarBottomSheetParams) {
        this.f5539a = dateRangeCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d67) && this.f5539a.equals(((d67) obj).f5539a);
    }

    public final int hashCode() {
        return this.f5539a.hashCode();
    }

    public final String toString() {
        return "ShowPickerDates(dateRangeCalendarBottomSheetParams=" + this.f5539a + Separators.RPAREN;
    }
}
