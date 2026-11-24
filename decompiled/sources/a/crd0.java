package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class crd0 implements drd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f4841a;
    public final j9m0 b;
    public final boolean c;

    public crd0(j9m0 j9m0Var, zdm0 zdm0Var, boolean z) {
        this.f4841a = zdm0Var;
        this.b = j9m0Var;
        this.c = z;
    }

    @Override // a.drd0
    public final boolean a() {
        return this.c;
    }

    @Override // a.drd0
    public final j9m0 b() {
        return this.b;
    }

    @Override // a.drd0
    public final zdm0 c() {
        return this.f4841a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crd0)) {
            return false;
        }
        crd0 crd0Var = (crd0) obj;
        return this.f4841a.equals(crd0Var.f4841a) && this.b.equals(crd0Var.b) && this.c == crd0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + w6x.h(this.b, this.f4841a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(statisticHeaderUiModel=");
        sb.append(this.f4841a);
        sb.append(", statisticBackgroundUiModel=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
