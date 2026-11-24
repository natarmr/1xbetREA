package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tbs implements wbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f33681a;
    public final j9m0 b;
    public final boolean c;
    public final mdm d;

    public tbs(mdm mdmVar, j9m0 j9m0Var, zdm0 zdm0Var, boolean z) {
        this.f33681a = zdm0Var;
        this.b = j9m0Var;
        this.c = z;
        this.d = mdmVar;
    }

    @Override // a.wbs
    public final boolean a() {
        return this.c;
    }

    @Override // a.wbs
    public final zdm0 b() {
        return this.f33681a;
    }

    @Override // a.wbs
    public final j9m0 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbs)) {
            return false;
        }
        tbs tbsVar = (tbs) obj;
        return this.f33681a.equals(tbsVar.f33681a) && this.b.equals(tbsVar.b) && this.c == tbsVar.c && this.d.equals(tbsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(w6x.h(this.b, this.f33681a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Error(headerUiState=" + this.f33681a + ", backgroundUiModel=" + this.b + ", rtlSupport=" + this.c + ", dsEmptyConfig=" + this.d + Separators.RPAREN;
    }
}
