package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fd50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f9343a;

    public fd50(imm immVar) {
        this.f9343a = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd50) && this.f9343a.equals(((fd50) obj).f9343a);
    }

    public final int hashCode() {
        return this.f9343a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f9343a, "NavigationBarUiState(model=", Separators.RPAREN);
    }
}
