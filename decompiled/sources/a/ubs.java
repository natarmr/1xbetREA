package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ubs implements wbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f35396a;
    public final j9m0 b;
    public final boolean c;

    public ubs(j9m0 j9m0Var, zdm0 zdm0Var, boolean z) {
        this.f35396a = zdm0Var;
        this.b = j9m0Var;
        this.c = z;
    }

    @Override // a.wbs
    public final boolean a() {
        return this.c;
    }

    @Override // a.wbs
    public final zdm0 b() {
        return this.f35396a;
    }

    @Override // a.wbs
    public final j9m0 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubs)) {
            return false;
        }
        ubs ubsVar = (ubs) obj;
        return this.f35396a.equals(ubsVar.f35396a) && this.b.equals(ubsVar.b) && this.c == ubsVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + w6x.h(this.b, this.f35396a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(headerUiState=");
        sb.append(this.f35396a);
        sb.append(", backgroundUiModel=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
