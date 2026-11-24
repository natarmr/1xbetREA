package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ed50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f7602a;

    public ed50(imm immVar) {
        this.f7602a = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed50) && this.f7602a.equals(((ed50) obj).f7602a);
    }

    public final int hashCode() {
        return this.f7602a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f7602a, "NavigationBarUiState(model=", Separators.RPAREN);
    }
}
