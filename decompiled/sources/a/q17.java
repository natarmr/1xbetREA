package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class q17 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateRangeModel f27938a;

    public q17(DateRangeModel dateRangeModel) {
        this.f27938a = dateRangeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q17) && this.f27938a.equals(((q17) obj).f27938a);
    }

    public final int hashCode() {
        return this.f27938a.hashCode();
    }

    public final String toString() {
        return "OnDatePeriodSelected(dateRangeModel=" + this.f27938a + Separators.RPAREN;
    }
}
