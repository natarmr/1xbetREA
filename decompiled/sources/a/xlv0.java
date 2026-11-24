package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xlv0 implements zlv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ydm0 f41095a;
    public final j9m0 b;
    public final llm0 c;
    public final boolean d;
    public final mdm e;

    public xlv0(ydm0 ydm0Var, j9m0 j9m0Var, llm0 llm0Var, boolean z, mdm mdmVar) {
        this.f41095a = ydm0Var;
        this.b = j9m0Var;
        this.c = llm0Var;
        this.d = z;
        this.e = mdmVar;
    }

    @Override // a.zlv0
    public final boolean a() {
        return this.d;
    }

    @Override // a.zlv0
    public final j9m0 b() {
        return this.b;
    }

    @Override // a.zlv0
    public final zdm0 c() {
        return this.f41095a;
    }

    @Override // a.zlv0
    public final llm0 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlv0)) {
            return false;
        }
        xlv0 xlv0Var = (xlv0) obj;
        return this.f41095a.equals(xlv0Var.f41095a) && this.b.equals(xlv0Var.b) && this.c == xlv0Var.c && this.d == xlv0Var.d && this.e.equals(xlv0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e((this.c.hashCode() + w6x.h(this.b, this.f41095a.hashCode() * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(statisticHeaderUiModel=");
        sb.append(this.f41095a);
        sb.append(", statisticBackgroundUiModel=");
        sb.append(this.b);
        sb.append(", screenStyle=");
        sb.append(this.c);
        sb.append(", rtlSupport=");
        sb.append(this.d);
        sb.append(", lottieConfig=");
        return cs0.m(sb, this.e, Separators.RPAREN);
    }
}
