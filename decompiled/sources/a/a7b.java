package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a7b implements d7b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f358a;
    public final boolean b;

    public a7b(udl0 udl0Var, boolean z) {
        this.f358a = udl0Var;
        this.b = z;
    }

    @Override // a.d7b
    public final udl0 b() {
        return this.f358a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7b)) {
            return false;
        }
        a7b a7bVar = (a7b) obj;
        return this.f358a == a7bVar.f358a && this.b == a7bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f358a.hashCode() * 31);
    }

    public final String toString() {
        return "Progress(sportGameType=" + this.f358a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
