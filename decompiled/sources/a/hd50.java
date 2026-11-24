package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hd50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f12854a;

    public hd50(imm immVar) {
        this.f12854a = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd50) && this.f12854a.equals(((hd50) obj).f12854a);
    }

    public final int hashCode() {
        return this.f12854a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f12854a, "NavigationBarUiState(model=", Separators.RPAREN);
    }
}
