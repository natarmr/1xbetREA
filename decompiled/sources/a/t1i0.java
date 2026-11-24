package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class t1i0 implements u1i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f33169a;

    public t1i0(SimpleDate simpleDate) {
        this.f33169a = simpleDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1i0) && this.f33169a.equals(((t1i0) obj).f33169a);
    }

    public final int hashCode() {
        return this.f33169a.hashCode();
    }

    public final String toString() {
        return "OnChangeDate(date=" + this.f33169a + Separators.RPAREN;
    }
}
