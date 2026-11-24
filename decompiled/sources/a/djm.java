package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class djm implements ejm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xim f6194a;

    public djm(xim ximVar) {
        this.f6194a = ximVar;
    }

    @Override // a.ejm
    public final xim a() {
        return this.f6194a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djm) && this.f6194a == ((djm) obj).f6194a;
    }

    public final int hashCode() {
        return this.f6194a.hashCode();
    }

    public final String toString() {
        return "Shimmers(style=" + this.f6194a + Separators.RPAREN;
    }
}
