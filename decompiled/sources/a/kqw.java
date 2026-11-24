package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kqw implements lqw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f18739a;
    public final j9m0 b;
    public final boolean c;

    public kqw(j9m0 j9m0Var, zdm0 zdm0Var, boolean z) {
        this.f18739a = zdm0Var;
        this.b = j9m0Var;
        this.c = z;
    }

    @Override // a.lqw
    public final boolean a() {
        return this.c;
    }

    @Override // a.lqw
    public final j9m0 b() {
        return this.b;
    }

    @Override // a.lqw
    public final zdm0 c() {
        return this.f18739a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqw)) {
            return false;
        }
        kqw kqwVar = (kqw) obj;
        return this.f18739a.equals(kqwVar.f18739a) && this.b.equals(kqwVar.b) && this.c == kqwVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + w6x.h(this.b, this.f18739a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(statisticHeaderUiModel=");
        sb.append(this.f18739a);
        sb.append(", statisticBackgroundUiModel=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
