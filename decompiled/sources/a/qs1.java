package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qs1 implements ss1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29236a;

    public qs1(int i) {
        this.f29236a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qs1) && this.f29236a == ((qs1) obj).f29236a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29236a);
    }

    public final String toString() {
        return ua80.e(this.f29236a, "OnTabSelect(tabIndex=", Separators.RPAREN);
    }
}
