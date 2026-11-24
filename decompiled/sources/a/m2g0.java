package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m2g0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2n f21058a;

    public m2g0(a2n a2nVar) {
        this.f21058a = a2nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2g0) && this.f21058a.equals(((m2g0) obj).f21058a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f21058a.getKey();
    }

    public final int hashCode() {
        return this.f21058a.hashCode();
    }

    public final String toString() {
        return "ResultGameUiItem(model=" + this.f21058a + Separators.RPAREN;
    }
}
