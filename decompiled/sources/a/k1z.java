package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k1z implements m1z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0z f17553a;
    public final f9m0 b;
    public final boolean c;

    public k1z(t0z t0zVar, f9m0 f9m0Var, boolean z) {
        this.f17553a = t0zVar;
        this.b = f9m0Var;
        this.c = z;
    }

    @Override // a.m1z
    public final boolean a() {
        return this.c;
    }

    @Override // a.m1z
    public final t0z b() {
        return this.f17553a;
    }

    @Override // a.m1z
    public final f9m0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1z)) {
            return false;
        }
        k1z k1zVar = (k1z) obj;
        return this.f17553a.equals(k1zVar.f17553a) && this.b.equals(k1zVar.b) && this.c == k1zVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f17553a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(headerUiState=");
        sb.append(this.f17553a);
        sb.append(", appBarUiModel=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
