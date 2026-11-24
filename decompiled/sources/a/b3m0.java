package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class b3m0 implements d3m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2m0 f1915a;
    public final String b;
    public final boolean c;

    public b3m0(k2m0 k2m0Var, String str, boolean z) {
        this.f1915a = k2m0Var;
        this.b = str;
        this.c = z;
    }

    @Override // a.d3m0
    public final boolean a() {
        return this.c;
    }

    @Override // a.d3m0
    public final k2m0 b() {
        return this.f1915a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3m0)) {
            return false;
        }
        b3m0 b3m0Var = (b3m0) obj;
        return this.f1915a.equals(b3m0Var.f1915a) && this.b.equals(b3m0Var.b) && this.c == b3m0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f1915a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(headerUiState=");
        sb.append(this.f1915a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
