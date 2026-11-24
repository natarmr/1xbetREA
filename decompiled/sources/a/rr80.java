package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rr80 implements tr80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq5 f30970a;

    public rr80(lq5 lq5Var) {
        this.f30970a = lq5Var;
    }

    @Override // a.tr80
    public final lq5 a() {
        return this.f30970a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr80) && this.f30970a.equals(((rr80) obj).f30970a);
    }

    public final int hashCode() {
        return this.f30970a.hashCode();
    }

    public final String toString() {
        return "Disabled(style=" + this.f30970a + Separators.RPAREN;
    }
}
