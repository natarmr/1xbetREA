package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes3.dex */
public final class r17 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f29663a;

    public r17(SimpleDate simpleDate) {
        this.f29663a = simpleDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r17) && this.f29663a.equals(((r17) obj).f29663a);
    }

    public final int hashCode() {
        return this.f29663a.hashCode();
    }

    public final String toString() {
        return "OnDayPeriodSelected(simpleDate=" + this.f29663a + Separators.RPAREN;
    }
}
