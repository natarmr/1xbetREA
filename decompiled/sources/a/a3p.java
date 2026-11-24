package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a3p implements b3p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f182a;

    public a3p(imm immVar) {
        this.f182a = immVar;
    }

    @Override // a.b3p
    public final imm a() {
        return this.f182a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3p) && this.f182a.equals(((a3p) obj).f182a);
    }

    public final int hashCode() {
        return this.f182a.hashCode() + (Integer.hashCode(10) * 31);
    }

    public final String toString() {
        return rz4.k(this.f182a, "Loading(countShimmers=10, dsNavigationBarUiModel=", Separators.RPAREN);
    }
}
