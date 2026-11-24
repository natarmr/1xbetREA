package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class r1i0 implements u1i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f29682a;

    public r1i0(SimpleDate simpleDate) {
        this.f29682a = simpleDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1i0) && this.f29682a.equals(((r1i0) obj).f29682a);
    }

    public final int hashCode() {
        return this.f29682a.hashCode();
    }

    public final String toString() {
        return "OnApplyClick(date=" + this.f29682a + Separators.RPAREN;
    }
}
