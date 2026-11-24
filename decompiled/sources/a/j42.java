package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes3.dex */
public final class j42 implements o42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f15863a;

    public j42(SimpleDate simpleDate) {
        this.f15863a = simpleDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j42) && this.f15863a.equals(((j42) obj).f15863a);
    }

    public final int hashCode() {
        return this.f15863a.hashCode();
    }

    public final String toString() {
        return "OnDayPeriodSelected(simpleDate=" + this.f15863a + Separators.RPAREN;
    }
}
