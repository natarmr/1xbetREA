package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class y3e0 implements d4e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6i0 f41949a;

    public y3e0(i6i0 i6i0Var) {
        this.f41949a = i6i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y3e0) && this.f41949a == ((y3e0) obj).f41949a;
    }

    public final int hashCode() {
        return this.f41949a.hashCode();
    }

    public final String toString() {
        return "OnFilterClick(filterType=" + this.f41949a + Separators.RPAREN;
    }
}
