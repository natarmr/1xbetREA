package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class of40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzc0 f25148a;

    public of40(tzc0 tzc0Var) {
        this.f25148a = tzc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof of40) && this.f25148a.equals(((of40) obj).f25148a);
    }

    @Override // a.tf40
    public final String getKey() {
        String strJ = sre0.f32672a.b(of40.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.f25148a.hashCode();
    }

    public final String toString() {
        return "Promotions(model=" + this.f25148a + Separators.RPAREN;
    }
}
