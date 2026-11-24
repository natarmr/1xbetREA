package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes3.dex */
public final class a52 implements b52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateCalendarBottomSheetParams f248a;

    public a52(DateCalendarBottomSheetParams dateCalendarBottomSheetParams) {
        this.f248a = dateCalendarBottomSheetParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a52) && this.f248a.equals(((a52) obj).f248a);
    }

    public final int hashCode() {
        return this.f248a.hashCode();
    }

    public final String toString() {
        return "ShowDayPicker(dateCalendarBottomSheetParams=" + this.f248a + Separators.RPAREN;
    }
}
