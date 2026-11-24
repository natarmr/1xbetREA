package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p9p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f26619a;

    public p9p0(imm immVar) {
        this.f26619a = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9p0) && this.f26619a.equals(((p9p0) obj).f26619a);
    }

    public final int hashCode() {
        return this.f26619a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f26619a, "TeamDetailsNavigationBarUiModel(model=", Separators.RPAREN);
    }
}
