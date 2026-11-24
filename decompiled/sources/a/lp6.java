package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lp6 implements np6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f20425a;

    public lp6(imm immVar) {
        this.f20425a = immVar;
    }

    @Override // a.np6
    public final imm c() {
        return this.f20425a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lp6) && this.f20425a.equals(((lp6) obj).f20425a);
    }

    public final int hashCode() {
        return this.f20425a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f20425a, "Loading(appBarUiModel=", Separators.RPAREN);
    }
}
