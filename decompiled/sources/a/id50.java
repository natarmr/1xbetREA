package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class id50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f14567a;

    public id50(imm immVar) {
        this.f14567a = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id50) && this.f14567a.equals(((id50) obj).f14567a);
    }

    public final int hashCode() {
        return this.f14567a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f14567a, "NavigationBarUiState(model=", Separators.RPAREN);
    }
}
