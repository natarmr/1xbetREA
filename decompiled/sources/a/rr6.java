package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rr6 implements tr6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f30966a;

    public rr6(imm immVar) {
        this.f30966a = immVar;
    }

    @Override // a.tr6
    public final imm c() {
        return this.f30966a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr6) && this.f30966a.equals(((rr6) obj).f30966a);
    }

    public final int hashCode() {
        return this.f30966a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f30966a, "Loading(appBarUiModel=", Separators.RPAREN);
    }
}
