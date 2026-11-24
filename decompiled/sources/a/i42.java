package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class i42 implements o42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateRangeModel f14124a;

    public i42(DateRangeModel dateRangeModel) {
        this.f14124a = dateRangeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i42) && this.f14124a.equals(((i42) obj).f14124a);
    }

    public final int hashCode() {
        return this.f14124a.hashCode();
    }

    public final String toString() {
        return "OnDatePeriodSelected(dateRangeModel=" + this.f14124a + Separators.RPAREN;
    }
}
