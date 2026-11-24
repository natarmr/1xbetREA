package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tuh implements vuh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ydm0 f34550a;
    public final j9m0 b;
    public final llm0 c;
    public final boolean d;
    public final mdm e;

    public tuh(ydm0 ydm0Var, j9m0 j9m0Var, llm0 llm0Var, boolean z, mdm mdmVar) {
        this.f34550a = ydm0Var;
        this.b = j9m0Var;
        this.c = llm0Var;
        this.d = z;
        this.e = mdmVar;
    }

    @Override // a.vuh
    public final boolean a() {
        return this.d;
    }

    @Override // a.vuh
    public final j9m0 b() {
        return this.b;
    }

    @Override // a.vuh
    public final zdm0 c() {
        return this.f34550a;
    }

    @Override // a.vuh
    public final llm0 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tuh)) {
            return false;
        }
        tuh tuhVar = (tuh) obj;
        return this.f34550a.equals(tuhVar.f34550a) && this.b.equals(tuhVar.b) && this.c == tuhVar.c && this.d == tuhVar.d && this.e.equals(tuhVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e((this.c.hashCode() + w6x.h(this.b, this.f34550a.hashCode() * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(statisticHeaderUiModel=");
        sb.append(this.f34550a);
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
