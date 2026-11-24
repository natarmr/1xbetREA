package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ouq implements ruq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f25888a;
    public final j9m0 b;
    public final boolean c;
    public final mdm d;

    public ouq(mdm mdmVar, j9m0 j9m0Var, zdm0 zdm0Var, boolean z) {
        this.f25888a = zdm0Var;
        this.b = j9m0Var;
        this.c = z;
        this.d = mdmVar;
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
        return this.f25888a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouq)) {
            return false;
        }
        ouq ouqVar = (ouq) obj;
        return this.f25888a.equals(ouqVar.f25888a) && this.b.equals(ouqVar.b) && this.c == ouqVar.c && this.d.equals(ouqVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(w6x.h(this.b, this.f25888a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Error(headerUiModel=" + this.f25888a + ", backgroundUiModel=" + this.b + ", rtlSupport=" + this.c + ", dsEmptyConfig=" + this.d + Separators.RPAREN;
    }
}
