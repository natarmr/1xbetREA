package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gd50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f11091a;

    public gd50(imm immVar) {
        this.f11091a = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gd50) && this.f11091a.equals(((gd50) obj).f11091a);
    }

    public final int hashCode() {
        return this.f11091a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f11091a, "NavigationBarUiState(model=", Separators.RPAREN);
    }
}
