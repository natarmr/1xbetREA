package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class if40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final szh f14669a;

    public if40(szh szhVar) {
        this.f14669a = szhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof if40) && this.f14669a.equals(((if40) obj).f14669a);
    }

    @Override // a.tf40
    public final String getKey() {
        String strJ = sre0.f32672a.b(if40.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.f14669a.hashCode();
    }

    public final String toString() {
        return "GamesSpinner(model=" + this.f14669a + Separators.RPAREN;
    }
}
