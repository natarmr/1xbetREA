package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class raq implements saq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f30149a;

    public raq(imm immVar) {
        this.f30149a = immVar;
    }

    @Override // a.saq
    public final imm a() {
        return this.f30149a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof raq) && this.f30149a.equals(((raq) obj).f30149a);
    }

    public final int hashCode() {
        return this.f30149a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f30149a, "Loading(dsNavigationBarUiModel=", Separators.RPAREN);
    }
}
