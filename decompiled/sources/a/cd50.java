package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cd50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f4145a;

    public cd50(imm immVar) {
        this.f4145a = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd50) && this.f4145a.equals(((cd50) obj).f4145a);
    }

    public final int hashCode() {
        return this.f4145a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f4145a, "NavigationBarUiState(model=", Separators.RPAREN);
    }
}
