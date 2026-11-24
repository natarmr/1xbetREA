package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class puq implements ruq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f27629a;
    public final j9m0 b;
    public final boolean c;

    public puq(j9m0 j9m0Var, zdm0 zdm0Var, boolean z) {
        this.f27629a = zdm0Var;
        this.b = j9m0Var;
        this.c = z;
    }

    @Override // a.ruq
    public final boolean a() {
        return this.c;
    }

    @Override // a.ruq
    public final j9m0 d() {
        return this.b;
    }

    @Override // a.ruq
    public final zdm0 e() {
        return this.f27629a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puq)) {
            return false;
        }
        puq puqVar = (puq) obj;
        return this.f27629a.equals(puqVar.f27629a) && this.b.equals(puqVar.b) && this.c == puqVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + w6x.h(this.b, this.f27629a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(headerUiModel=");
        sb.append(this.f27629a);
        sb.append(", backgroundUiModel=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
