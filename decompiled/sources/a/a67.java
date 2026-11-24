package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateRangeWithTimeCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes3.dex */
public final class a67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateRangeWithTimeCalendarBottomSheetParams f304a;

    public a67(DateRangeWithTimeCalendarBottomSheetParams dateRangeWithTimeCalendarBottomSheetParams) {
        this.f304a = dateRangeWithTimeCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a67) && this.f304a.equals(((a67) obj).f304a);
    }

    public final int hashCode() {
        return this.f304a.hashCode();
    }

    public final String toString() {
        return "ShowEmailDatePicker(dateRangeWithTimeCalendarBottomSheetParams=" + this.f304a + Separators.RPAREN;
    }
}
