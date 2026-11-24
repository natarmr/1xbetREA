package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c7b implements d7b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f3853a;
    public final mdm b;

    public c7b(udl0 udl0Var, mdm mdmVar) {
        this.f3853a = udl0Var;
        this.b = mdmVar;
    }

    @Override // a.d7b
    public final udl0 b() {
        return this.f3853a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7b)) {
            return false;
        }
        c7b c7bVar = (c7b) obj;
        return this.f3853a == c7bVar.f3853a && this.b.equals(c7bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3853a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchEmpty(sportGameType=" + this.f3853a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
